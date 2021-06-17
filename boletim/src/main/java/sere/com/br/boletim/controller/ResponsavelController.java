package sere.com.br.boletim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sere.com.br.boletim.controller.dto.ResponsavelDto;
import sere.com.br.boletim.controller.form.ResponsavelForm;
import sere.com.br.boletim.modelo.Responsavel;
import sere.com.br.boletim.repository.ResponsavelRepository;


@RestController
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@GetMapping
	public List<ResponsavelDto> lista(String responsavelCpf) {
		
		if (responsavelCpf == null) {
			List<Responsavel> responsaveis = responsavelRepository.findAll();
			return ResponsavelDto.converter(responsaveis);
		} else {
			List<Responsavel> responsaveis = responsavelRepository.findByCpf(responsavelCpf);
			return ResponsavelDto.converter(responsaveis);
		}
		
	}
	
	@PostMapping
	public void cadastrar(@RequestBody ResponsavelForm form) {
		Responsavel responsavel = form.converter();
		responsavelRepository.save(responsavel);
	}
			 
}
