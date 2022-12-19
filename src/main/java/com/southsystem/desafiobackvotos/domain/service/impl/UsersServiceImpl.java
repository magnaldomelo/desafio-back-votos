package com.southsystem.desafiobackvotos.domain.service.impl;

import com.southsystem.desafiobackvotos.domain.model.external.UsersEnum;
import com.southsystem.desafiobackvotos.domain.service.UsersService;
import com.southsystem.desafiobackvotos.infrastructure.api.UsersAPI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {
    private final UsersAPI usersAPI;

    @Override
    public UsersEnum validCpf(String cpf) {
        return usersAPI.validCpf(cpf);
    }
}
