/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.proyectofindeciclo.edd;

import ec.edu.ups.proyectofindeciclo.edd.controlador.Controlador;
import ec.edu.ups.proyectofindeciclo.edd.modelo.ArbolContactos;
import ec.edu.ups.proyectofindeciclo.edd.vista.Vista;


/**
 *
 * @author alexr
 */
public class ProyectoFinDeCicloEDD {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Vista vista = new Vista();
        ArbolContactos arbolContactos = new ArbolContactos();
        controlador.ejecutar();
    }
}
