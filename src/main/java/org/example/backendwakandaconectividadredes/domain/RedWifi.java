package org.example.backendwakandaconectividadredes.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RedWifi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
    @Column
    private String bandaAncha;
    @Column
    private boolean estadoEncendida;
    @Column
    private String proveedor;
    @Column
    private int numeroDeUsuarios;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ubicacion_id", nullable = false)
    private Ubicacion ubicacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "configuracion_red_id", nullable = false)
    private ConfiguracionRed configuracionRed;

    @ManyToOne
    @JoinColumn(name = "proveedor_internet_id", nullable = false)
    private ProveedorInternet proveedorInternet;

    @OneToMany(mappedBy = "redWifi", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistorialConexiones> historialConexiones = new ArrayList<>();

    // Constructor vacío requerido por JPA
    public RedWifi() {
    }

    // Constructor completo
    public RedWifi(Long id, String nombre, String bandaAncha, boolean estadoEncendida,
                   String proveedor, int numeroDeUsuarios, Ubicacion ubicacion,
                   ConfiguracionRed configuracionRed, ProveedorInternet proveedorInternet) {
        this.id = id;
        this.nombre = nombre;
        this.bandaAncha = bandaAncha;
        this.estadoEncendida = estadoEncendida;
        this.proveedor = proveedor;
        this.numeroDeUsuarios = numeroDeUsuarios;
        this.ubicacion = ubicacion;
        this.configuracionRed = configuracionRed;
        this.proveedorInternet = proveedorInternet;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumeroDeUsuarios() {
        return numeroDeUsuarios;
    }

    public void setNumeroDeUsuarios(int numeroDeUsuarios) {
        this.numeroDeUsuarios = numeroDeUsuarios;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ConfiguracionRed getConfiguracionRed() {
        return configuracionRed;
    }

    public void setConfiguracionRed(ConfiguracionRed configuracionRed) {
        this.configuracionRed = configuracionRed;
    }

    public ProveedorInternet getProveedorInternet() {
        return proveedorInternet;
    }

    public void setProveedorInternet(ProveedorInternet proveedorInternet) {
        this.proveedorInternet = proveedorInternet;
    }

    public List<HistorialConexiones> getHistorialConexiones() {
        return historialConexiones;
    }

    public void setHistorialConexiones(List<HistorialConexiones> historialConexiones) {
        this.historialConexiones = historialConexiones;
    }
}
