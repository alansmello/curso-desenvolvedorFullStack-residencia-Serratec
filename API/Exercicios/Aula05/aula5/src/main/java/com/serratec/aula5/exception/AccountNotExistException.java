package com.serratec.aula5.exception;

public class AccountNotExistException extends Exception {

    private String message;


    public AccountNotExistException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    
}
