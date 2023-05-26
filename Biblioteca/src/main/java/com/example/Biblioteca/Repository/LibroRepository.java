package com.example.Biblioteca.Repository;

import com.example.Biblioteca.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {
}
