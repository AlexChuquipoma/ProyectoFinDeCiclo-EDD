/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.proyectofindeciclo.edd.vista;

import java.util.Scanner;

/**
 *
 * @author alexr
 */
public class Vista {
    private static Scanner scanner = new Scanner(System.in);

    public static int mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Agregar Correo");
        System.out.println("5. Agregar Red Social");
        System.out.println("6. Imprimir árbol: Preorder");
        System.out.println("7. Imprimir árbol: Inorder");
        System.out.println("8. Imprimir árbol: Postorder");
        System.out.println("9. Imprimir árbol: Anchura");
        System.out.println("10. Obtener número de contactos");
        System.out.println("11. Obtener número de niveles");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public static String ingresarNombreContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        scanner.nextLine(); // Consume la nueva línea después de leer un número.
        return scanner.nextLine();
    }

    public static String ingresarNumeroTelefono() {
        System.out.print("Ingrese el número de teléfono: ");
        return scanner.nextLine();
    }

    public static String ingresarCorreo() {
        System.out.print("Ingrese el correo: ");
        return scanner.nextLine();
    }

    public static String ingresarRedSocial() {
        System.out.print("Ingrese la red social (clave): ");
        return scanner.nextLine();
    }

    public static String ingresarURL() {
        System.out.print("Ingrese la URL: ");
        return scanner.nextLine();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

  public static String ingresarOpcion(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}