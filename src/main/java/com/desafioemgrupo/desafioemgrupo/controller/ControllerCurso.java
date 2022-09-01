package com.desafioemgrupo.desafioemgrupo.controller;

import com.desafioemgrupo.desafioemgrupo.enums.EnumCategorias;
import com.desafioemgrupo.desafioemgrupo.model.ModelCurso;
import com.desafioemgrupo.desafioemgrupo.service.ServiceCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cursos")
public class ControllerCurso {
    @Autowired
    private ServiceCurso serviceCurso;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> cadastrar(@RequestBody ModelCurso modelCurso) {
        return ResponseEntity.ok(serviceCurso.cadastrar(modelCurso));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ModelCurso> alterar(@RequestBody ModelCurso modelCurso) {
        return ResponseEntity.ok(serviceCurso.alterar(modelCurso));
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        serviceCurso.deletar(id);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<ModelCurso> buscarPorID(@PathVariable Long id) {
        return ResponseEntity.ok(serviceCurso.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<ModelCurso>> buscarTodos() {
        return ResponseEntity.ok(serviceCurso.buscarTodos());
    }

    @GetMapping(path = "/categorias/{categorias}")
    public ResponseEntity<List<ModelCurso>> findByTipoContas(@PathVariable EnumCategorias categorias) {
        return ResponseEntity.ok(serviceCurso.findByTipoContas(categorias));
    }
}
