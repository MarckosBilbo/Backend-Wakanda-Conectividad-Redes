package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.ConfiguracionRed;
import org.example.backendwakandaconectividadredes.repos.ConfiguracionRedRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfiguracionRedService {

    private final ConfiguracionRedRepository configuracionRedRepository;

    public ConfiguracionRedService(ConfiguracionRedRepository configuracionRedRepository) {
        this.configuracionRedRepository = configuracionRedRepository;
    }

    // Obtener todas las configuraciones
    public List<ConfiguracionRed> obtenerTodas() {
        return configuracionRedRepository.findAll();
    }

    // Obtener una configuración por ID
    public Optional<ConfiguracionRed> obtenerPorId(Long id) {
        return configuracionRedRepository.findById(id);
    }

    // Guardar una configuración
    public ConfiguracionRed guardar(ConfiguracionRed configuracionRed) {
        return configuracionRedRepository.save(configuracionRed);
    }

    // Eliminar una configuración por ID
    public void eliminar(Long id) {
        configuracionRedRepository.deleteById(id);
    }

    // Obtener configuraciones por tipo de seguridad
    public List<ConfiguracionRed> obtenerPorTipoSeguridad(String tipoSeguridad) {
        return configuracionRedRepository.findByTipoSeguridad(tipoSeguridad);
    }

    // Obtener configuraciones públicas
    public List<ConfiguracionRed> obtenerPublicas() {
        return configuracionRedRepository.findByAccesoPublicoTrue();
    }
}
