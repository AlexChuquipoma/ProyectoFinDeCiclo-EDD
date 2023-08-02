/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.modelo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alexr
 */
public class Contacto {
    private String nombre;
    private String numeroTelefono;
    private List<String> correos;
    private Map<String, String> redesSociales;

    public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correos = new LinkedList<>();
        this.redesSociales = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public List<String> getCorreos() {
        return correos;
    }

    public Map<String, String> getRedesSociales() {
        return redesSociales;
    }

    public void agregarCorreo(String correo) {
        correos.add(correo);
    }

    public void agregarRedSocial(String redSocial, String url) {
        redesSociales.put(redSocial, url);
    }
    
     void setNumeroTelefono(String numeroTelefono) {
       this.numeroTelefono = numeroTelefono;
    }

    void setNombre(String nombre) {
       this.nombre = nombre;
    }

   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Teléfono: ").append(numeroTelefono).append("\n");
        sb.append("Correos: ").append(correos).append("\n");
        sb.append("Redes Sociales: ").append(redesSociales).append("\n");
        return sb.toString();
    }

   
}

