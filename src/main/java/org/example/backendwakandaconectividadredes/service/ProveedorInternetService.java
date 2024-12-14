package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.domain.ProveedorInternet;
import org.example.backendwakandaconectividadredes.repos.ProveedorInternetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorInternetService {

    private final ProveedorInternetRepository proveedorInternetRepository;

    public ProveedorInternetService(ProveedorInternetRepository proveedorInternetRepository) {
        this.proveedorInternetRepository = proveedorInternetRepository;
    }

    // Obtener todos los proveedores de internet
    public List<ProveedorInternet> obtenerTodos() {
        return proveedorInternetRepository.findAll();
    }

    // Obtener un proveedor de internet por ID
    public Optional<ProveedorInternet> obtenerPorId(Long id) {
        return proveedorInternetRepository.findById(id);
    }

    // Guardar un proveedor de internet
    public ProveedorInternet guardar(ProveedorInternet proveedorInternet) {
        return proveedorInternetRepository.save(proveedorInternet);
    }

    // Eliminar un proveedor de internet por ID
    public void eliminar(Long id) {
        proveedorInternetRepository.deleteById(id);
    }

    // Obtener proveedores de internet por tipo de servicio
    public List<ProveedorInternet> obtenerPorTipoServicio(String tipoDeServicio) {
        return proveedorInternetRepository.findByTipoDeServicio(tipoDeServicio);
    }
}
