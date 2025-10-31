package com.example.projeto_escolar.aluno;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@Tag(name = "Alunos", description = "Operações relacionados aos alunos")
public class AlunoResource {
    @Autowired
    private AlunoService service;

    @Autowired
    private AlunoMapper mapper;

    @PostMapping
    public ResponseEntity<AlunoResponseDto> criar(@Valid @RequestBody AlunoRequestDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toResponseDto(service.criar(dto)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponseDto> listarPeloId(@PathVariable Integer id){
        return ResponseEntity.ok(mapper.toResponseDto(service.listarPeloId(id)));
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponseDto>> listarTodos(){
        return ResponseEntity.ok(mapper.toResponseDtoList(service.listarTodos()));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um Aluno")
    public ResponseEntity<AlunoResponseDto> atualizar(@PathVariable Integer id,
                                                      @Valid @RequestBody AlunoRequestDto dto){
        return ResponseEntity.ok(mapper.toResponseDto(service.atualizar(id, dto)));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um Aluno")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        service.deleter(id);
        return ResponseEntity.noContent().build();
    }
}
