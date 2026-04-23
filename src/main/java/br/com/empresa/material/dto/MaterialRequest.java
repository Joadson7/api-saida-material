package br.com.empresa.material.dto;

import br.com.empresa.material.enums.UnidadeMedida;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MaterialRequest (

	@NotBlank(message = "Por favor, informe o nome do material.")
	String nome,
	
	
	String descricao,
	
	@NotNull(message = "Por favor, informe a unidade de medida do material.")
	UnidadeMedida unidadeMedida
	
	)
	
	
{}

