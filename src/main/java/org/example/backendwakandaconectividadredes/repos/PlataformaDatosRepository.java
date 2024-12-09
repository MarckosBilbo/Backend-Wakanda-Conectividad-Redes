package org.example.backendwakandaconectividadredes.repos;
import org.example.backendwakandaconectividadredes.model.PlataformaDatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaDatosRepository extends JpaRepository<PlataformaDatos, Long> {

    // Buscar plataforma por nombre
    PlataformaDatos findByNombre(String nombre);
}
