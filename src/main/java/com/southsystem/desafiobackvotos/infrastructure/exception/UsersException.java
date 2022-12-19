package com.southsystem.desafiobackvotos.infrastructure.exception;

import org.springframework.http.HttpStatus;

public class UsersException extends IntegrationException{

    private static final long serialVersionUID = -2018438001369641845L;

    public UsersException(String message, HttpStatus statusCode){
        super(message, statusCode);
    }
}
