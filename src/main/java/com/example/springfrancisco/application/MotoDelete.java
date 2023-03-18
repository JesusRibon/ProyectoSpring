package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.service.MotoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoDelete {

  private final MotoDeleteService motoDeleteService;

  public void deleteMoto(String placa) {
    motoDeleteService.deleteMoto(placa);
  }
}
