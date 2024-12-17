package org.example.backendwakandaconectividadredes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String ubicacion;

    private LocalDateTime fechaRegistro; // Nuevo campo agregado

    // Constructor vacío requerido por JPA
    public Sensor() {}

    // Constructor completo
    public Sensor(String tipo, String ubicacion, LocalDateTime fechaRegistro) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
