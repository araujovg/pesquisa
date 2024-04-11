package br.com.gva.pesquisa.servico.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.gva.pesquisa.dominio.dto.UsuarioCadastrarDto;
import br.com.gva.pesquisa.dominio.dto.UsuarioDto;
import br.com.gva.pesquisa.dominio.modelo.Usuario;
import br.com.gva.pesquisa.repositorio.UsuarioRepositorio;
import br.com.gva.pesquisa.servico.UsuarioServico;
import lombok.Getter;

//A classe UsuarioServicoImpl IMPLEMENTA (ASSINA O CONTRATO com) a interface UsuarioServico
//Suas obrigações por CONTRATO são as de implementar os métodos que foram ESPECIFICADOS na interface
//A anotação @Service é utilizada pelo spring para identificar que essa é uma classe de serviço e também para fazer a injeção de dependencias 
@Service
public class UsuarioServicoImpl implements UsuarioServico{

    //Injetei o repositório via construtor declarando um objeto de UsuarioRepositorio cmo privado e final e fazendo a injeção no construtor
    //POderia ser feito utilizando o @Autowired do Spring
    @Getter
    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicoImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public UsuarioDto salvar(UsuarioCadastrarDto dto) {
        
        getUsuarioRepositorio().save(converterDtoEmEntidade(dto));

        
        return null;
    }

    @Override
    public UsuarioDto atualizar(UsuarioCadastrarDto usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    @Override
    public UsuarioDto procurarPeloId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'procurarPeloId'");
    }

    private Usuario converterDtoEmEntidade(UsuarioCadastrarDto dto) {
        return Usuario.builder()
                .nome(dto.getNome())
                .senha(dto.getSenha())
                .build();
    }

    private UsuarioDto converteEntidadeEmDto(Usuario usuario){
        return UsuarioDto.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .build();
    }

}
