package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoGetService;
import com.example.springfrancisco.infrastructure.dto.MotoDto;
import com.example.springfrancisco.infrastructure.mapper.MotoMapper;
import com.example.springfrancisco.infrastructure.repository.MotoRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoGetAdapter implements MotoGetService {

  private final MotoRepository motoRepository;

  private final MotoMapper motoMapper;

  @Override
  public Moto getMoto(String placa) {
    Optional<MotoDto> motoDto = motoRepository.findById(placa);
    return motoDto.map(motoMapper::toMoto).orElse(null);
  }
}
