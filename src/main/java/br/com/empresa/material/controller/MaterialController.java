package br.com.empresa.material.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.material.dto.MaterialRequest;
import br.com.empresa.material.dto.MaterialResponse;
import br.com.empresa.material.service.MaterialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/material")
@Tag(name = "Material", description = "Gerenciamento de material")
public class MaterialController {

	private final MaterialService materialService;

	@Operation(summary = "Cadastro de material", description = "Cria uma novo material no banco de dados.")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Material criado com sucesso"),
	@ApiResponse(responseCode = "400", description = "Dados inválidos") })
	@PostMapping
	public ResponseEntity<MaterialResponse> criar(@RequestBody @Valid MaterialRequest request) {
		MaterialResponse criado = materialService.criarMaterial(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(criado);
	}

}
