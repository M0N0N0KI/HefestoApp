package com.hapi.hapi.controladores.ctrl.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hapi.hapi.controladores.dto.Usuariodto.Uauthdto;
import com.hapi.hapi.controladores.services.Usuario.UsuarioService;

@RestController
@RequestMapping("/login")
public class Loginctrl {

    @Autowired
    private UsuarioService userS;


    @GetMapping("/teste")
    public String TesteApi()
    {
        return "Esta Funcional";
    }

    @PostMapping("/validar")
    public ResponseEntity  validarLogin(@RequestBody Uauthdto auth)
    {
        return userS.validarUsuario(auth);
    }
    
}
