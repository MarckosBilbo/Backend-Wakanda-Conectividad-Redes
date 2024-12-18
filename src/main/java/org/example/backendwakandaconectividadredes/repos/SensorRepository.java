package org.example.backendwakandaconectividadredes.repos;


import org.example.backendwakandaconectividadredes.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {

    // Buscar sensores por tipo
    List<Sensor> findByTipo(String tipo);

    // Buscar sensores por rango de tiempo
    List<Sensor> findByFechaRegistroBetween(LocalDateTime inicio, LocalDateTime fin);
}
