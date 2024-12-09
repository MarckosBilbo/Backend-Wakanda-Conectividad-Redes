package org.example.backendwakandaconectividadredes.controller;

import org.example.backendwakandaconectividadredes.model.WifiPublico;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/wifi")
public class WifiPublicoController {
    private List<WifiPublico> puntosWifi = new ArrayList<>();

    // Crear un nuevo punto de Wi-Fi
    @PostMapping
    public WifiPublico crearWifi(@RequestBody WifiPublico wifi) {
        wifi.setId((long) (puntosWifi.size() + 1));
        puntosWifi.add(wifi);
        return wifi;
    }

    // Obtener todos los puntos de Wi-Fi
    @GetMapping
    public List<WifiPublico> obtenerPuntosWifi() {
        return puntosWifi;
    }

    // Cambiar el estado del Wi-Fi
    @PutMapping("/{id}/estado")
    public WifiPublico cambiarEstado(@PathVariable Long id, @RequestParam boolean estado) {
        WifiPublico wifi = puntosWifi.stream()
                .filter(w -> w.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (wifi != null) {
            wifi.setEstado(estado);
        }
        return wifi;
    }
}
