package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoEditService;
import com.example.springfrancisco.domain.service.MotoGetService;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j

public class MotoEdit {

  private MotoEditService motoEditService;
  private final MotoGetService motoGetService;

  public void editMoto(Moto moto) {
    Moto carro1 = motoGetService.getMoto(moto.getPlaca());
    if (Objects.isNull(carro1)) {
      log.info("LA MOTO CON PLACA {} NO ESTA REGISTRADO", moto.getPlaca());
    }
    motoEditService.editMoto(moto);
  }
}
