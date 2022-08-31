package com.desafioemgrupo.desafioemgrupo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Usuario")
@NoArgsConstructor
public class ModelUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String senha;
}
