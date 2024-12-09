package org.example.backendwakandaconectividadredes.service;


import org.example.backendwakandaconectividadredes.model.RedWifi;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.RedWifiRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RedWifiService {

    private final RedWifiRepository redWifiRepository;

    public RedWifiService(RedWifiRepository redWifiRepository) {
        this.redWifiRepository = redWifiRepository;
    }

    public List<RedWifi> obtenerTodas() {
        return redWifiRepository.findAll();
    }

    public Optional<RedWifi> obtenerPorId(Long id) {
        return redWifiRepository.findById(id);
    }

    public List<RedWifi> obtenerEncendidas() {
        return redWifiRepository.findByEstadoEncendidaTrue();
    }

    public RedWifi guardar(RedWifi redWifi) {
        return redWifiRepository.save(redWifi);
    }

    public void eliminar(Long id) {
        redWifiRepository.deleteById(id);
    }
}
