package br.com.mentoria10.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mentoria10.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {



}
