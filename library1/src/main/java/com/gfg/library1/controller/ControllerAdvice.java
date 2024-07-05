package com.gfg.library1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice  {

    @ExceptionHandler
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        List<FieldError> list = e.getBindingResult().getFieldErrors();
        Map<String,String> map = new HashMap<>();
        for(FieldError f:list) {
            map.put(f.getField(), f.getDefaultMessage());
        }
        return  new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
