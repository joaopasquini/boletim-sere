package sere.com.br.boletim.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import sere.com.br.boletim.modelo.Nota;


public class NotaDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public NotaDto(Nota nota) {
		this.id = nota.getId();
		this.titulo = nota.getTitulo();
		this.mensagem = nota.getMensagem();
		this.dataCriacao = nota.getDataCriacao();
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
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<NotaDto> converter(List<Nota> notas) {
		return notas.stream().map(NotaDto::new).collect(Collectors.toList());
	}
	
}
