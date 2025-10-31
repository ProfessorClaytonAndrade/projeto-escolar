package com.example.projeto_escolar.professor;

import com.example.projeto_escolar.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa {
    private Double salario;

    public Professor() {}

    public Professor(Integer id, String nome, Double salario) {
        super(id, nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
