package org.example.backendwakandaconectividadredes.model;


public class RedWifi {
    private Long id;
    private String nombre;
    private String bandaAncha;
    private boolean estadoEncendida;
    private ConfiguracionRed configuracionRed;

    // Constructor vacío
    public RedWifi() {
    }

    // Constructor con parámetros
    public RedWifi(Long id, String nombre, String bandaAncha, boolean estadoEncendida, ConfiguracionRed configuracionRed) {
        this.id = id;
        this.nombre = nombre;
        this.bandaAncha = bandaAncha;
        this.estadoEncendida = estadoEncendida;
        this.configuracionRed = configuracionRed;
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

    public String getBandaAncha() {
        return bandaAncha;
    }

    public void setBandaAncha(String bandaAncha) {
        this.bandaAncha = bandaAncha;
    }

    public boolean isEstadoEncendida() {
        return estadoEncendida;
    }

    public void setEstadoEncendida(boolean estadoEncendida) {
        this.estadoEncendida = estadoEncendida;
    }

    public ConfiguracionRed getConfiguracionRed() {
        return configuracionRed;
    }

    public void setConfiguracionRed(ConfiguracionRed configuracionRed) {
        this.configuracionRed = configuracionRed;
    }
}
