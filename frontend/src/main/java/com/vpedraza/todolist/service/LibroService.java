package com.vpedraza.todolist.service;

import com.vpedraza.todolist.model.Libro;
import com.vpedraza.todolist.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro findById(Long id) {

        return libroRepository.findById(id).orElse(null);

    }
}
