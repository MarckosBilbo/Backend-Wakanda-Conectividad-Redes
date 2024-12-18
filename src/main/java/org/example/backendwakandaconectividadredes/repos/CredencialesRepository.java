package org.example.backendwakandaconectividadredes.repos;

import org.example.backendwakandaconectividadredes.domain.usuario.Credenciales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredencialesRepository extends JpaRepository<Credenciales, Long> {

    // Buscar credenciales por correo
    Optional<Credenciales> findByCorreo(String correo);
}
