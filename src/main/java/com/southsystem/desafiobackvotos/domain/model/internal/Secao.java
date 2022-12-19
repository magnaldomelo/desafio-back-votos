package com.southsystem.desafiobackvotos.domain.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(schema = "secao")
public class Secao implements Serializable {

    private static final long serialVersionUID = -6112296891617717682L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean ativa;

    @Column
    private LocalDateTime horaAbertura;

    @Column
    private Integer tempoDuracao;
}
