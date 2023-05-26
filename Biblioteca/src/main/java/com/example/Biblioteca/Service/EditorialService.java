package com.example.Biblioteca.Service;

import com.example.Biblioteca.Entity.Editorial;
import com.example.Biblioteca.Repository.EditorialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    public void crearEditorial(String nombre){

        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);

        editorialRepository.save(editorial);
    }

    public List<Editorial> listarEditoriales(){

        List<Editorial> editoriales = new ArrayList<>();

        editoriales = editorialRepository.findAll();

        return editoriales;
    }

    public void modificarEditorial(Long id, String nombre){

        Optional<Editorial> respuesta = editorialRepository.findById(id);

        if(respuesta.isPresent()){
            Editorial editorial = respuesta.get();

            editorial.setNombre(nombre);

            editorialRepository.save(editorial);
        }
    }
}
