package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.model.HistorialConexiones;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.HistorialConexionesRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialConexionesService {

    private final HistorialConexionesRepository historialConexionesRepository;

    public HistorialConexionesService(HistorialConexionesRepository historialConexionesRepository) {
        this.historialConexionesRepository = historialConexionesRepository;
    }

    public List<HistorialConexiones> obtenerTodos() {
        return historialConexionesRepository.findAll();
    }

    public Optional<HistorialConexiones> obtenerPorId(Long id) {
        return historialConexionesRepository.findById(id);
    }

    public List<HistorialConexiones> obtenerPorUsuario(Long usuarioId) {
        return historialConexionesRepository.findByUsuarioId(usuarioId);
    }

    public List<HistorialConexiones> obtenerPorRedWifi(Long redWifiId) {
        return historialConexionesRepository.findByRedWifiId(redWifiId);
    }

    public List<HistorialConexiones> obtenerPorRangoDeFechas(LocalDateTime inicio, LocalDateTime fin) {
        return historialConexionesRepository.findByFechaConexionBetween(inicio, fin);
    }

    public HistorialConexiones guardar(HistorialConexiones historialConexiones) {
        return historialConexionesRepository.save(historialConexiones);
    }

    public void eliminar(Long id) {
        historialConexionesRepository.deleteById(id);
    }
}
