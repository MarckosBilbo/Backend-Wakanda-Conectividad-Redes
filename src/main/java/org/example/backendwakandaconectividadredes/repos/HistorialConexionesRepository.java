package org.example.backendwakandaconectividadredes.repos;

import org.example.backendwakandaconectividadredes.model.HistorialConexiones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HistorialConexionesRepository extends JpaRepository<HistorialConexiones, Long> {

    // Buscar registros por usuario (por ID)
    List<HistorialConexiones> findByUsuarioId(Long usuarioId);

    // Buscar registros por red Wi-Fi (por ID)
    List<HistorialConexiones> findByRedWifiId(Long redWifiId);

    // Buscar registros dentro de un rango de fechas
    List<HistorialConexiones> findByFechaConexionBetween(LocalDateTime inicio, LocalDateTime fin);
}
