package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.service.MotoDeleteService;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class MotoDeleteAdapter implements MotoDeleteService {

  private final MotoRepository motoRepository;

  @Override
  public void deleteMoto(String placa) {
    motoRepository.deleteById(placa);
  }
}
