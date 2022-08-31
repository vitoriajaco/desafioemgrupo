package com.desafioemgrupo.desafioemgrupo.repository;

import com.desafioemgrupo.desafioemgrupo.enums.EnumCategorias;
import com.desafioemgrupo.desafioemgrupo.model.ModelCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryCurso extends JpaRepository<ModelCurso, Long> {
    public List<ModelCurso> findByCategorias(EnumCategorias categorias);
}
