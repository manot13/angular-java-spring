package com.nathan.bookstore.services;

import com.nathan.bookstore.domain.Categoria;
import com.nathan.bookstore.exceptions.ObjectNoFoundException;
import com.nathan.bookstore.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Long id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNoFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}
