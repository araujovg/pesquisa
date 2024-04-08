package br.com.gva.pesquisa.dominio.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDto {
    private Long id;
    private String nome;
}
