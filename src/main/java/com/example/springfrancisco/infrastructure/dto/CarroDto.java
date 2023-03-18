package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class CarroDto extends VehiculoDto {

  private String color;

  public CarroDto(String marca, String placa, String modelo, double precio, String color) {
    super(marca, placa, modelo, precio);
    this.color = color;
  }
}
