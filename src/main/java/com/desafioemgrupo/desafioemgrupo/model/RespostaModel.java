package com.desafioemgrupo.desafioemgrupo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class RespostaModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long codigo;
     private String mensagem;
     private LocalDate dataCriacao;
     Boolean solucao = false;

}
