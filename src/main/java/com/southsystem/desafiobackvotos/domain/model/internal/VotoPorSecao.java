package com.southsystem.desafiobackvotos.domain.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(schema = "voto_secao")
public class VotoPorSecao implements Serializable {

    private static final long serialVersionUID = -6560130439364726739L;

    //TODO - Verificar redundância do unique
    @Id
    @Column(unique = true)
    private ChaveVotaSecaoId id;
}
