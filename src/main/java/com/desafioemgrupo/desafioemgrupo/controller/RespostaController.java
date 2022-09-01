package com.desafioemgrupo.desafioemgrupo.controller;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import com.desafioemgrupo.desafioemgrupo.model.RespostaEntradaDTO;
import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import com.desafioemgrupo.desafioemgrupo.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/resposta")
public class RespostaController {
    @Autowired
    private RespostaService respostaService;


    @PostMapping
    public ResponseEntity<RespostaModel> registrarResposta(@RequestBody RespostaEntradaDTO respostaEntradaDTO) {
        RespostaModel respostaModel = respostaService.cadastrar(respostaEntradaDTO.transformaParaObjeto());
        return new ResponseEntity<>(respostaModel, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RespostaModel>> buscarTodas() {
        return ResponseEntity.ok(respostaService.buscartodas());
    }

    @GetMapping(path = "/{idResposta}")
    ResponseEntity<Optional<RespostaModel>> buscarPorId(@PathVariable Long idResposta) {
        return ResponseEntity.ok(respostaService.buscarPorId(idResposta));
    }

    @GetMapping(path = "/status/{status}")
    public ResponseEntity<Object> findByStatus(@PathVariable Status status) {
        return ResponseEntity.ok(respostaService.findByStatus(status));
    }

    @PutMapping(path = "/{idResposta}")
    public ResponseEntity<RespostaModel> alterarResposta(@RequestBody RespostaModel respostaModel, @PathVariable long idResposta) {
        return ResponseEntity.ok(respostaService.alterar(respostaModel, idResposta));
    }

    @DeleteMapping("/{idResposta}")
    public void deletarResposta(@PathVariable Long id) {
        respostaService.deletar(id);
    }
}
