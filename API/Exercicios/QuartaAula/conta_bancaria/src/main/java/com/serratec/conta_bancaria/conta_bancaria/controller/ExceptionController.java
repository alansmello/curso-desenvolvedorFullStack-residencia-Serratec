package com.serratec.conta_bancaria.conta_bancaria.controller;

import com.serratec.conta_bancaria.conta_bancaria.exception.ContaExistenteException;
import com.serratec.conta_bancaria.conta_bancaria.exception.NotFoundException;
import com.serratec.conta_bancaria.conta_bancaria.exception.OperacaoInexistenteException;
import com.serratec.conta_bancaria.conta_bancaria.exception.SaldoInsuficienteException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    
    @ExceptionHandler(ContaExistenteException.class)
    public ResponseEntity<?> ContaExistenteException(ContaExistenteException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> NotFoundException(NotFoundException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(OperacaoInexistenteException.class)
    public ResponseEntity<?> OperacaoInexistenteException(OperacaoInexistenteException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SaldoInsuficienteException.class)
    public ResponseEntity<?> SaldoInsuficienteException(SaldoInsuficienteException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }
    

}
