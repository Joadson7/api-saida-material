package br.com.empresa.usuario.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id; 
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, unique = true, length = 20)
	private String matricula;
	
	@Column(nullable = false)
	private boolean ativo = true;
	
	
}
