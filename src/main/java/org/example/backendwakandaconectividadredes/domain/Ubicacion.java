package org.example.backendwakandaconectividadredes.domain;

import jakarta.persistence.*;

@Entity
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String direccion;
    @Column
    private String ciudad;
    @Column
    private String coordenadas;

    // Constructor vacío requerido por JPA
    public Ubicacion() {
    }

    // Constructor completo
    public Ubicacion(Long id, String direccion, String ciudad, String coordenadas) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.coordenadas = coordenadas;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
