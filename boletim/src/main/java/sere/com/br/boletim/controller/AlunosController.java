package sere.com.br.boletim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sere.com.br.boletim.controller.dto.AlunoDto;
import sere.com.br.boletim.modelo.Aluno;
import sere.com.br.boletim.repository.AlunoRepository;


@RestController
public class AlunosController {
	
	@Autowired
	private AlunoRepository AlunoRepository;
	
	@RequestMapping("/alunos")
	public List<AlunoDto> lista(String nomeCurso) {
		
		if (nomeCurso == null) {
			List<Aluno> alunos = AlunoRepository.findAll();
			return AlunoDto.converter(alunos);
		} else {
			List<Aluno> alunos = AlunoRepository.findByCursoNome(nomeCurso);
			return AlunoDto.converter(alunos);
		}
		
		
	}
}
