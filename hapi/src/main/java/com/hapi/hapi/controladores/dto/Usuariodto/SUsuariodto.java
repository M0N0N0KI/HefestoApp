package com.hapi.hapi.controladores.dto.Usuariodto;

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
    
}
