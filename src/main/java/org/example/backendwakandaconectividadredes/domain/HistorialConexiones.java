package org.example.backendwakandaconectividadredes.domain;


import org.example.backendwakandaconectividadredes.domain.usuario.Usuario;

import java.util.Date;

public class HistorialConexiones {
    private Long id;
    private Date fechaConexion;
    private Long duracion;
    private Usuario usuario;
    private RedWifi redWifi;

    // Constructor
    public HistorialConexiones(Long id, Date fechaConexion, Long duracion, Usuario usuario, RedWifi redWifi) {
        this.id = id;
        this.fechaConexion = fechaConexion;
        this.duracion = duracion;
        this.usuario = usuario;
        this.redWifi = redWifi;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(Date fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public RedWifi getRedWifi() {
        return redWifi;
    }

    public void setRedWifi(RedWifi redWifi) {
        this.redWifi = redWifi;
    }
}
