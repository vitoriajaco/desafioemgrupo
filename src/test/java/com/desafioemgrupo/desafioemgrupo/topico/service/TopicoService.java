package com.desafioemgrupo.desafioemgrupo.topico.service;

import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import com.desafioemgrupo.desafioemgrupo.topico.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public Object cadastrar(TopicoModel topicoModel) {
        return topicoRepository.findAll ();
    }
    public List<TopicoModel> buscarTodas(TopicoModel topicoModel) {
        return topicoRepository.findAll ();
    }
    public Object alterar(TopicoModel topicoModel) {
        return topicoRepository.findAll ();
    }
    public Optional<TopicoModel> buscarId(Long id) {
        return topicoRepository.findById (id);
    }

    public void deletar(Long id) {
    }
}
