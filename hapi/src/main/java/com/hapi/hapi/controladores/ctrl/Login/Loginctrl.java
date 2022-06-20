package com.hapi.hapi.controladores.ctrl.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hapi.hapi.controladores.dto.Usuariodto.Uauthdto;
import com.hapi.hapi.controladores.dto.Usuariodto.Usuariodto;
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

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarUsuario(@RequestBody Usuariodto user)
    {
        int conf = userS.CadastrarUsuario(user);
        if(conf == 0) return ResponseEntity.ok("Usuario ja Cadastrado");
        else if(conf == 1) return ResponseEntity.ok("Usuario cadastrado com sucesso");
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario não cadastrado");
    }
    
}
