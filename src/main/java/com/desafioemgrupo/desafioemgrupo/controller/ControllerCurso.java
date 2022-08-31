package com.desafioemgrupo.desafioemgrupo.controller;

import com.desafioemgrupo.desafioemgrupo.enums.EnumCategorias;
import com.desafioemgrupo.desafioemgrupo.model.ModelCurso;
import com.desafioemgrupo.desafioemgrupo.service.ServiceCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cursos")
public class ControllerCurso {
    @Autowired
    private ServiceCurso serviceCurso;

    @GetMapping(path = "/{id}")
    public ResponseEntity<ModelCurso> buscarPorID(@PathVariable Long id) {
        return ResponseEntity.ok(serviceCurso.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<ModelCurso>> buscarTodos() {
        return ResponseEntity.ok(serviceCurso.buscarTodos());
    }

    @GetMapping(path = "/categorias/{categoria}")
    public ResponseEntity<List<ModelCurso>> findByTipoContas(@PathVariable EnumCategorias categorias) {
        return ResponseEntity.ok(serviceCurso.findByTipoContas(categorias));
    }
}
