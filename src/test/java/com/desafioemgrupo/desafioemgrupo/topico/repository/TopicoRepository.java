package com.desafioemgrupo.desafioemgrupo.topico.repository;

import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<TopicoModel, Long> {

    List<TopicoModel> findByStatus(TopicoModel topicoModel);
}
