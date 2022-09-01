package com.desafioemgrupo.desafioemgrupo.service;

import com.desafioemgrupo.desafioemgrupo.model.ModelUsuario;
import com.desafioemgrupo.desafioemgrupo.repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUsuario {

    @Autowired
    private RepositoryUsuario repositoryUsuario;

    public List<ModelUsuario> mostrarTodosUsuarios(){
        List<ModelUsuario> lista = repositoryUsuario.findAll();
        ModelUsuario usuario = new ModelUsuario();
        usuario.setCodigo(usuario.getCodigo());
        usuario.setNome(usuario.getNome());
        usuario.setEmail(usuario.getEmail());
        lista.add(usuario);
        return lista;

    }

    public ModelUsuario cadastrarUsuario(ModelUsuario modelUsuario){
        ModelUsuario usuario = new ModelUsuario();
        List<ModelUsuario> lista = new ArrayList<>();
        usuario.setCodigo(usuario.getCodigo());
        usuario.setNome(usuario.getNome());
        usuario.setEmail(usuario.getEmail());
        return repositoryUsuario.save(usuario);

    }

    public Optional<ModelUsuario> buscarId(Long codigo){
        return repositoryUsuario.findById(codigo);
    }

    public ModelUsuario alterar (ModelUsuario modelUsuario){
        modelUsuario.getCodigo();
        return repositoryUsuario.save(modelUsuario);
    }

    public void deletar(Long codigo){
        repositoryUsuario.deleteById(codigo);
    }


}
