package br.com.viasoft.livros.controller;
import br.com.viasoft.livros.model.Livro;
import br.com.viasoft.livros.repository.LivroRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {


    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/")
    public String getHome(Model model){
        List<Livro> lista = livroRepository.findAll();
        model.addAttribute("lista",lista);

        return "home";
    }

}
