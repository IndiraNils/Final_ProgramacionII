package com.example.demo.services;

import java.util.List;

//Esta clase va a tener los metodos CRUD que vamos a utilizar. Cada metodo tiene "Throws Exception" para capturar posibles excepcines
//surjan a la hora de trabajar con nuestra base de datos. <E> eso significa que nuestra interfaz esta tipada. Luego se replaza en cada
//una de las implementaciones por su clase correspondiente
public interface ServicioBase<E>{
    List<E> findAll() throws Exception;
    E findById(long id) throws Exception;
    E saveOne(E entity) throws Exception;
    E updateOne(E entity, long id) throws Exception;
    boolean deleteById(long id) throws Exception;
}