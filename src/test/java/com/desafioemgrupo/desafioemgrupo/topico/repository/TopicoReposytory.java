package com.desafioemgrupo.desafioemgrupo.topico.repository;

import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicoReposytory extends JpaRepository<TopicoModel, Long> {

    List<TopicoModel> findByStatus(TopicoModel topicoModel);
}
