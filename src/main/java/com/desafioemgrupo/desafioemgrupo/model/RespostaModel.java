package com.desafioemgrupo.desafioemgrupo.model;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "resposta")
public class RespostaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResposta;
    private String mensagem;
    private LocalDate dataCriacao;
    Boolean solucao = false;
    @Enumerated(value = EnumType.STRING)
    Status status;

    public RespostaModel(Long idResposta, String mensagem, Status status) {
        this.idResposta = idResposta;
        this.mensagem = mensagem;
        this.status = status;
    }

    public RespostaModel() {
    }
}
