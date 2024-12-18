package org.example.backendwakandaconectividadredes.model;

import org.example.backendwakandaconectividadredes.model.ConfiguracionRed;

public class ConfiguracionRed {
    private Long id;
    private boolean accesoPublico;
    private String tipoSeguridad;

    // Constructor vacío
    public ConfiguracionRed() {
    }

    // Constructor con parámetros
    public ConfiguracionRed(Long id, boolean accesoPublico, String tipoSeguridad) {
        this.id = id;
        this.accesoPublico = accesoPublico;
        this.tipoSeguridad = tipoSeguridad;
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
}
