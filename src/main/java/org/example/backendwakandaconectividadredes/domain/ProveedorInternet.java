package org.example.backendwakandaconectividadredes.domain;

public class ProveedorInternet {
    private Long id;
    private String nombre;
    private String contacto;
    private String tipoDeServicio;

    // Constructor
    public ProveedorInternet(Long id, String nombre, String contacto, String tipoDeServicio) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.tipoDeServicio = tipoDeServicio;
    }

    // Getters y setters
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    public void setTipoDeServicio(String tipoDeServicio) {
        this.tipoDeServicio = tipoDeServicio;
    }
}
