package com.hapi.hapi.controladores.dto.Usuariodto;

import com.hapi.hapi.modelos.Usuario.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/** O S dessa classe significa que essa classe e uma classe simples
 * logo a mesma apenas apresenta dados referentes a esta entidade
 */
public class SUsuariodto extends Usuariodto{

    private Long contato;
    private Long endereco;

    public SUsuariodto(){}

    public SUsuariodto(Usuario user)
    {
        this.setId(user.getId());
        this.setNome(user.getNome());
        this.setIdentificador(user.getIdentificador());
        this.setSenha(user.getSenha());
        this.setStatus(user.getStatus());
        this.setContato(user.getContato().getId());
        this.setEndereco(user.getEndereco().getId());
    }
    
}
