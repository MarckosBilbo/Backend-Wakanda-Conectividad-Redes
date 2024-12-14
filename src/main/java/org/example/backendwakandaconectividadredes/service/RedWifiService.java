package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.RedWifi;
import org.example.backendwakandaconectividadredes.repos.RedWifiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedWifiService {

    private final RedWifiRepository redWifiRepository;

    public RedWifiService(RedWifiRepository redWifiRepository) {
        this.redWifiRepository = redWifiRepository;
    }

    // Obtener todas las redes Wi-Fi
    public List<RedWifi> obtenerTodas() {
        return redWifiRepository.findAll();
    }

    // Obtener una red Wi-Fi por ID
    public Optional<RedWifi> obtenerPorId(Long id) {
        return redWifiRepository.findById(id);
    }

    // Obtener redes Wi-Fi encendidas
    public List<RedWifi> obtenerEncendidas() {
        return redWifiRepository.findByEstadoEncendidaTrue();
    }

    // Guardar una red Wi-Fi
    public RedWifi guardar(RedWifi redWifi) {
        return redWifiRepository.save(redWifi);
    }

    // Eliminar una red Wi-Fi por ID
    public void eliminar(Long id) {
        redWifiRepository.deleteById(id);
    }
}
