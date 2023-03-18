package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarSaveService;
import com.example.springfrancisco.infrastructure.mapper.CarroMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarSaveAdapter implements CarSaveService {

  private final CarRepository carRepository;
  private final CarroMapper carroapper;

  @Override
  public Carro save(Carro carro) {
    return carroapper.toCarroEntity(carRepository.save(carroapper.toCarroDto(carro)));
  }


  /*
  private CarroDto buildCarroDto(Carro carro){
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }

  private Carro buildCarro(CarroDto carro){
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
   */
}
