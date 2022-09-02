package com.desafioemgrupo.desafioemgrupo.topico.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "topico")
@AllArgsConstructor
@NoArgsConstructor
public class TopicoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titulo;
    @Column
    private String mensagem;
    @Column
    private String dataCriacao;


}