package com.desafioemgrupo.desafioemgrupo.topico.controller;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import com.desafioemgrupo.desafioemgrupo.model.RespostaEntradaDTO;
import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import com.desafioemgrupo.desafioemgrupo.service.RespostaService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping(path = "/resposta")
public class RepsotaController {

    @Autowired
    private RespostaService respostaService;


    @PostMapping
    public ResponseEntity<RespostaModel> registrarResposta(@RequestBody RespostaEntradaDTO respostaEntradaDTO) {
        RespostaModel respostaModel = respostaService.cadastrar(respostaEntradaDTO.transformaParaObjeto());
        return new ResponseEntity<>(respostaModel, HttpStatus.CREATED);
    }
    @GetMapping(path = "/status/{status}")
    public ResponseEntity<List<RespostaModel>> findByStatus(@PathVariable Status status) {
        return ResponseEntity.ok(respostaService.findByStatus(status));
    }

    @GetMapping
    public ResponseEntity<List<RespostaModel>> buscarTodas() {
        return ResponseEntity.ok(respostaService.buscartodas());
    }

    @GetMapping(path = "/{idResposta}")
    ResponseEntity<Optional<RespostaModel>> buscarPorId(@PathVariable Long idResposta) {
        return ResponseEntity.ok(respostaService.buscarPorId(idResposta));
    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<RespostaModel> alterarResposta(@PathVariable Long id, @RequestBody RespostaModel respostaModel) {
        return ResponseEntity.ok(respostaService.alterar(id, respostaModel));
    }

    @DeleteMapping("/{idResposta}")
    public void deletarResposta(@PathVariable Long id) {
        respostaService.deletar(id);
    }

}
