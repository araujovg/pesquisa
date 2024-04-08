package br.com.gva.pesquisa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gva.pesquisa.dominio.modelo.Usuario;
import br.com.gva.pesquisa.repositorio.UsuarioRepositorio;
import br.com.gva.pesquisa.servico.UsuarioServico;
import lombok.Getter;

@SpringBootApplication
public class PesquisaApplication implements CommandLineRunner{

	Logger log = LoggerFactory.getLogger(this.getClass());


	@Getter
	private final UsuarioServico usuarioServico;

	@Getter
	private final UsuarioRepositorio usuarioRepositorio;


	public PesquisaApplication(UsuarioServico usuarioServico, UsuarioRepositorio usuarioRepositorio) {
		this.usuarioServico = usuarioServico;
		this.usuarioRepositorio = usuarioRepositorio;
	}

	public static void main(String[] args) {
		SpringApplication.run(PesquisaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = Usuario.builder()
							.nome("Gabriel Viana")
							.senha("1234")
							.build();
		
						 log.info("Usuario criado: " + getUsuarioRepositorio().save(usuario).toString());
						 log.info("Usuario criado pelo serviço " + getUsuarioServico().salvar(usuario).toString());
	}



}
