package com.example.springfrancisco.application;


import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class MotoGet {

  private final MotoGetService motoGetService;

  public Moto getMoto(String placa) {
    return motoGetService.getMoto(placa);
  }
}
