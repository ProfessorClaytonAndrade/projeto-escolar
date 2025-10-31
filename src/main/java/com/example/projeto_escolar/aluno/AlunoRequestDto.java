package com.example.projeto_escolar.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class AlunoRequestDto {
    @NotBlank(message = "O nome é obrigatório")
    private final String nome;
    @NotNull(message = "A mensalidade é obrigatória")
    @Positive(message = "A mensalidade deve ser maior que zero")
    private final Double mensalidade;

    public AlunoRequestDto(String nome, Double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }
}
