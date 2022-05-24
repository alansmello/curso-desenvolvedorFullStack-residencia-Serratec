package com.serratec.conta_bancaria.conta_bancaria.model;

import javafx.beans.binding.StringBinding;

public class Conta {
    private String numero;
    private String titular;
    private double saldo;


    public Conta() {
    }

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        
    }
    //operaçao debito
    public void sacar(double valor){
        this.saldo -= valor;
    }

    //operação credito
    public void depositar(double valor){
        this.saldo+= valor;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

   

}
