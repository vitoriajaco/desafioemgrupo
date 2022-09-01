package com.desafioemgrupo.desafioemgrupo.repository;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaModel, Long>{
    List<RespostaModel> findByStatus(Status status);

}
