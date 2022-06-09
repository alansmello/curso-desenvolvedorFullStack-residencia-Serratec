package com.serratec.conta_bancaria.conta_bancaria.exception;

public class OperacaoInexistenteException extends Exception{
    
    private String message;


    public OperacaoInexistenteException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
