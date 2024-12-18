package org.example.backendwakandaconectividadredes.controller;

import org.example.backendwakandaconectividadredes.model.PlataformaDatos;
import org.example.backendwakandaconectividadredes.model.Sensor;
import org.example.backendwakandaconectividadredes.service.PlataformaDatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plataformas")
public class PlataformaDatosController {

    private final PlataformaDatosService plataformaDatosService;

    @Autowired
    public PlataformaDatosController(PlataformaDatosService plataformaDatosService) {
        this.plataformaDatosService = plataformaDatosService;
    }

    // Crear una nueva plataforma
    @PostMapping
    public ResponseEntity<PlataformaDatos> crearPlataforma(@RequestBody PlataformaDatos plataforma) {
        PlataformaDatos nuevaPlataforma = plataformaDatosService.guardar(plataforma);
        return ResponseEntity.ok(nuevaPlataforma);
    }

    // Obtener todas las plataformas
    @GetMapping
    public ResponseEntity<List<PlataformaDatos>> obtenerPlataformas() {
        return ResponseEntity.ok(plataformaDatosService.obtenerTodas());
    }

    // Agregar un sensor a una plataforma
    @PostMapping("/{id}/sensores")
    public ResponseEntity<PlataformaDatos> agregarSensor(@PathVariable Long id, @RequestBody Sensor sensor) {
        PlataformaDatos plataformaActualizada = plataformaDatosService.agregarSensor(id, sensor);
        return ResponseEntity.ok(plataformaActualizada);
    }
}
