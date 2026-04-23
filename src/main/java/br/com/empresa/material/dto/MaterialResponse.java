package br.com.empresa.material.dto;

import java.util.UUID;

import br.com.empresa.material.entity.Material;
import br.com.empresa.material.enums.UnidadeMedida;

public record MaterialResponse(

		UUID id, String nome, String descricao, UnidadeMedida unidadeMedida) {

	public MaterialResponse(Material material) {
		this(
			 material.getId(),
			 material.getNome(),
			 material.getDescricao(),
			 material.getUnidadeMedida()
			 
			);

		
	}
}
