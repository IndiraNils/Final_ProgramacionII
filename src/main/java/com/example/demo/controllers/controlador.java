package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {
    @GetMapping(value = "/")
    //Model es de Spring
    public String index(Model model) {
        String saludo = "Hola Thymeleaf";
        //dentro de la instancia de model tenemos un metodo que se llama "addAttribute", en el cual tenemos dos valors, el String
        //que va a ser el nombre de nuestra variable, y nuestra variable
        model.addAttribute("saludo", saludo);
        return "index";
        //el String del return del metodo que tiene la etiqueta @GetMapping, dentro de controlers,
        // corresponde a la carpeta templates, va a buscar alli adentro
    }
}