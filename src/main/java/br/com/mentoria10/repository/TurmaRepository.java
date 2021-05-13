package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mentoria10.modelo.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
