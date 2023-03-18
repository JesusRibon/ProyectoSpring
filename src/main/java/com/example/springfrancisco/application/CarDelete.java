package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.service.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

  private final CarDeleteService cardeleteservice;

  public void deleteCar(String placa) {
    cardeleteservice.deleteCar(placa);
  }

}
