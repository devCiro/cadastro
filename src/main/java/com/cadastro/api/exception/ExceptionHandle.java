package com.cadastro.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(UsuarioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ResponseError> usuarioException(UsuarioException ex) {
        ResponseError responseError = new ResponseError();
        responseError.setCode(HttpStatus.BAD_REQUEST.value());
        responseError.setDescription("Usuario não encontrada para o id do candidato");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
    }
}
