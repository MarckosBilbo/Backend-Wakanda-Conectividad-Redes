package org.example.backendwakandaconectividadredes.domain;

import jakarta.persistence.*;
import org.example.backendwakandaconectividadredes.domain.usuario.Usuario;

import java.time.LocalDateTime;

@Entity
public class HistorialConexiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaConexion;

    private Long duracion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "red_wifi_id")
    private RedWifi redWifi;

    // Constructor vacío requerido por JPA
    public HistorialConexiones() {
    }

    // Constructor completo
    public HistorialConexiones(Long id, LocalDateTime fechaConexion, Long duracion, Usuario usuario, RedWifi redWifi) {
        this.id = id;
        this.fechaConexion = fechaConexion;
        this.duracion = duracion;
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
