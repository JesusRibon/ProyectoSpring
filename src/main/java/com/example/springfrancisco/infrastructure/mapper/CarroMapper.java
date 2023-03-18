package com.example.springfrancisco.infrastructure.mapper;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarroMapper {

  @Mappings({
      @Mapping(target = "marca", source = "marca"),
      @Mapping(target = "placa", source = "placa"),
      @Mapping(target = "modelo", source = "modelo"),
      @Mapping(target = "precio", source = "precio"),
      @Mapping(target = "color", source = "color")
  })
  CarroDto toCarroDto(Carro carro);

  Carro toCarroEntity(CarroDto carroDto);


}

