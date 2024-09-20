package com.api.contato.infra;

import com.api.contato.exception.BlankFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BlankFieldException.class)
    private ResponseEntity<String> blackFieldException(BlankFieldException exception){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("preencha todos os campos!");
    }


}
