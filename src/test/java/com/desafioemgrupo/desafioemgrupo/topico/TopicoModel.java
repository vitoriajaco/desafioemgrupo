package com.desafioemgrupo.desafioemgrupo.topico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Getter
@Table(name = "Topico")
@AllArgsConstructor
@NoArgsConstructor
public class TopicoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column
    private String titulo;
    @Column
    private String mensagem;
    @Column
    private String dataCriacao;


}