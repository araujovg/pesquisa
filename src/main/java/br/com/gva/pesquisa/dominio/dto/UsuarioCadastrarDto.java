package br.com.gva.pesquisa.dominio.dto;

import lombok.Data;

@Data
public class UsuarioCadastrarDto {
    private Long id;
    private String nome;
    private String senha;
}
