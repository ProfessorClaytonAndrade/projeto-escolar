package com.example.projeto_escolar.aluno;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AlunoMapper mapper;

    //Create
    public Aluno criar(AlunoRequestDto dto){
        return repository.save(mapper.toEntety(dto));
    }

    //Read
    public Aluno listarPeloId(Integer id){
        return repository.findById(id).orElseThrow(()->
                new EntityNotFoundException("Aluno com ID: " + id + " não encontrado"));
    }

    public List<Aluno> listarTodos(){
        return repository.findAll();
    }

    //Update
    public Aluno atualizar(Integer id, AlunoRequestDto dto){
        Aluno aluno = listarPeloId(id);
        mapper.updateEntityFromDto(dto, aluno);
        return repository.save(aluno);
    }

    //Delete
    public void deleter(Integer id){
        repository.deleteById(listarPeloId(id).getId());
    }

}
