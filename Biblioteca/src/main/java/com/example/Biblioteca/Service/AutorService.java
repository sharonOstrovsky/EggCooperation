package com.example.Biblioteca.Service;

import com.example.Biblioteca.Entity.Autor;
import com.example.Biblioteca.Repository.AutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Transactional
    public void crearAutor(String nombre){

        Autor autor = new Autor();
        autor.setNombre(nombre);

        autorRepository.save(autor);
    }

    public List<Autor> listarAutores(){

        List<Autor> autores = new ArrayList<>();

        autores = autorRepository.findAll();

        return autores;
    }

    public void modificarAutor(String nombre, Long id){

        Optional<Autor> respuesta = autorRepository.findById(id);

        if(respuesta.isPresent()){
            Autor autor = respuesta.get();

            autor.setNombre(nombre);

            autorRepository.save(autor);
        }
    }
}
