package com.serratec.conta_bancaria.conta_bancaria.service;

import java.util.ArrayList;
import java.util.List;

import com.serratec.conta_bancaria.conta_bancaria.exception.ContaExistenteException;
import com.serratec.conta_bancaria.conta_bancaria.exception.NotFoundException;
import com.serratec.conta_bancaria.conta_bancaria.exception.OperacaoInexistenteException;
import com.serratec.conta_bancaria.conta_bancaria.exception.SaldoInsuficienteException;
import com.serratec.conta_bancaria.conta_bancaria.model.Conta;

import org.springframework.stereotype.Service;

@Service
public class ContaService {

    List<Conta> listaContas = new ArrayList<>();

    public void verificarContaExiste(Conta conta) throws ContaExistenteException {
		for (Conta oldConta : listaContas) {
			if(conta.getNumero().equals(oldConta.getNumero())) {
				throw new ContaExistenteException("Conta existe");
			}
		}
	}


    public void inserirConta(Conta novaConta) throws ContaExistenteException{
        verificarContaExiste(novaConta);
        
        listaContas.add(novaConta); 
    }

    public List<Conta> listarContas(){
        return listaContas;
    }

    public Conta listarPorNum( String numero) throws NotFoundException{
        for(Conta conta: listaContas){
            if(conta.getNumero().equals(numero)){
                return conta;
            }
            
        }
        throw new NotFoundException("Conta não existe.") ;
    }

    public Conta atualizaConta(String numero, Conta conta) throws NotFoundException, ContaExistenteException{
            
            for(Conta old: listaContas){
                if(old.getNumero().equals(numero)){
                    if(conta.getTitular()!= null){
                        old.setTitular(conta.getTitular());
                    }if(conta.getNumero() != null){
                        verificarContaExiste(conta);
                        old.setNumero(conta.getNumero());
                    }
                
                    return old;
                }
                
            }
        
        throw new NotFoundException("Conta não existe.");
    }

    public void deletarConta(String numero) throws NotFoundException{
        Conta contaDeletada = null;
        for(Conta conta: listaContas){
            if(conta.getNumero().equals(numero)){
                contaDeletada = conta;
                break;
            }
        }
        if(contaDeletada == null){
            throw new NotFoundException("Conta não existe.");
        }

        listaContas.remove(contaDeletada);
    }

    public Conta operacao(String numero, Integer operacao, Double valor) throws SaldoInsuficienteException, OperacaoInexistenteException, NotFoundException{
        for (Conta conta: listaContas){
            if(conta.getNumero().equals(numero)){
                if(operacao == 1){
                    if(valor <= conta.getSaldo()){
                        conta.sacar(valor);
                       return conta;
                    }
                    throw new SaldoInsuficienteException("saldo Insuficiente.");
                }if(operacao == 2){
                    conta.depositar(valor);
                   return conta;
                }

                throw new OperacaoInexistenteException("Operação não existe.");
            }
        }
        throw new NotFoundException("Conta não existe.");
    }
}
