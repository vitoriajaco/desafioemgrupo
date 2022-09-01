package com.desafioemgrupo.desafioemgrupo.repository;

import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaModel, Long> {


}
