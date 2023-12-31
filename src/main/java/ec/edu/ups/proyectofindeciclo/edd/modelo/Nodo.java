/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.modelo;

/**
 *
 * @author alexr
 */
public class Nodo {
    
    private Contacto contacto;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
