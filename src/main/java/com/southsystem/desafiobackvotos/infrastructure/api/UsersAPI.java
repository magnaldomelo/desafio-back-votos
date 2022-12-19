package com.southsystem.desafiobackvotos.infrastructure.api;

import com.southsystem.desafiobackvotos.domain.model.external.UsersEnum;
import com.southsystem.desafiobackvotos.infrastructure.api.pool.UsersApiPool;
import com.southsystem.desafiobackvotos.infrastructure.enums.IntegrationTypeEnum;
import com.southsystem.desafiobackvotos.infrastructure.exception.IntegrationException;
import com.southsystem.desafiobackvotos.infrastructure.exception.UsersException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.southsystem.desafiobackvotos.infrastructure.util.ExceptionUtils.getHttpStatus;
import static com.southsystem.desafiobackvotos.infrastructure.util.ExceptionUtils.handleExceptionMessage;

@FeignClient(value = "usersservice-api", url = "${application.usersservice.url}", configuration = {
        UsersAPI.UserDecoder.class, UsersApiPool.class
})
public interface UsersAPI {

    @GetMapping(value ="/users/{cpf}")
    UsersEnum validCpf(@PathVariable("cpf") String cpf);
    class UserDecoder implements ErrorDecoder {

        @Override
        public IntegrationException decode(String methodKey, Response response) {
            final HttpStatus statusCode = getHttpStatus(response);
            final String message = handleExceptionMessage(IntegrationTypeEnum.USERS_SERVICE, methodKey, statusCode, response);

            throw new UsersException(message, statusCode);
        }
    }
}
