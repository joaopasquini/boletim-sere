package sere.com.br.boletim.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class anosRegistrados {
	
	@Id
	private Long ano;

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

}
