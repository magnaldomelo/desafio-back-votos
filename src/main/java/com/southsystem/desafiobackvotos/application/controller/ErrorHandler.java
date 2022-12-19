package com.southsystem.desafiobackvotos.application.controller;

import com.southsystem.desafiobackvotos.domain.model.internal.DesafioBackVotosExceptionResponse;
import com.southsystem.desafiobackvotos.domain.model.internal.enums.DesafioBackVotosContextResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.ResponseEntity.status;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<DesafioBackVotosExceptionResponse> handleUnexpectedException(final Exception e) {
        log.error(e.getMessage(), e);
        return status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                DesafioBackVotosExceptionResponse.builder()
                        .code(DesafioBackVotosContextResultCodeEnum.INTERNAL_ERROR)
                        .message(e.getMessage())
                        .build());
    }
}
