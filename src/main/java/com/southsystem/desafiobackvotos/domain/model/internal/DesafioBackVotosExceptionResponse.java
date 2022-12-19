package com.southsystem.desafiobackvotos.domain.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.southsystem.desafiobackvotos.domain.model.internal.enums.DesafioBackVotosContextResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DesafioBackVotosExceptionResponse {

    private DesafioBackVotosContextResultCodeEnum code;
    private String message;
}
