package br.com.gva.pesquisa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.gva.pesquisa.dominio.dto.UsuarioCadastrarDto;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping
    public String index(Model model){
        model.addAttribute("usuario", new UsuarioCadastrarDto());
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarUsuario(@ModelAttribute("usuario") UsuarioCadastrarDto usuario, Model model){
        logger.info("Nome: " + usuario.getNome());
        logger.info("Senha: " + usuario.getSenha());
        return "index";
    }

}
