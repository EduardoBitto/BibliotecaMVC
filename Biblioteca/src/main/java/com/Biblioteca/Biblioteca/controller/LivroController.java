package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();

    @GetMapping
    public String Inicio(){
        return "livros/inicio";
    }

    @GetMapping("/livro")
    public String exibirLivro(Model model){

//        Livro livro = new Livro();
//        livro.setTitulo("Dom Casmurro");
//        livro.setAutor("Machado de Assis");
//        livro.setIsnb("978-85-00-00000-0");

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", "978-85-00-00000-0"));
        livros.add(new Livro("1984", "George Orwell", "123-45-67-00000-8"));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K.Rowling","111-22-33-44444-5"));

        model.addAttribute("livro", livros);

        return "livro";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Livro livro){
        livros.add(livro);
        return "redirect:/livros";
    }
}