package org.example.backendwakandaconectividadredes.service;

import org.example.backendwakandaconectividadredes.model.ProveedorInternet;
import org.springframework.stereotype.Service;
import org.example.backendwakandaconectividadredes.repos.ProveedorInternetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorInternetService {

    private final ProveedorInternetRepository proveedorInternetRepository;

    public ProveedorInternetService(ProveedorInternetRepository proveedorInternetRepository) {
        this.proveedorInternetRepository = proveedorInternetRepository;
    }

    public List<ProveedorInternet> obtenerTodos() {
        return proveedorInternetRepository.findAll();
    }

    public Optional<ProveedorInternet> obtenerPorId(Long id) {
        return proveedorInternetRepository.findById(id);
    }

    public ProveedorInternet guardar(ProveedorInternet proveedorInternet) {
        return proveedorInternetRepository.save(proveedorInternet);
    }

    public void eliminar(Long id) {
        proveedorInternetRepository.deleteById(id);
    }

    public List<ProveedorInternet> obtenerPorTipoServicio(String tipoDeServicio) {
        return proveedorInternetRepository.findByTipoDeServicio(tipoDeServicio);
    }
}
