package org.example.backendwakandaconectividadredes;

import org.example.backendwakandaconectividadredes.domain.HistorialConexiones;
import org.example.backendwakandaconectividadredes.domain.ProveedorInternet;
import org.example.backendwakandaconectividadredes.domain.RedWifi;
import org.example.backendwakandaconectividadredes.domain.usuario.Credenciales;
import org.example.backendwakandaconectividadredes.domain.usuario.Usuario;
import org.example.backendwakandaconectividadredes.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class BackendWakandaConectividadRedesApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private CredencialesService credencialesService;

    @Autowired
    private RedWifiService redWifiService;

    @Autowired
    private ProveedorInternetService proveedorInternetService;

    @Autowired
    private HistorialConexionesService historialConexionesService;

    public static void main(String[] args) {
        SpringApplication.run(BackendWakandaConectividadRedesApplication.class, args);
        System.out.println("¡La aplicación Backend Wakanda Conectividad Redes está corriendo!");
    }

    @Override
    public void run(String... args) {
        // Pruebas con Credenciales
        Credenciales credenciales = new Credenciales(null, "tchalla@wakanda.com", "password123");
        credencialesService.guardar(credenciales);

        // Pruebas con Usuarios
        Usuario usuario = new Usuario(null, "T'Challa", "Black Panther", "tchalla@wakanda.com", "123456789", credenciales, List.of("ADMIN"));
        usuarioService.create(usuario); // Cambio de 'guardar' a 'create'
        System.out.println("Usuario guardado: " + usuarioService.get(usuario.getId())); // Cambio de 'obtenerPorId' a 'get'

        // Pruebas con Proveedores de Internet
        ProveedorInternet proveedor = new ProveedorInternet(null, "Wakanda ISP", "123456789", "Fibra Óptica");
        proveedorInternetService.guardar(proveedor);
        System.out.println("Proveedores: " + proveedorInternetService.obtenerTodos());

        // Pruebas con Redes Wi-Fi
        RedWifi redWifi = new RedWifi(null, "Red Wakanda", "1 Gbps", true, "Wakanda ISP", 100, null, null, proveedor);
        redWifiService.guardar(redWifi);
        System.out.println("Redes Wi-Fi encendidas: " + redWifiService.obtenerEncendidas());

        // Pruebas con Historial de Conexiones
        HistorialConexiones conexion = new HistorialConexiones(null, LocalDateTime.now(), 120L, usuario, redWifi);
        historialConexionesService.guardar(conexion);
        System.out.println("Historial de Conexiones: " + historialConexionesService.obtenerTodos());
    }
}
