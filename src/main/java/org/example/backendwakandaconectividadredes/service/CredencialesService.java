package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.usuario.Credenciales;
import org.example.backendwakandaconectividadredes.model.usuario.CredencialesDTO;
import org.example.backendwakandaconectividadredes.repos.CredencialesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CredencialesService {

    private final CredencialesRepository credencialesRepository;

    public CredencialesService(CredencialesRepository credencialesRepository) {
        this.credencialesRepository = credencialesRepository;
    }

    // Guardar Credenciales
    public CredencialesDTO guardar(CredencialesDTO credencialesDTO) {
        Credenciales credenciales = convertirADominio(credencialesDTO);
        Credenciales credencialesGuardadas = credencialesRepository.save(credenciales);
        return convertirADTO(credencialesGuardadas);
    }

    // Obtener Credenciales por Correo
    public Optional<CredencialesDTO> obtenerPorCorreo(String correo) {
        return credencialesRepository.findByCorreo(correo)
                .map(this::convertirADTO); // Mapear Credenciales a CredencialesDTO
    }

    // Métodos de Conversión entre Entidad y DTO
    private Credenciales convertirADominio(CredencialesDTO credencialesDTO) {
        return new Credenciales(
                credencialesDTO.getId(),
                credencialesDTO.getCorreo(),
                credencialesDTO.getPassword()
        );
    }

    private CredencialesDTO convertirADTO(Credenciales credenciales) {
        return new CredencialesDTO(
                credenciales.getId(),
                credenciales.getCorreo(),
                credenciales.getPassword()
        );
    }
}
