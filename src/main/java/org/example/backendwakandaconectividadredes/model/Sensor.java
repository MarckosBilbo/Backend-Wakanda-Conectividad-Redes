package org.example.backendwakandaconectividadredes.model;

import java.time.LocalDateTime;

public class Sensor {
    private Long id;
    private String tipo; // Ejemplo: temperatura, humedad, calidad del aire
    private String ubicacion;
    private double valor;
    private LocalDateTime fechaRegistro;

    // Constructor
    public Sensor(Long id, String tipo, String ubicacion, double valor, LocalDateTime fechaRegistro) {
        this.id = id;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
