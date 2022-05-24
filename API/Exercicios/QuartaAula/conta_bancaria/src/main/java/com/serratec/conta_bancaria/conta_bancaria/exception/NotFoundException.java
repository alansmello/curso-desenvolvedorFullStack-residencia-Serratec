package com.serratec.conta_bancaria.conta_bancaria.exception;

public class NotFoundException extends Exception {
    private String message;


    public NotFoundException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
