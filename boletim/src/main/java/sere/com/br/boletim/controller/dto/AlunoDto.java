package sere.com.br.boletim.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import sere.com.br.boletim.modelo.Aluno;


public class AlunoDto {

	private Long id;
	private String nome;
	
	public AlunoDto(Aluno aluno) {
		this.id = aluno.getId();
		this.nome = aluno.getNome();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}


	public static List<AlunoDto> converter(List<Aluno> alunos) {
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}
	
}
