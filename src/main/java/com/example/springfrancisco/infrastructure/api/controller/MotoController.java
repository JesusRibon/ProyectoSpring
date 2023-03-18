package com.example.springfrancisco.infrastructure.api.controller;


import com.example.springfrancisco.application.MotoDelete;
import com.example.springfrancisco.application.MotoEdit;
import com.example.springfrancisco.application.MotoGet;
import com.example.springfrancisco.application.MotoSave;
import com.example.springfrancisco.domain.entities.Moto;
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
@RequestMapping(path = "/moto")

public class MotoController {

  private final MotoSave motoSave;
  private final MotoGet motoGet;
  private final MotoEdit motoEdit;
  private final MotoDelete motoDelete;

  @PostMapping
  public ResponseEntity<Moto> savemoto(@RequestBody Moto moto) {
    return new ResponseEntity<>(motoSave.saveMoto(moto), HttpStatus.CREATED);

  }

  @GetMapping
  public ResponseEntity<Moto> getmoto(@RequestParam String placa) {
    return ResponseEntity.ok(motoGet.getMoto(placa));
  }

  @PutMapping
  public void editMoto(@RequestBody Moto moto) {
    motoEdit.editMoto(moto);
  }

  @DeleteMapping
  public void deleteMoto(@RequestParam String placa) {
    motoDelete.deleteMoto(placa);
  }
}