package com.desafioemgrupo.desafioemgrupo.model;

import com.desafioemgrupo.desafioemgrupo.enums.EnumCategorias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "curso")
public class ModelCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private EnumCategorias categorias;
}
