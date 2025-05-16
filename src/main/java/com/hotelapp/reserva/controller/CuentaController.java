package com.hotelapp.reserva.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @GetMapping
    public ResponseEntity<?> registrarCuenta() {
        return ResponseEntity.ok("hola");
    }
}
