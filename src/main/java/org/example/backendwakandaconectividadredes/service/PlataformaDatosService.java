package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.model.PlataformaDatos;
import org.example.backendwakandaconectividadredes.model.Sensor;
import org.example.backendwakandaconectividadredes.repos.PlataformaDatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlataformaDatosService {

    private final PlataformaDatosRepository plataformaDatosRepository;

    @Autowired
    public PlataformaDatosService(PlataformaDatosRepository plataformaDatosRepository) {
        this.plataformaDatosRepository = plataformaDatosRepository;
    }

    public PlataformaDatos guardar(PlataformaDatos plataforma) {
        return plataformaDatosRepository.save(plataforma);
    }

    public List<PlataformaDatos> obtenerTodas() {
        return plataformaDatosRepository.findAll();
    }

    public PlataformaDatos agregarSensor(Long id, Sensor sensor) {
        PlataformaDatos plataforma = plataformaDatosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plataforma no encontrada con ID: " + id));
        plataforma.getSensores().add(sensor);
        return plataformaDatosRepository.save(plataforma);
    }
}
