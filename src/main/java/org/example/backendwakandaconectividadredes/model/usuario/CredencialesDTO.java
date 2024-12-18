package org.example.backendwakandaconectividadredes.model.usuario;

public class CredencialesDTO {
    private Long id;
    private String correo;
    private String password;

    // Constructor vacío
    public CredencialesDTO() {
    }

    // Constructor con parámetros
    public CredencialesDTO(Long id, String correo, String password) {
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
