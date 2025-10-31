package com.example.projeto_escolar.aluno;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlunoMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "mensalidade", source = "mensalidade")
    Aluno toEntety(AlunoRequestDto dto);
    //Dto de entrada
    List<Aluno> toEntityList(List<AlunoRequestDto> dtos);

    //Entidade para dto
    AlunoResponseDto toResponseDto(Aluno aluno);
    List<AlunoResponseDto> toResponseDtoList(List<Aluno> alunos);

    void updateEntityFromDto(AlunoRequestDto dto,@MappingTarget Aluno aluno);
}
