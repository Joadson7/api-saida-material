package br.com.empresa.material.dto;

import br.com.empresa.material.enums.UnidadeMedida;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class MaterialRequest {

    @NotBlank(message = "Por favor, informe o nome do material.")
    private String nome;

    private String descricao;

    @NotNull(message = "Por favor, informe a unidade de medida do material.")
    private UnidadeMedida unidadeMedida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}