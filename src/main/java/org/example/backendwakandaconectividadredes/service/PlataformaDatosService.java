package org.example.backendwakandaconectividadredes.service;


import org.example.backendwakandaconectividadredes.model.PlataformaDatos;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.PlataformaDatosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlataformaDatosService {

    private final PlataformaDatosRepository plataformaDatosRepository;

    public PlataformaDatosService(PlataformaDatosRepository plataformaDatosRepository) {
        this.plataformaDatosRepository = plataformaDatosRepository;
    }

    public List<PlataformaDatos> obtenerTodas() {
        return plataformaDatosRepository.findAll();
    }

    public Optional<PlataformaDatos> obtenerPorId(Long id) {
        return plataformaDatosRepository.findById(id);
    }

    public PlataformaDatos guardar(PlataformaDatos plataformaDatos) {
        return plataformaDatosRepository.save(plataformaDatos);
    }

    public void eliminar(Long id) {
        plataformaDatosRepository.deleteById(id);
    }
}
