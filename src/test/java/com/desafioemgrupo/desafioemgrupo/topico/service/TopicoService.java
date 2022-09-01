package com.desafioemgrupo.desafioemgrupo.topico.service;

import com.desafioemgrupo.desafioemgrupo.topico.model.TopicoModel;
import com.desafioemgrupo.desafioemgrupo.topico.repository.TopicoReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoReposytory topicoRepository;

    public static Object buscarTodos() {
        return buscarTodos ();
    }

    public List<TopicoModel> buscarTodas() {
        return topicoRepository.findAll ();
    }

    public Optional<TopicoModel> buscarId(Long id) {
        return topicoRepository.findById (id);
    }


}
