package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.HistorialConexiones;
import org.example.backendwakandaconectividadredes.repos.HistorialConexionesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialConexionesService {

    private final HistorialConexionesRepository historialConexionesRepository;

    public HistorialConexionesService(HistorialConexionesRepository historialConexionesRepository) {
        this.historialConexionesRepository = historialConexionesRepository;
    }

    // Obtener todas las conexiones
    public List<HistorialConexiones> obtenerTodos() {
        return historialConexionesRepository.findAll();
    }

    // Obtener una conexión por ID
    public Optional<HistorialConexiones> obtenerPorId(Long id) {
        return historialConexionesRepository.findById(id);
    }

    // Obtener conexiones por usuario (ID)
    public List<HistorialConexiones> obtenerPorUsuario(Long usuarioId) {
        return historialConexionesRepository.findByUsuarioId(usuarioId);
    }

    // Obtener conexiones por red Wi-Fi (ID)
    public List<HistorialConexiones> obtenerPorRedWifi(Long redWifiId) {
        return historialConexionesRepository.findByRedWifiId(redWifiId);
    }

    // Obtener conexiones por rango de fechas
    public List<HistorialConexiones> obtenerPorRangoDeFechas(LocalDateTime inicio, LocalDateTime fin) {
        return historialConexionesRepository.findByFechaConexionBetween(inicio, fin);
    }

    // Guardar una conexión
    public HistorialConexiones guardar(HistorialConexiones historialConexiones) {
        return historialConexionesRepository.save(historialConexiones);
    }

    // Eliminar una conexión por ID
    public void eliminar(Long id) {
        historialConexionesRepository.deleteById(id);
    }
}
