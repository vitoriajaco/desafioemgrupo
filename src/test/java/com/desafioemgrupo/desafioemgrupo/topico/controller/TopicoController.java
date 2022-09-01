package com.desafioemgrupo.desafioemgrupo.topico.controller;


import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import com.desafioemgrupo.desafioemgrupo.topico.service.TopicoService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@NoArgsConstructor
@RestController
@RequestMapping( path = "/topico" )
public class TopicoController {

        @Autowired
        private TopicoService topicosService ;

    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return ResponseEntity.ok(TopicoService.buscarTodos());
    }

    @GetMapping(path = "/{id}")
    public Optional<TopicoModel> buscarPorId(@PathVariable Long id) {
        return topicosService.buscarId (id);

    }

}
