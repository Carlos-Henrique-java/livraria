package br.com.livraria.ingary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivroController {

    @RequestMapping("/cadastrarLivro")
    public String form(){
        return "templates/livro/formLivros";

    }
}
