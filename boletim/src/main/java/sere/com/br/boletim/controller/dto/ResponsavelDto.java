package sere.com.br.boletim.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import sere.com.br.boletim.modelo.Responsavel;

public class ResponsavelDto {
	private Long cpf;
	private String nome;
	
	public ResponsavelDto(Responsavel responsavel) {
		this.cpf = responsavel.getCpf();
		this.nome = responsavel.getNome();
	}
	
	public Long getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}


	public static List<ResponsavelDto> converter(List<Responsavel> responsaveis) {
		return responsaveis.stream().map(ResponsavelDto::new).collect(Collectors.toList());
	}
}
