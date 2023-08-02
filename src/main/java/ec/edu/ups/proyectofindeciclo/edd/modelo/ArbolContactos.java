/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class ArbolContactos {
    private Nodo raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void agregarContacto(Contacto contacto) {
        raiz = agregarContactoRecursivo(raiz, contacto);
    }

    private Nodo agregarContactoRecursivo(Nodo nodo, Contacto contacto) {
        if (nodo == null) {
            return new Nodo(contacto);
        }

        String nombreActual = nodo.getContacto().getNombre();
        String nuevoNombre = contacto.getNombre();

        if (nuevoNombre.compareTo(nombreActual) < 0) {
            nodo.setIzquierdo(agregarContactoRecursivo(nodo.getIzquierdo(), contacto));
        } else if (nuevoNombre.compareTo(nombreActual) > 0) {
            nodo.setDerecho(agregarContactoRecursivo(nodo.getDerecho(), contacto));
        } else {
            System.out.println("El contacto ya existe. ¿Desea actualizar el número de teléfono? (S/N)");
            Scanner scanner = new Scanner(System.in);
            String opcion = scanner.nextLine().trim().toUpperCase();
            if (opcion.equals("S")) {
                nodo.getContacto().setNumeroTelefono(contacto.getNumeroTelefono());
                System.out.println("Número de teléfono actualizado.");
            } else {
                System.out.println("Contacto existente no actualizado.");
            }
        }
        return nodo;
    }

    public Contacto buscarContacto(String nombre) {
        return buscarContactoRecursivo(raiz, nombre);
    }

    private Contacto buscarContactoRecursivo(Nodo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        String nombreActual = nodo.getContacto().getNombre();

        if (nombre.equals(nombreActual)) {
            return nodo.getContacto();
        } else if (nombre.compareTo(nombreActual) < 0) {
            return buscarContactoRecursivo(nodo.getIzquierdo(), nombre);
        } else {
            return buscarContactoRecursivo(nodo.getDerecho(), nombre);
        }
    }

    public void eliminarContacto(String nombre) {
        raiz = eliminarContactoRecursivo(raiz, nombre);
    }

    private Nodo eliminarContactoRecursivo(Nodo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        String nombreActual = nodo.getContacto().getNombre();

        if (nombre.compareTo(nombreActual) < 0) {
            nodo.setIzquierdo(eliminarContactoRecursivo(nodo.getIzquierdo(), nombre));
        } else if (nombre.compareTo(nombreActual) > 0) {
            nodo.setDerecho(eliminarContactoRecursivo(nodo.getDerecho(), nombre));
        } else {
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }

            Nodo sucesor = encontrarSucesor(nodo.getDerecho());
            nodo.getContacto().setNombre(sucesor.getContacto().getNombre());
            nodo.getContacto().setNumeroTelefono(sucesor.getContacto().getNumeroTelefono());
            nodo.setDerecho(eliminarContactoRecursivo(nodo.getDerecho(), sucesor.getContacto().getNombre()));
        }

        return nodo;
    }

    private Nodo encontrarSucesor(Nodo nodo) {
        if (nodo.getIzquierdo() == null) {
            return nodo;
        }
        return encontrarSucesor(nodo.getIzquierdo());
    }

    public void agregarCorreo(String nombre, String correo) {
        Nodo nodoContacto = buscarNodoContacto(raiz, nombre);
        if (nodoContacto != null) {
            nodoContacto.getContacto().agregarCorreo(correo);
            System.out.println("Correo agregado correctamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void agregarRedSocial(String nombre, String redSocial, String url) {
        Nodo nodoContacto = buscarNodoContacto(raiz, nombre);
        if (nodoContacto != null) {
            nodoContacto.getContacto().agregarRedSocial(redSocial, url);
            System.out.println("Red social agregada correctamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    private Nodo buscarNodoContacto(Nodo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        String nombreActual = nodo.getContacto().getNombre();

        if (nombre.equals(nombreActual)) {
            return nodo;
        } else if (nombre.compareTo(nombreActual) < 0) {
            return buscarNodoContacto(nodo.getIzquierdo(), nombre);
        } else {
            return buscarNodoContacto(nodo.getDerecho(), nombre);
        }
    }

    public void imprimirPreorder() {
        System.out.println("Árbol en Preorder:");
        imprimirPreorderRecursivo(raiz);
    }

    private void imprimirPreorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getContacto());
            imprimirPreorderRecursivo(nodo.getIzquierdo());
            imprimirPreorderRecursivo(nodo.getDerecho());
        }
    }

    public void imprimirInorder() {
        System.out.println("Árbol en Inorder:");
        imprimirInorderRecursivo(raiz);
    }

    private void imprimirInorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirInorderRecursivo(nodo.getIzquierdo());
            System.out.println(nodo.getContacto());
            imprimirInorderRecursivo(nodo.getDerecho());
        }
    }

    public void imprimirPostorder() {
        System.out.println("Árbol en Postorder:");
        imprimirPostorderRecursivo(raiz);
    }

    private void imprimirPostorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirPostorderRecursivo(nodo.getIzquierdo());
            imprimirPostorderRecursivo(nodo.getDerecho());
            System.out.println(nodo.getContacto());
        }
    }

    public void imprimirAnchura() {
        System.out.println("Árbol en Anchura:");
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo nodo = cola.poll();
            System.out.println(nodo.getContacto());

            if (nodo.getIzquierdo() != null) {
                cola.add(nodo.getIzquierdo());
            }

            if (nodo.getDerecho() != null) {
                cola.add(nodo.getDerecho());
            }
        }
    }

    public int obtenerNumeroContactos() {
        return obtenerNumeroContactosRecursivo(raiz);
    }

    private int obtenerNumeroContactosRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + obtenerNumeroContactosRecursivo(nodo.getIzquierdo()) + obtenerNumeroContactosRecursivo(nodo.getDerecho());
    }

    public int obtenerNumeroNiveles() {
        return obtenerNumeroNivelesRecursivo(raiz);
    }

    private int obtenerNumeroNivelesRecursivo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(obtenerNumeroNivelesRecursivo(nodo.getIzquierdo()), obtenerNumeroNivelesRecursivo(nodo.getDerecho()));
    }
}
