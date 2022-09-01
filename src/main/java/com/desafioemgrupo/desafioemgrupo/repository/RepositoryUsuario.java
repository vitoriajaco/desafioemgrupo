package com.desafioemgrupo.desafioemgrupo.repository;

import com.desafioemgrupo.desafioemgrupo.model.ModelUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<ModelUsuario, Long> {

}
