package com.example.springfrancisco.domain.entities;

public interface Acelerar {

  public default void acelerarVehiculo() {
    System.out.println("Acelenrando el vehículo.");
  }
}
