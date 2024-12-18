package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.usuario.Credenciales;
import org.example.backendwakandaconectividadredes.repos.CredencialesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CredencialesService {

    private final CredencialesRepository credencialesRepository;

    public CredencialesService(CredencialesRepository credencialesRepository) {
        this.credencialesRepository = credencialesRepository;
    }

    // Guardar credenciales
    public Credenciales guardar(Credenciales credenciales) {
        return credencialesRepository.save(credenciales);
    }

    // Obtener credenciales por correo
    public Optional<Credenciales> obtenerPorCorreo(String correo) {
        return credencialesRepository.findByCorreo(correo);
    }

    // Eliminar credenciales por ID
    public void eliminarPorId(Long id) {
        credencialesRepository.deleteById(id);
    }
}
