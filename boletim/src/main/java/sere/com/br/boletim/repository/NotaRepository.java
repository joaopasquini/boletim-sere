package sere.com.br.boletim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sere.com.br.boletim.modelo.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {

	List<Nota> findByCursoNome(String nomeCurso);

}
