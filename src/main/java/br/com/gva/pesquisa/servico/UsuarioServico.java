package br.com.gva.pesquisa.servico;

import br.com.gva.pesquisa.dominio.dto.UsuarioCadastrarDto;
import br.com.gva.pesquisa.dominio.dto.UsuarioDto;
import br.com.gva.pesquisa.dominio.modelo.Usuario;

//Criei uma interface para ESPECIFICAR o que o serviço deverá fazer. 
//Pense na interface como um CONTRATO que define OBRIGAÇÕES que quem o assinar deverá cumprir.
public interface UsuarioServico {

    UsuarioDto salvar(UsuarioCadastrarDto dto);

    UsuarioDto atualizar(UsuarioCadastrarDto dto);

    void deletar(Long id);

    UsuarioDto procurarPeloId(Long id);

}
