/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.modelo;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author alexr
 */
public class Contacto {

    private String nombre;
    private String numero;
    LinkedList<String> correos;
    HashMap<String, String> redesSociales;

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.correos = new LinkedList<>();
        this.redesSociales = new HashMap<>();
    }
    public void agregarCorreo(String correo) {
        correos.add(correo);
    }

    public void agregarRedSocial(String redSocial, String url) {
        redesSociales.put(redSocial, url);
    }

    

    public Contacto() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }
}
