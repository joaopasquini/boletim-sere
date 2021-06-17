package sere.com.br.boletim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sere.com.br.boletim.modelo.Responsavel;

import java.util.List;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long> {
	
	List<Responsavel> findByCpf(String responsavelCpf);

}
