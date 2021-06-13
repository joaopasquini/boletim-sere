package sere.com.br.boletim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sere.com.br.boletim.controller.dto.NotaDto;
import sere.com.br.boletim.modelo.Nota;
import sere.com.br.boletim.repository.NotaRepository;


@RestController
public class NotasController {
	
	@Autowired
	private NotaRepository NotaRepository;
	
	@RequestMapping("/notas")
	public List<NotaDto> lista(String nomeCurso) {
		
		if (nomeCurso == null) {
			List<Nota> notas = NotaRepository.findAll();
			return NotaDto.converter(notas);
		} else {
			List<Nota> notas = NotaRepository.findByCursoNome(nomeCurso);
			return NotaDto.converter(notas);
		}
		
		
	}
}
