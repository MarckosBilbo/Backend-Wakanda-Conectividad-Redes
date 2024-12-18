package org.example.backendwakandaconectividadredes.repos;

import org.example.backendwakandaconectividadredes.domain.ConfiguracionRed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfiguracionRedRepository extends JpaRepository<ConfiguracionRed, Long> {

    // Buscar configuraciones por tipo de seguridad
    List<ConfiguracionRed> findByTipoSeguridad(String tipoSeguridad);

    // Buscar configuraciones de acceso público
    List<ConfiguracionRed> findByAccesoPublicoTrue();
}
