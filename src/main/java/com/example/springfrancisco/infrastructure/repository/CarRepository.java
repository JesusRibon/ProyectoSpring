package com.example.springfrancisco.infrastructure.repository;

import com.example.springfrancisco.infrastructure.dto.CarroDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarroDto, String> {

  @Query(nativeQuery = true, value = "update carro_dto set marca = :marca, modelo = :modelo, precio = :precio, color = :color where placa = :placa")
  @Modifying
  public void editCar(@Param("marca") String marca,
      @Param("modelo") String modelo,
      @Param("precio") Double precio,
      @Param("color") String color,
      @Param("placa") String placa);
}
