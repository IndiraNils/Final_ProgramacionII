package com.example.demo.repositories;

import com.example.demo.entities.Videojuego;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioVideojuego extends JpaRepository <Videojuego, Long>{
    //retorna todos los valores de la base de datos donde la columna activo este en true
    @Query(value = "SELECT * FROM videojuegos  WHERE videojuegos.activo = true", nativeQuery = true)
    List<Videojuego> findAllByActivo();

    //retorna todos los valores de la base de datos donde la columna activo este en true
    @Query(value = "SELECT * FROM videojuegos  WHERE videojuegos.id = :id AND videojuegos.activo = true", nativeQuery = true)
    Optional<Videojuego> findByIdAndActivo(@Param("id") long id);
    //@Param para pasarle algun parametro.

    @Query(value = "SELECT * FROM videojuegos WHERE videojuegos.titulo LIKE %:q% AND videojuegos.activo =true", nativeQuery = true)
    List<Videojuego> findByTitle(@Param("q")String q);

}
