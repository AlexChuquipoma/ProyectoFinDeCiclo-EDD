/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.controlador;

import ec.edu.ups.proyectofindeciclo.edd.modelo.ArbolContactos;
import ec.edu.ups.proyectofindeciclo.edd.modelo.Contacto;
import ec.edu.ups.proyectofindeciclo.edd.vista.Vista;

/**
 *
 * @author alexr
 */
public class Controlador {
    private ArbolContactos arbol;

    public Controlador() {
        arbol = new ArbolContactos();
    }

    public void ejecutar() {
        int opcion;

        do {
            opcion = Vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarContacto();
                    break;
                case 3:
                    eliminarContacto();
                    break;
                case 4:
                    agregarCorreo();
                    break;
                case 5:
                    agregarRedSocial();
                    break;
                case 6:
                    arbol.imprimirPreorder();
                    break;
                case 7:
                    arbol.imprimirInorder();
                    break;
                case 8:
                    arbol.imprimirPostorder();
                    break;
                case 9:
                    arbol.imprimirAnchura();
                    break;
                case 10:
                    mostrarNumeroContactos();
                    break;
                case 11:
                    mostrarNumeroNiveles();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    Vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private void agregarContacto() {
        
        String nombre = Vista.ingresarNombreContacto();
        String numeroTelefono = Vista.ingresarNumeroTelefono();
        Contacto nuevoContacto = new Contacto(nombre, numeroTelefono);
        arbol.agregarContacto(nuevoContacto);
        Vista.mostrarMensaje("Contacto agregado correctamente.");
    }

    private void buscarContacto() {
        String nombre = Vista.ingresarNombreContacto();
        Contacto contactoEncontrado = arbol.buscarContacto(nombre);
        if (contactoEncontrado != null) {
            Vista.mostrarMensaje("Contacto encontrado:\n" + contactoEncontrado);
        } else {
           
             Vista.mostrarMensaje("Contacto no encontrado.");
            String opcionAgregar = Vista.ingresarOpcion("¿Desea agregar un nuevo contacto con ese nombre? (S/N): ");
            if (opcionAgregar.equalsIgnoreCase("S")) {
                String numeroTelefono = Vista.ingresarNumeroTelefono();
                Contacto nuevoContacto = new Contacto(nombre, numeroTelefono);
                arbol.agregarContacto(nuevoContacto);
                Vista.mostrarMensaje("Nuevo contacto agregado correctamente.");
            }
        }
    }

    private void eliminarContacto() {
        String nombre = Vista.ingresarNombreContacto();
        arbol.eliminarContacto(nombre);
        Vista.mostrarMensaje("Contacto eliminado correctamente.");
    }

    private void agregarCorreo() {
        String nombre = Vista.ingresarNombreContacto();
        String correo = Vista.ingresarCorreo();
        arbol.agregarCorreo(nombre, correo);
    }

    private void agregarRedSocial() {
        String nombre = Vista.ingresarNombreContacto();
        String redSocial = Vista.ingresarRedSocial();
        String url = Vista.ingresarURL();
        arbol.agregarRedSocial(nombre, redSocial, url);
    }

    private void mostrarNumeroContactos() {
        
        int numeroContactos = arbol.obtenerNumeroContactos();
        Vista.mostrarMensaje("Número de contactos: " + numeroContactos);
    }

    private void mostrarNumeroNiveles() {
        int numeroNiveles = arbol.obtenerNumeroNiveles();
        Vista.mostrarMensaje("Número de niveles del árbol: " + numeroNiveles);
    }
}

