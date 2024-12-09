package org.example.backendwakandaconectividadredes.domain;

public class ConfiguracionRed {
    private Long id;
    private boolean accesoPublico;
    private String tipoSeguridad;
    private String contraseña;

    // Constructor
    public ConfiguracionRed(Long id, boolean accesoPublico, String tipoSeguridad, String contraseña) {
        this.id = id;
        this.accesoPublico = accesoPublico;
        this.tipoSeguridad = tipoSeguridad;
        this.contraseña = contraseña;
    }

    // Getters y setters
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
