package br.com.empresa.material.entity;


import java.util.UUID;

import br.com.empresa.material.enums.UnidadeMedida;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false, unique = true, length = 150)
	private String nome;
	
	@Column(length = 500)
	private String descricao;
	
	@Enumerated(EnumType.STRING)
    @Column(nullable = false)
	private UnidadeMedida unidadeMedida;
	
	
	@Column(nullable = false)
	private boolean ativo = true;

	
}
	
