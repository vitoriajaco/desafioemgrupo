package com.desafioemgrupo.desafioemgrupo.model;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import lombok.Getter;

@Getter
public class RespostaEntradaDTO {
    private Long idResposta;
    private String mensagem;
    private Status status;

    public RespostaModel transformaParaObjeto() {
        return new RespostaModel(idResposta, mensagem, status);
    }
}
