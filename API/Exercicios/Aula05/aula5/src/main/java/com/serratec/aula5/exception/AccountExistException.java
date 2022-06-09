package com.serratec.aula5.exception;

public class AccountExistException extends Exception{
    
    private String message;


    public AccountExistException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
