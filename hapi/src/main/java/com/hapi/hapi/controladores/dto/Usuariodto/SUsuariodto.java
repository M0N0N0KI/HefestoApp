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
        if(user.getContato() != null) this.setContato(user.getContato().getId());
        if(user.getContato() == null) this.setContato((long) 0);
        if(user.getEndereco() != null) this.setEndereco(user.getEndereco().getId());
        if(user.getEndereco() == null) this.setEndereco((long) 0);
    }


}
