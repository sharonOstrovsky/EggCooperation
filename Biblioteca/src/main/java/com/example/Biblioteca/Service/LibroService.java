package com.example.Biblioteca.Service;

import com.example.Biblioteca.Entity.Autor;
import com.example.Biblioteca.Entity.Editorial;
import com.example.Biblioteca.Entity.Libro;
import com.example.Biblioteca.Exception.MyException;
import com.example.Biblioteca.Repository.AutorRepository;
import com.example.Biblioteca.Repository.EditorialRepository;
import com.example.Biblioteca.Repository.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    public void crearLibro(String titulo, Integer ejemplares, Long idAutor, Long idEditorial) throws MyException{

        validar(titulo,ejemplares,idAutor,idEditorial);

        Libro libro = new Libro();
        Autor autor = autorRepository.findById(idAutor).get();
        Editorial editorial = editorialRepository.findById(idEditorial).get();

        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);

        libro.setAlta(new Date());

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libroRepository.save(libro);


    }

    public List<Libro> listarLibros(){

        List<Libro> libros = new ArrayList<>();

        libros = libroRepository.findAll();

        return libros;
    }

    public void modificarLibro(Long isbn, String titulo, Long idAutor, Long idEditorial, Integer ejemplares)throws MyException{

        validar(titulo,ejemplares,idAutor,idEditorial);

        Optional<Libro> respuesta = libroRepository.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepository.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepository.findById(idEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
        }

        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }

        if(respuesta.isPresent()){
            Libro libro = respuesta.get();

            libro.setTitulo(titulo);

            libro.setAutor(autor);
            libro.setEditorial(editorial);

            libro.setEjemplares(ejemplares);

            libroRepository.save(libro);
        }
    }

    private void validar(String titulo, Integer ejemplares, Long idAutor, Long idEditorial) throws MyException{
        if(titulo.isEmpty() || titulo == null){
            throw new MyException("El titulo no puede ser nulo o estar vacio");
        }
        if(ejemplares == null){
            throw new MyException("Ejemplares no puede ser nulo");
        }
        if(idAutor == null){
            throw new MyException("El id del autor no puede ser nulo");
        }
        if(idEditorial == null){
            throw new MyException("El id de la editorial no puede ser nulo");
        }
    }
}
