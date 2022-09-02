package com.desafioemgrupo.desafioemgrupo.topico.controller;


import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import com.desafioemgrupo.desafioemgrupo.topico.service.TopicoService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@NoArgsConstructor
@RestController
@RequestMapping( path = "/topico" )
public class TopicoController {

    @Autowired
    private TopicoService topicosService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> cadastrar(@RequestBody TopicoModel topicoModel) {
        return ResponseEntity.ok(topicosService.cadastrar (topicoModel));
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> alterar(@RequestBody TopicoModel topicoModel) {
        return ResponseEntity.ok(topicosService.alterar(topicoModel));
    }

    @GetMapping(path = "/{id}")
    public Optional<TopicoModel> buscarPorId(@PathVariable Long id) {
        return topicosService.buscarId (id);
    }
    @GetMapping
    public ResponseEntity<Object> buscarTodos() {
        return ResponseEntity.ok(topicosService.buscarTodos());
    }
    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        topicosService.deletar(id);
    }
}
