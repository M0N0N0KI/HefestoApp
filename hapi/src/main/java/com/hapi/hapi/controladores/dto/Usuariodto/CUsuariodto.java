package com.hapi.hapi.controladores.dto.Usuariodto;

import com.hapi.hapi.controladores.dto.Contatodto.Contatodto;
import com.hapi.hapi.controladores.dto.Enderecodto.Enderecodto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/** o C nessa classe significa que essa e uma classe composta
 *  logo a mesma possue os dados da mesma e de suas subclasses
 */

public class CUsuariodto extends Usuariodto{

    private Contatodto contato;
    private Enderecodto endereco;
    
}
