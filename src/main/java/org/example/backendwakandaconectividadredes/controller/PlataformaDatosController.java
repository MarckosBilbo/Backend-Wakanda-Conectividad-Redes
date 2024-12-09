package org.example.backendwakandaconectividadredes.controller;

import org.example.backendwakandaconectividadredes.model.PlataformaDatos;
import org.example.backendwakandaconectividadredes.model.Sensor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/plataformas")
public class PlataformaDatosController {
    private List<PlataformaDatos> plataformas = new ArrayList<>();

    // Crear una nueva plataforma
    @PostMapping
    public PlataformaDatos crearPlataforma(@RequestBody PlataformaDatos plataforma) {
        plataforma.setId((long) (plataformas.size() + 1));
        plataformas.add(plataforma);
        return plataforma;
    }

    // Obtener todas las plataformas
    @GetMapping
    public List<PlataformaDatos> obtenerPlataformas() {
        return plataformas;
    }

    // Agregar un sensor a una plataforma
    @PostMapping("/{id}/sensores")
    public PlataformaDatos agregarSensor(@PathVariable Long id, @RequestBody Sensor sensor) {
        PlataformaDatos plataforma = plataformas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (plataforma != null) {
            plataforma.getSensores().add(sensor);
        }
        return plataforma;
    }
}
