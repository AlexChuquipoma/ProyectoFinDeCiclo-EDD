# Universidad Politécnica Salesiana
## Proyecto Fin de Ciclo - Gestión de contactos telefónicos
### Descripción

En este informe, se documentará cada una de las clases del proyecto de Gestión de Contactos Telefónicos. El objetivo del proyecto es desarrollar un programa que permita gestionar una lista de contactos telefónicos utilizando un árbol binario de búsqueda. Cada contacto tiene un nombre, un número de teléfono, una colección de correos y un diccionario que almacena las redes sociales asociadas al contacto.

## Documentación de cada una de las clases del proyecto

## Clase Contacto

La clase `Contacto` representa un contacto con información básica como nombre, número de teléfono, lista de correos electrónicos y un mapa de redes sociales y sus respectivas URL.

### Variables miembro

- `nombre` (String): Almacena el nombre del contacto.
- `numeroTelefono` (String): Almacena el número de teléfono del contacto.
- `correos` (List<String>): Lista que contiene los correos electrónicos asociados al contacto.
- `redesSociales` (Map<String, String>): Mapa que guarda las redes sociales del contacto y sus respectivas URL.

### Métodos de acceso (getters)
- ` getNombre()` -> String: Devuelve el nombre del contacto.
- ` getNumeroTelefono`() -> String: Devuelve el número de teléfono del contacto.
- ` getCorreos`() -> List<String>: Devuelve la lista de correos electrónicos del contacto.
- ` getRedesSociales`() -> Map<String, String>: Devuelve el mapa de redes sociales del contacto.
  
###  Métodos de modificación (setters)
- `setNumeroTelefono`(String numeroTelefono): Establece el número de teléfono del contacto.
- `setNombre`(String nombre): Establece el nombre del contacto.
- 
### Métodos adicionales
- `agregarCorreo`(String correo): Agrega un correo electrónico a la lista de correos del contacto.
- `agregarRedSocial`(String redSocial, String url): Agrega una red social al mapa de redes sociales del contacto.

## Clase Nodo
`contacto` (Contacto): Almacena el objeto de la clase Contacto asociado al nodo.
`izquierdo` (Nodo): Referencia al nodo hijo izquierdo.
`derecho` (Nodo): Referencia al nodo hijo derecho.

## Conclusiones

El programa de gestión de contactos telefónicos desarrollado utilizando un árbol binario de búsqueda proporciona una solución eficiente y ordenada para la gestión de contactos. La estructura del árbol binario permite mantener los contactos ordenados por nombre y facilita las operaciones de búsqueda, inserción y eliminación. Además, se han incluido funcionalidades adicionales para agregar correos y redes sociales asociadas a cada contacto, lo que mejora la capacidad de almacenar información relevante para cada contacto.

Con este programa, los usuarios pueden gestionar de manera efectiva su lista de contactos telefónicos y realizar diversas operaciones de búsqueda y actualización de información. El uso de un menú de opciones simplifica la interacción con el programa y hace que sea fácil de usar para cualquier usuario.
