package sere.com.br.boletim.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import sere.com.br.boletim.modelo.Aluno;


public class AlunoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	
	public AlunoDto(Aluno aluno) {
		this.id = aluno.getId();
		this.titulo = aluno.getTitulo();
		this.mensagem = aluno.getAnos_registrados();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}

	public static List<AlunoDto> converter(List<Aluno> alunos) {
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}
	
}
