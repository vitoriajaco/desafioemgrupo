package com.desafioemgrupo.desafioemgrupo.controller;

import com.desafioemgrupo.desafioemgrupo.model.ModelUsuario;
import com.desafioemgrupo.desafioemgrupo.repository.RepositoryUsuario;
import com.desafioemgrupo.desafioemgrupo.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerUsuario {

    @Autowired
    private ServiceUsuario serviceUsuario;

    @GetMapping(path = "/usuario")
    public List<ModelUsuario> mostrarTodosUsuarios(){
        return serviceUsuario.mostrarTodosUsuarios();
    }

    @GetMapping(path = "/usuarios/{codigo}")
    public Optional<ModelUsuario>buscarId(@PathVariable Long codigo){
        return serviceUsuario.buscarId(codigo);
    }

    @DeleteMapping(path = "/usuario/{codigo}")
    public void deletarUsuario (@PathVariable Long codigo){
        serviceUsuario.deletar(codigo);
    }
}
