package org.example.backendwakandaconectividadredes.model;

import java.time.LocalDateTime;
import org.example.backendwakandaconectividadredes.model.usuario.UsuarioDTO;
import org.example.backendwakandaconectividadredes.model.usuario.CredencialesDTO;

public class HistorialConexiones {
    private Long id;
    private LocalDateTime fechaConexion;
    private UsuarioDTO usuario;
    private RedWifi redWifi;

    // Constructor vacío
    public HistorialConexiones() {
    }

    // Constructor con parámetros
    public HistorialConexiones(Long id, LocalDateTime fechaConexion, UsuarioDTO usuario, RedWifi redWifi) {
        this.id = id;
        this.fechaConexion = fechaConexion;
        this.usuario = usuario;
        this.redWifi = redWifi;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(LocalDateTime fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public RedWifi getRedWifi() {
        return redWifi;
    }

    public void setRedWifi(RedWifi redWifi) {
        this.redWifi = redWifi;
    }
}
