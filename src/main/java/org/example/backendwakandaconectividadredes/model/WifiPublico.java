package org.example.backendwakandaconectividadredes.model;


public class WifiPublico {
    private Long id;
    private String ubicacion;
    private boolean estado; // Encendido/Apagado
    private int usuariosConectados;

    // Constructor
    public WifiPublico(Long id, String ubicacion, boolean estado, int usuariosConectados) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.usuariosConectados = usuariosConectados;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getUsuariosConectados() {
        return usuariosConectados;
    }

    public void setUsuariosConectados(int usuariosConectados) {
        this.usuariosConectados = usuariosConectados;
    }
}
