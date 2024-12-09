package org.example.backendwakandaconectividadredes.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Credenciales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;
    private String password;

    // Constructor vacío requerido por JPA
    public Credenciales() {
    }

    // Constructor con parámetros
    public Credenciales(Long id, String correo, String password) {
        this.id = id;
        this.correo = correo;
        this.password = password;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

