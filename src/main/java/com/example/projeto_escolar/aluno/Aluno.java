package com.example.projeto_escolar.aluno;

import com.example.projeto_escolar.pessoa.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa {
    @Column(name = "mensalidade")
    private Double mensalidade;

    public Aluno() {}

    public Aluno(Integer id, String nome, Double mensalidade) {
        super(id, nome);
        this.mensalidade = mensalidade;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", mensalidade=" + mensalidade +
                '}';
    }
}
