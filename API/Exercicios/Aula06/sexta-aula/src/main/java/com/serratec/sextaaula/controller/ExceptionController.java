package com.serratec.sextaaula.controller;

import com.serratec.sextaaula.exception.NotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFoundException(NotFoundException e){
        HttpHeaders headers = new HttpHeaders();
        headers.add("erro", e.getMessage());
        return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
    }
}
