package br.com.viasoft.livros.controller;

import br.com.viasoft.livros.model.Cliente;
import br.com.viasoft.livros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class HomeControlerCliente {
    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping("/Cliente")
    public String getCliente(Model model){
        List<Cliente> clienteList =  clienteRepository.findAll();
        model.addAttribute("listaCliente",clienteList);
        return "homeCliente";
    }
}
