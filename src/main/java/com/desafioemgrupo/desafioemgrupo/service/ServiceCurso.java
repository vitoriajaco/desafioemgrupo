package com.desafioemgrupo.desafioemgrupo.service;

import com.desafioemgrupo.desafioemgrupo.enums.EnumCategorias;
import com.desafioemgrupo.desafioemgrupo.model.ModelCurso;
import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import com.desafioemgrupo.desafioemgrupo.repository.RepositoryCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class ServiceCurso {
    //git
    @Autowired
    private RepositoryCurso repositoryCurso;

    public ModelCurso cadastrar(ModelCurso modelCurso) {
        return repositoryCurso.save(modelCurso);
    }

    public ModelCurso alterar(ModelCurso modelCurso) {
        return repositoryCurso.save(modelCurso);
    }

    public void deletar(Long id) {
        repositoryCurso.deleteById(id);
    }



    public ModelCurso buscarPorId(Long id) {
        return repositoryCurso.findById(id).orElseThrow(
                () -> new EntityNotFoundException("ID not found "+ id));
    }

    public List<ModelCurso> buscarTodos() {
        return repositoryCurso.findAll();
    }

    public List<ModelCurso> findByTipoContas(EnumCategorias catergoria) {
        return repositoryCurso.findByCategorias(catergoria);
    }
}
