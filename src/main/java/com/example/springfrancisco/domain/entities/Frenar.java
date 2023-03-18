package com.example.springfrancisco.domain.entities;

public interface Frenar {

  public default void frenar() {
    System.out.println("Frenando el Vehículo.");
  }

}
