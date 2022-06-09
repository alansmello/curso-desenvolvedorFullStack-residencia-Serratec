package com.serratec.aula5.controller;

import com.serratec.aula5.exception.AccountExistException;
import com.serratec.aula5.exception.AccountNotExistException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerException {
    
    @ExceptionHandler(AccountExistException.class)
    public ResponseEntity<?> accountExistException(AccountExistException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AccountNotExistException.class)
    public ResponseEntity<?> accountNotExistException(AccountNotExistException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }
}
