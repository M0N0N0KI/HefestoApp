package com.hapi.hapi.controladores.services.Usuario;

import com.hapi.hapi.controladores.dto.Usuariodto.CUsuariodto;
import com.hapi.hapi.controladores.dto.Usuariodto.SUsuariodto;
import com.hapi.hapi.controladores.services.Contato.ContatoService;
import com.hapi.hapi.controladores.services.Endereco.EnderecoService;
import com.hapi.hapi.modelos.Usuario.RepoUsuario;
import com.hapi.hapi.modelos.Usuario.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private RepoUsuario repo;
    private ContatoService servcontato;
    private EnderecoService servendereco;

    public SUsuariodto CadastrarUsuario(CUsuariodto usuario)
    {
        Usuario entidade = new Usuario();
        entidade.setNome(usuario.getNome());
        entidade.setIdentificador(usuario.getIdentificador());
        entidade.setSenha(usuario.getSenha());
        entidade.setStatus(usuario.getStatus());
        entidade.setContato(servcontato.CadastrarContato(usuario.getContato()));
        entidade.setEndereco(servendereco.CadastrarEndereco(usuario.getEndereco()));
        Usuario aux = repo.save(entidade);
        SUsuariodto userv = new SUsuariodto();
        userv.setId(aux.getId());
        userv.setNome(aux.getNome());
        userv.setIdentificador(aux.getIdentificador());
        userv.setSenha(aux.getSenha());
        userv.setStatus(aux.getStatus());
        userv.setContato(aux.getContato().getId());
        userv.setEndereco(aux.getEndereco().getId());
        return userv;
    }
    
}
