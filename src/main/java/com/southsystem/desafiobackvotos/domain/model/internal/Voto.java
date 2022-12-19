package com.southsystem.desafiobackvotos.domain.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.southsystem.desafiobackvotos.domain.model.internal.enums.OpcaoVoto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(schema = "voto")
public class Voto implements Serializable {

    private static final long serialVersionUID = 4788355832087746407L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pauta_id")
    private Pauta pauta;

    @Column(nullable = false, updatable = false)
    private OpcaoVoto opcaoVoto;
}
