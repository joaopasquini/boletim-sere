package sere.com.br.boletim.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Nota {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long valor;
	
	
	@ManyToOne
	private Disciplina materia;
	@OneToOne
	private Aluno aluno;
	
	
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Disciplina getMateria() {
		return materia;
	}
	public void setMateria(Disciplina materia) {
		this.materia = materia;
	}
	
	
	
}
