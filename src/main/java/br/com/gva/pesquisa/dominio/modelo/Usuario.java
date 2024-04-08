package br.com.gva.pesquisa.dominio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
//Anotação que cria uma tabela no banco de dados. O parametro name permite passar um nome para esta tabela.
//Se não for passado nada o nome da tabela será o nome da classe
@Entity(name = "tb_usuario") 
public class Usuario {

    //A anotação @Id identifica o campo que será a chave primária da tabela.
    @Id
    //A anotação @GeneratedValue indica que o BD deverá cuidar de incrementar este id automaticamente.
    //O parametro strategy recebe um enum do tipo GenerationTYpe
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    
    @Setter
    private String nome;
    
    @Setter
    private String senha;

}
