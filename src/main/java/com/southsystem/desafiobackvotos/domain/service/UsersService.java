package com.southsystem.desafiobackvotos.domain.service;

import com.southsystem.desafiobackvotos.domain.model.external.UsersEnum;

public interface UsersService {
    UsersEnum validCpf(String cpf);
}
