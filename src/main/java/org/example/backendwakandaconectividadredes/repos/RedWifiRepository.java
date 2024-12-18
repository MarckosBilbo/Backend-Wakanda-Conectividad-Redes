package org.example.backendwakandaconectividadredes.repos;

import org.example.backendwakandaconectividadredes.domain.RedWifi;
import org.example.backendwakandaconectividadredes.domain.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedWifiRepository extends JpaRepository<RedWifi, Long> {

    // Buscar redes Wi-Fi por proveedor
    List<RedWifi> findByProveedor(String proveedor);

    // Listar redes Wi-Fi encendidas
    List<RedWifi> findByEstadoEncendidaTrue();

    // Buscar redes Wi-Fi por ubicación
    List<RedWifi> findByUbicacion(Ubicacion ubicacion);
}
