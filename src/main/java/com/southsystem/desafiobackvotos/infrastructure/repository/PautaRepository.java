package com.southsystem.desafiobackvotos.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.southsystem.desafiobackvotos.domain.model.internal.Pauta;

public class PautaRepository extends JpaRepository<Pauta, Long> {
}
