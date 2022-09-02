package com.desafioemgrupo.desafioemgrupo.service;

import com.desafioemgrupo.desafioemgrupo.enun.Status;
import com.desafioemgrupo.desafioemgrupo.model.RespostaModel;
import com.desafioemgrupo.desafioemgrupo.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    RespostaRepository respostaRepository;

    public RespostaModel cadastrar(RespostaModel respostaModel) {
        respostaModel.setDataCriacao(LocalDate.now(ZoneId.of("UTC-03:00")));
        return respostaRepository.save(respostaModel);
    }

    public RespostaModel alterar(Long id, RespostaModel respostaModel) {
Optional<RespostaModel> optionalRespostaModel = respostaRepository.findById(id);
        if (optionalRespostaModel.isEmpty()) {
            throw new RuntimeException("este registro não existe");
        }
        RespostaModel respostaEncontrada = optionalRespostaModel.get();
        if (optionalRespostaModel.isPresent()) {
        String mensagemInformada = respostaModel.getMensagem();
        respostaEncontrada.setMensagem(mensagemInformada);
        Status statusInformado = respostaModel.getStatus();
        respostaEncontrada.setStatus(statusInformado);
        }
        return respostaRepository.save(respostaEncontrada);
    }

    public Optional<RespostaModel> buscarPorId(Long id) {
        return respostaRepository.findById(id);
    }

    public List<RespostaModel> buscartodas() {
        return respostaRepository.findAll();
    }

    public List<RespostaModel> findByStatus(Status status) {
        return respostaRepository.findByStatus(status);
    }

    public void deletar(Long id) {
        respostaRepository.deleteById(id);
    }
}
