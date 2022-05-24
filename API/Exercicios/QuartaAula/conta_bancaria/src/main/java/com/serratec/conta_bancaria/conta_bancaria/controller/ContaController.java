package com.serratec.conta_bancaria.conta_bancaria.controller;


import java.util.List;

import com.serratec.conta_bancaria.conta_bancaria.exception.ContaExistenteException;

import com.serratec.conta_bancaria.conta_bancaria.exception.NotFoundException;
import com.serratec.conta_bancaria.conta_bancaria.exception.OperacaoInexistenteException;
import com.serratec.conta_bancaria.conta_bancaria.exception.SaldoInsuficienteException;
import com.serratec.conta_bancaria.conta_bancaria.model.Conta;
import com.serratec.conta_bancaria.conta_bancaria.service.ContaService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {
    
    @Autowired
    private ContaService service;

    @GetMapping
    public ResponseEntity<List<Conta>> getContas(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Lista de Contas", "Segue a Lista de Contas");
        return  new ResponseEntity<List<Conta>>(service.listarContas(), headers,HttpStatus.valueOf(202));       
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Conta> getAccountByNumber(@PathVariable String numero) throws NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Conta Solicitada", "Segue conta solicitada");
        return new ResponseEntity<Conta>(service.listarPorNum(numero), headers, HttpStatus.valueOf(202));
    }

    @PostMapping
    public ResponseEntity<String> createAccount(@RequestBody Conta novaConta) throws ContaExistenteException{
        service.inserirConta(novaConta);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Criar Conta", "Criada com sucesso");
        return new ResponseEntity<String>("Criado", headers, HttpStatus.CREATED);
    }

    @PutMapping("/{numero}")
    public ResponseEntity<Conta> updateAccount(@RequestBody Conta conta, @PathVariable String numero) throws NotFoundException, ContaExistenteException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Atualizar Conta", "Conta atualizada");
        return new ResponseEntity<Conta>(service.atualizaConta(numero, conta), headers, HttpStatus.valueOf(202));
    }

    @DeleteMapping("/{numero}")
    public ResponseEntity<String> deleteAccount(@PathVariable String numero) throws NotFoundException{
        service.deletarConta(numero);
        HttpHeaders headers = new HttpHeaders();
        headers.add("deletar Conta", "conta deletada com sucesso");
        return new ResponseEntity<String>(headers, HttpStatus.OK);   
    }

    @PostMapping("/{numero}/{operacao}")
    public ResponseEntity<Conta> postOperacao(@PathVariable String numero, @PathVariable Integer operacao, @RequestBody Double valor) throws SaldoInsuficienteException, OperacaoInexistenteException, NotFoundException{
        HttpHeaders headers = new HttpHeaders();
        headers.add("Realizar Operacao", "Operacao relizada com sucesso");
        return new ResponseEntity<Conta>(service.operacao(numero, operacao, valor), headers, HttpStatus.ACCEPTED);
    }
   
}
