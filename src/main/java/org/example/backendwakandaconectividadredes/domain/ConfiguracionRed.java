package org.example.backendwakandaconectividadredes.domain;

import jakarta.persistence.*;

@Entity
public class ConfiguracionRed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean accesoPublico;
    private String tipoSeguridad;
    private String contrasena;

    // Constructor vacío requerido por JPA
    public ConfiguracionRed() {}

    // Constructor completo
    public ConfiguracionRed(Long id, boolean accesoPublico, String tipoSeguridad, String contrasena) {
        this.id = id;
        this.accesoPublico = accesoPublico;
        this.tipoSeguridad = tipoSeguridad;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAccesoPublico() {
        return accesoPublico;
    }

    public void setAccesoPublico(boolean accesoPublico) {
        this.accesoPublico = accesoPublico;
    }

    public String getTipoSeguridad() {
        return tipoSeguridad;
    }

    public void setTipoSeguridad(String tipoSeguridad) {
        this.tipoSeguridad = tipoSeguridad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
