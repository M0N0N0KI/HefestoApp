package com.hapi.hapi.controladores.ctrl.Login;

import java.util.List;

import com.hapi.hapi.modelos.Usuario.RepoUsuario;
import com.hapi.hapi.modelos.Usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Loginctrl {

    @Autowired
    RepoUsuario usuariorepo;

    @GetMapping("/listar")
    public List<Usuario> ListarUsuarios()
    {
        return usuariorepo.findAll();
    }
    @GetMapping("teste")
    public String TesteApi()
    {
        return "Esta Funcional";
    }

    
}
