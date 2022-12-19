package com.southsystem.desafiobackvotos.infrastructure.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class IntegrationException extends RuntimeException{

    private static final long serialVersionUID = 3669724314771596362L;

    @Getter
    private HttpStatus httpStatus;

    public IntegrationException() {
        super();
    }

    public IntegrationException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
