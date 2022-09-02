package com.desafioemgrupo.desafioemgrupo.topico.model;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import lombok.*;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@Table(name = "/resposta")
class RespostaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResposta;
    private String titulo;
    private String mensagem;
    private LocalDate dataCriacao;
    @Enumerated(value = EnumType.STRING)
    Status status;

    public RespostaModel(Long idResposta,String titulo, String mensagem, LocalDate dataCriacao, Status status) {
        this.idResposta = idResposta;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }
    public RespostaModel() {
    }
}
