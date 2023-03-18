package com.example.springfrancisco.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Vehiculo implements Acelerar, Frenar, IniciarMarcha {

  private String marca;
  private String placa;
  private String modelo;
  private double precio;

  public Vehiculo(String marca, String placa, String modelo, double precio) {
    this.marca = marca;
    this.placa = placa;
    this.modelo = modelo;
    this.precio = precio;
  }
}
