package sere.com.br.boletim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sere.com.br.boletim.modelo.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	List<Aluno> findByDisciplinasNome(String nomeDisciplina);

}
