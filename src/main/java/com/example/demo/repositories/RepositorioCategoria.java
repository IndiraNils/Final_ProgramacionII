package com.example.demo.repositories;

import com.example.demo.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//con esto accedemos a la base de datos para hacer altas, bajas y modificaciones  (metodo CRUD)
//Los paramentros que esta recibiendo es la clase a la que hace alusion y la clase del Id, si fuera, por ejemplo, int, la clase deberia ser Integer
public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {
}