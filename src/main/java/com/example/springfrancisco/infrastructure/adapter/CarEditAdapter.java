package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarEditService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service

public class CarEditAdapter implements CarEditService {

  private final CarRepository carrepository;

  @Transactional
  public void editCar(Carro carro) {
    carrepository.editCar(carro.getMarca(),
        carro.getModelo(),
        carro.getPrecio(),
        carro.getColor(),
        carro.getPlaca());
  }

}
