package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarGetService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.mapper.CarroMapper;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarGetAdapter implements CarGetService {

  private final CarRepository carRepository;
  private final CarroMapper carromapper;

  @Override
  public Carro getCar(String placa) {
    Optional<CarroDto> carrodto = carRepository.findById(placa);
    return carrodto.map(carromapper::toCarroEntity).orElse(null);
  }
/*
    private Carro buildCarro(CarroDto carro) {
        return new Carro(carro.getMarca(),carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
    }
*/

}

