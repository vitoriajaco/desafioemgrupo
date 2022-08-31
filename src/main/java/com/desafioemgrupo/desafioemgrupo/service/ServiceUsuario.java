package com.desafioemgrupo.desafioemgrupo.service;

import com.desafioemgrupo.desafioemgrupo.model.ModelUsuario;
import com.desafioemgrupo.desafioemgrupo.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceUsuario {

    @Autowired
    private RepositoryUsuario repositoryUsuario;

    public List<ModelUsuario> mostrarTodosUsuarios(){
        return repositoryUsuario.findAll();
    }

    public Optional<ModelUsuario> buscarId(Long codigo){
        return repositoryUsuario.findById(codigo);
    }

    public void deletar(Long codigo){
        repositoryUsuario.deleteById(codigo);
    }


}
