package com.southsystem.desafiobackvotos.domain.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(schema = "pauta")
public class Pauta implements Serializable {

    private static final long serialVersionUID = -6452029997815752786L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "voto", fetch = FetchType.LAZY)
    private List<Voto> votos;

    @OneToOne(cascade= CascadeType.ALL)
    private Secao secao;
}
