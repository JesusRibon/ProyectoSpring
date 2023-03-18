package com.example.springfrancisco.domain.entities;

public interface IniciarMarcha {

  public default void iniciarMarcha() {
    System.out.println("Iniciando marcha");
  }
}
