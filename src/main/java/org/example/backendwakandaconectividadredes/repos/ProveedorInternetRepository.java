package org.example.backendwakandaconectividadredes.repos;

import org.example.backendwakandaconectividadredes.domain.ProveedorInternet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProveedorInternetRepository extends JpaRepository<ProveedorInternet, Long> {

    // Buscar proveedores por tipo de servicio
    List<ProveedorInternet> findByTipoDeServicio(String tipoDeServicio);
}
