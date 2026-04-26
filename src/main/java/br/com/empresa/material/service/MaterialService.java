package br.com.empresa.material.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.material.dto.MaterialRequest;
import br.com.empresa.material.dto.MaterialResponse;
import br.com.empresa.material.entity.Material;
import br.com.empresa.material.exception.MaterialJaExisteException;
import br.com.empresa.material.repository.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;

	public MaterialResponse criarMaterial(MaterialRequest request) {

		validarNomeDuplicado(request.getNome());

		Material material = new Material();
		material.setNome(request.getNome());
		material.setDescricao(request.getDescricao());
		material.setUnidadeMedida(request.getUnidadeMedida());

		materialRepository.save(material);
		return new MaterialResponse(material);
	}

	private void validarNomeDuplicado(String nome) {
		if (materialRepository.existsByNomeIgnoreCase(nome)) {
			throw new MaterialJaExisteException("Já existe um material com o nome '" + nome + "'.");
		}
	}

}
