package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.CarDelete;
import com.example.springfrancisco.application.CarEdit;
import com.example.springfrancisco.application.CarGet;
import com.example.springfrancisco.application.CarSave;
import com.example.springfrancisco.domain.entities.Carro;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/car")
public class CarController {

  private final CarSave carSave;
  private final CarGet carGet;
  private final CarEdit carEdit;
  private final CarDelete carDelete;

  @GetMapping
  public ResponseEntity<Carro> getCar(@RequestParam String placa) {

    return ResponseEntity.ok(carGet.getCar(placa));
  }

  @PostMapping
  public ResponseEntity<Carro> addCar(@RequestBody Carro car) {
    return new ResponseEntity<>(carSave.saveCar(car), HttpStatus.CREATED);

  }

  @PutMapping
  public void editcar(@RequestBody Carro car) {
    carEdit.editCar(car);
  }

  @DeleteMapping
  public void deleteCar(@RequestParam String placa) {
    carDelete.deleteCar(placa);
  }
}
