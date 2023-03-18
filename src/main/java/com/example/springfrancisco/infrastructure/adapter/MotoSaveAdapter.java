package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoSaveService;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoSaveAdapter implements MotoSaveService {

  private final MotoRepository motoRepository;
  private final MotoMapper motoMapper;

  @Override
  public Moto saveMoto(Moto moto) {
    return motoMapper.toMoto((MotoDto) this.motoRepository.save(this.motoMapper.toMotoDto(moto)));
  }
}
