package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.model.Sensor;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.SensorRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> obtenerTodos() {
        return sensorRepository.findAll();
    }

    public Optional<Sensor> obtenerPorId(Long id) {
        return sensorRepository.findById(id);
    }

    public List<Sensor> obtenerPorTipo(String tipo) {
        return sensorRepository.findByTipo(tipo);
    }

    public List<Sensor> obtenerPorRangoDeFechas(LocalDateTime inicio, LocalDateTime fin) {
        return sensorRepository.findByFechaRegistroBetween(inicio, fin);
    }

    public Sensor guardar(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    public void eliminar(Long id) {
        sensorRepository.deleteById(id);
    }
}
