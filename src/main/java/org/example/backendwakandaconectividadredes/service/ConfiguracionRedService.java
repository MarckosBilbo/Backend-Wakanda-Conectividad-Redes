package org.example.backendwakandaconectividadredes.service;


import org.example.backendwakandaconectividadredes.model.ConfiguracionRed;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.ConfiguracionRedRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ConfiguracionRedService {

    private final ConfiguracionRedRepository configuracionRedRepository;

    public ConfiguracionRedService(ConfiguracionRedRepository configuracionRedRepository) {
        this.configuracionRedRepository = configuracionRedRepository;
    }

    public List<ConfiguracionRed> obtenerTodas() {
        return configuracionRedRepository.findAll();
    }

    public Optional<ConfiguracionRed> obtenerPorId(Long id) {
        return configuracionRedRepository.findById(id);
    }

    public List<ConfiguracionRed> obtenerPorTipoSeguridad(String tipoSeguridad) {
        return configuracionRedRepository.findByTipoSeguridad(tipoSeguridad);
    }

    public ConfiguracionRed guardar(ConfiguracionRed configuracionRed) {
        return configuracionRedRepository.save(configuracionRed);
    }

    public void eliminar(Long id) {
        configuracionRedRepository.deleteById(id);
    }
}
