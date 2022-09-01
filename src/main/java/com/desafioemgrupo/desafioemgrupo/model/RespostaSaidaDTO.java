package com.desafioemgrupo.desafioemgrupo.model;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class RespostaSaidaDTO {
private Long idResposta;
    private String mensagem;
    private LocalDate dataCriacao;
    private Status status;

    public RespostaSaidaDTO(RespostaModel model) {
        this.idResposta = model.getIdResposta();
        this.mensagem = model.getMensagem();
        this.dataCriacao = model.getDataCriacao();
        this.status = model.getStatus();
    }
}
