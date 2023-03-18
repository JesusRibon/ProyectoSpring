package com.example.springfrancisco.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Moto extends Vehiculo {

  private Integer cilindraje;
  private Boolean esElectrica;

  public Moto(String marca, String placa, String modelo, double precio, Integer cilindraje,
      boolean esElectrica) {
    super(marca, placa, modelo, precio);
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }
}
