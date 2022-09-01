package com.desafioemgrupo.desafioemgrupo.controller;

import com.desafioemgrupo.desafioemgrupo.model.ModelUsuario;
import com.desafioemgrupo.desafioemgrupo.repository.RepositoryUsuario;
import com.desafioemgrupo.desafioemgrupo.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path= "/usuario/{codigo}")
    public ResponseEntity<ModelUsuario> cadastrarUsuario (@RequestBody ModelUsuario modelUsuario){
        ModelUsuario modelusuario = serviceUsuario.cadastrarUsuario(modelUsuario);
        return ResponseEntity.ok(modelUsuario);
    }

    @PutMapping(path = "/usuario/{codigo}")
    public ResponseEntity<ModelUsuario> alterar(@RequestBody ModelUsuario modelUsuario, @PathVariable Long codigo){
        return ResponseEntity.ok(serviceUsuario.alterar(modelUsuario));
    }


    @DeleteMapping(path = "/usuario/{codigo}")
    public void deletarUsuario (@PathVariable Long codigo){
        serviceUsuario.deletar(codigo);
    }
}
