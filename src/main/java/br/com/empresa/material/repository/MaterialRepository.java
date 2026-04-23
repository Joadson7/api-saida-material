package br.com.empresa.material.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.empresa.material.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, UUID> {

	
	boolean existsByNomeIgnoreCase(String nome);
	
}
