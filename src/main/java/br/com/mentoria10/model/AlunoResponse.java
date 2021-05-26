package br.com.mentoria10.model;

import lombok.NoArgsConstructor;
import lombok.*;

@Getter
@AllArgsConstructor
public class AlunoResponse {
	

	private Long id;
	
	private String nome;
	
	private String matricula;
	
	private String cpf;
}