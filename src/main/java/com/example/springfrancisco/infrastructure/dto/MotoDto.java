package com.example.springfrancisco.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class MotoDto extends VehiculoDto {

  private Integer cilindraje;
  private Boolean esElectrica;

  public MotoDto(String marca, String placa, String modelo, double precio, Integer cilindraje,
      boolean esElectrica) {
    super(marca, placa, modelo, precio);
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }
}
