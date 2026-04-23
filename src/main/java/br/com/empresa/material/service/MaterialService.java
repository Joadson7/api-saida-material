package br.com.empresa.material.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.material.dto.MaterialRequest;
import br.com.empresa.material.dto.MaterialResponse;
import br.com.empresa.material.entity.Material;
import br.com.empresa.material.repository.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;

 public MaterialResponse criarMaterial(MaterialRequest request) {
	 Material material = new Material();
	 material.setNome(request.nome());
	 material.setDescricao(request.descricao());
	 material.setUnidadeMedida(request.unidadeMedida());
	
	 materialRepository.save(material);
	 return new MaterialResponse(material);
 }
	
 }
