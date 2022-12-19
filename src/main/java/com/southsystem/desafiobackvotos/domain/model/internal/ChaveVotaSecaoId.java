package com.southsystem.desafiobackvotos.domain.model.internal;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ChaveVotaSecaoId implements Serializable {

    private static final long serialVersionUID = 8514732810599915138L;

    @OneToOne
    @JoinColumn(name = "votoId", referencedColumnName = "votoId")
    private Voto votoId;

    @OneToOne
    @JoinColumn(name = "secaoId", referencedColumnName = "secaoId")
    private Secao secaoId;
}
