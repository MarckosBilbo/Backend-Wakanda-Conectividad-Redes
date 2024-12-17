package org.example.backendwakandaconectividadredes.domain;

import jakarta.persistence.*;

@Entity
public class ProveedorInternet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
    @Column
    private String contacto;
    @Column
    private String tipoDeServicio;


    // Constructor vacío requerido por JPA
    public ProveedorInternet() {}

    // Constructor completo
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
