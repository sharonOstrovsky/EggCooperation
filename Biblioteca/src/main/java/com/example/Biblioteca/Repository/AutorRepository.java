package com.example.Biblioteca.Repository;

import com.example.Biblioteca.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {
}
