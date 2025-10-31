package com.example.projeto_escolar.aluno;

public class AlunoResponseDto {
    private final Integer id;
    private final String nome;
    private final Double mensalidade;

    public AlunoResponseDto(Integer id, String nome, Double mensalidade) {
        this.id = id;
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }
}
