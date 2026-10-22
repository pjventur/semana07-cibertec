package com.cibertec.semana04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.semana04.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

	List<Libro> findByEditorialIdEditorial(Long idEditorial);
	
	List<Libro> findByTituloContaining(String titulo);
}
