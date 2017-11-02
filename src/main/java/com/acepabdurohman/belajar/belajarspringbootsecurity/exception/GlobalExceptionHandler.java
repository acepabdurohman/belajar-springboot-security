package com.acepabdurohman.belajar.belajarspringbootsecurity.exception;

import com.acepabdurohman.belajar.belajarspringbootsecurity.util.ResponseTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {DataIsNotExists.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseTemplate handleDataIsNotExist(Exception e){
        return new ResponseTemplate(404, "Data tidak ditemukan");
    }
}
