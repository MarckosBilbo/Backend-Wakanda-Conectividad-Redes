package org.example.backendwakandaconectividadredes.controller;


import org.example.backendwakandaconectividadredes.model.Sensor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/sensores")
public class SensorController {
    private List<Sensor> sensores = new ArrayList<>();

    // Crear un nuevo sensor
    @PostMapping
    public Sensor crearSensor(@RequestBody Sensor sensor) {
        sensor.setId((long) (sensores.size() + 1));
        sensor.setFechaRegistro(LocalDateTime.now());
        sensores.add(sensor);
        return sensor;
    }

    // Obtener todos los sensores
    @GetMapping
    public List<Sensor> obtenerSensores() {
        return sensores;
    }

    // Obtener un sensor por ID
    @GetMapping("/{id}")
    public Sensor obtenerSensor(@PathVariable Long id) {
        return sensores.stream()
                .filter(sensor -> sensor.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
