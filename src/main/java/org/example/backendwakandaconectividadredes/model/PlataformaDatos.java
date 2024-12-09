package org.example.backendwakandaconectividadredes.model;


import java.util.List;

public class PlataformaDatos {
    private Long id;
    private String nombre;
    private String descripcion;
    private List<Sensor> sensores;

    // Constructor
    public PlataformaDatos(Long id, String nombre, String descripcion, List<Sensor> sensores) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sensores = sensores;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }
}
