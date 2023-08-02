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
- ` getNombre() -> String`: Devuelve el nombre del contacto.
- ` getNumeroTelefono() -> String`: Devuelve el número de teléfono del contacto.
- ` getCorreos() -> List<String>`: Devuelve la lista de correos electrónicos del contacto.
- ` getRedesSociales() -> Map<String, String>`: Devuelve el mapa de redes sociales del contacto.
  
###  Métodos de modificación (setters)
- `setNumeroTelefono(String numeroTelefono)`: Establece el número de teléfono del contacto.
- `setNombre(String nombre)`: Establece el nombre del contacto.

### Métodos adicionales
- `agregarCorreo(String correo)`: Agrega un correo electrónico a la lista de correos del contacto.
- `agregarRedSocial(String redSocial, String url)`: Agrega una red social al mapa de redes sociales del contacto.

## Clase Nodo
### Variables miembro
- `contacto` (Contacto): Almacena el objeto de la clase `Contacto` asociado al nodo.
- `izquierdo` (Nodo): Referencia al nodo hijo izquierdo.
- `derecho` (Nodo): Referencia al nodo hijo derecho.

### Métodos de acceso (getters)
- `getContacto () -> Contacto`: Devuelve el objeto Contacto almacenado en el nodo.
- `getIzquierdo () -> Nodo`: Devuelve el nodo hijo izquierdo.
- `getDerecho () -> Nodo`: Devuelve el nodo hijo derecho.

### Métodos de modificación (setters)
- `setIzquierdo(Nodo izquierdo)`: Establece el nodo hijo izquierdo del nodo actual.
- `setDerecho(Nodo derecho)`: Establece el nodo hijo derecho del nodo actual.

##  Clase ArbolContactos
### Variables miembro
- `raiz` (Nodo): Representa el nodo raíz del árbol binario de búsqueda.

### Métodos de modificación
- `agregarContacto(Contacto contacto)`: Agrega un nuevo objeto Contacto al árbol. Si el contacto ya existe en el árbol, se ofrece la opción de actualizar su número de teléfono.
- `eliminarContacto(String nombre)`: Elimina un objeto Contacto del árbol por su nombre.
- `agregarCorreo(String nombre, String correo)`: Agrega un correo electrónico a un contacto existente en el árbol.
- `agregarRedSocial(String nombre, String redSocial, String url)`: Agrega una red social con su URL a un contacto existente en el árbol.

### Métodos de búsqueda
- `buscarContacto(String nombre) -> Contacto`: Busca un objeto Contacto en el árbol por su nombre y devuelve el objeto encontrado, o null si no se encuentra.
- `obtenerNumeroContactos() -> int`: Devuelve el número total de contactos almacenados en el árbol.
- `obtenerNumeroNiveles() -> int`: Devuelve el número de niveles en el árbol.

### Métodos de impresión
- `imprimirPreorder()`: Imprime los contactos del árbol en recorrido Preorder.
- `imprimirInorder()`: Imprime los contactos del árbol en recorrido Inorder.
- `imprimirPostorder()`: Imprime los contactos del árbol en recorrido Postorder.
- `imprimirAnchura()`: Imprime los contactos del árbol en recorrido por niveles (Anchura).

## Clase Controlador
### Variables miembro
- `arbol`(ArbolContactos): Representa el árbol binario de búsqueda utilizado para almacenar los contactos.

### Métodos privados
- `agregarContacto()`: Permite al usuario ingresar un nuevo contacto y lo agrega al árbol de contactos.
- `buscarContacto()`: Permite al usuario buscar un contacto por su nombre. Si el contacto no existe, se ofrece la opción de agregarlo.
- `eliminarContacto()`: Permite al usuario eliminar un contacto por su nombre.
- `agregarCorreo()`: Permite al usuario agregar un correo electrónico a un contacto existente.
- `agregarRedSocial()`: Permite al usuario agregar una red social con su URL a un contacto existente.
- `mostrarNumeroContactos()`: Muestra el número total de contactos almacenados en el árbol.
- `mostrarNumeroNiveles()`: Muestra el número de niveles del árbol.

## Clase Vista
- `mostrarMenu() -> int`: Muestra el menú principal del programa y solicita al usuario que ingrese una opción. Devuelve el número de opción seleccionado por el usuario.
- `ingresarNombreContacto() -> String`: Solicita al usuario que ingrese el nombre del contacto y devuelve el valor ingresado.
- `ingresarNumeroTelefono() -> String`: Solicita al usuario que ingrese el número de teléfono del contacto y devuelve el valor ingresado.
- `ingresarCorreo() -> String`: Solicita al usuario que ingrese un correo electrónico y devuelve el valor ingresado.
- `ingresarRedSocial() -> String`: Solicita al usuario que ingrese una red social (clave) y devuelve el valor ingresado.
- `ingresarURL() -> String`: Solicita al usuario que ingrese una URL y devuelve el valor ingresado.
- `mostrarMensaje(String mensaje)`: Muestra un mensaje en la consola.
- `ingresarOpcion(String mensaje) -> String`: Solicita al usuario que ingrese una opción (S/N) y devuelve el valor ingresado.
- 
   # Métodos para la gestión del árbol
  
Método `agregarContacto(Contacto contacto)`
public void agregarContacto(Contacto contacto)
Este método se utiliza para agregar un nuevo contacto al árbol binario de búsqueda. Recibe un objeto de la clase `Contacto` como parámetro y utiliza un método auxiliar `agregarContactoRecursivo(Nodo nodo, Contacto contacto)` para realizar la inserción de forma recursiva en el árbol.

El método `agregarContactoRecursivo(Nodo nodo, Contacto contacto)` se encarga de comparar el nombre del contacto a agregar con el nombre del contacto contenido en el nodo actual. Si el nombre es menor, el método se invoca recursivamente en el nodo hijo izquierdo, y si es mayor, se invoca recursivamente en el nodo hijo derecho. Cuando se encuentra un lugar vacío en el árbol, se crea un nuevo nodo con el contacto y se inserta en esa posición.

Si el contacto a agregar ya existe en el árbol, se muestra un mensaje preguntando si se desea actualizar el número de teléfono. En caso afirmativo, el número de teléfono del contacto existente se actualiza con el número de teléfono del contacto a agregar.

  # Método buscarContacto(String nombre)
Este método permite buscar un contacto en el árbol binario de búsqueda por su nombre. Recibe el nombre del contacto como parámetro y utiliza un método auxiliar `buscarContactoRecursivo(Nodo nodo, String nombre)` para realizar la búsqueda de forma recursiva en el árbol.

El método `buscarContactoRecursivo(Nodo nodo, String nombre)` compara el nombre buscado con el nombre contenido en el nodo actual. Si son iguales, se devuelve el contacto almacenado en ese nodo. Si el nombre buscado es menor, el método se invoca recursivamente en el nodo hijo izquierdo, y si es mayor, se invoca recursivamente en el nodo hijo derecho. Si el contacto no se encuentra en el árbol, se devuelve null.

#  Método eliminarContacto(String nombre)
Este método se utiliza para eliminar un contacto del árbol binario de búsqueda por su nombre. Recibe el nombre del contacto a eliminar como parámetro y utiliza un método auxiliar `eliminarContactoRecursivo(Nodo nodo, String nombre)` para realizar la eliminación de forma recursiva en el árbol.

El método `eliminarContactoRecursivo(Nodo nodo, String nombre)` busca el contacto a eliminar en el árbol de manera similar al método de búsqueda. Una vez encontrado el nodo con el contacto a eliminar, se toman diferentes acciones dependiendo de si el nodo tiene hijos o no:

Si el nodo no tiene hijos, se elimina directamente.
Si el nodo tiene un hijo (izquierdo o derecho), se reemplaza el nodo por su hijo.
Si el nodo tiene dos hijos, se encuentra el sucesor inmediato del nodo (el nodo más pequeño en el subárbol derecho) y se reemplaza el nodo por este sucesor. Luego, se elimina el sucesor del subárbol derecho.

# Métodos auxiliares para recorridos e impresión
La clase "ArbolContactos" también implementa métodos para realizar recorridos e impresión del árbol:

- ` imprimirPreorder()`, `imprimirInorder()`, `imprimirPostorder()`: Estos métodos imprimen los contactos del árbol en los recorridos Preorder, Inorder y Postorder, respectivamente. Utilizan métodos auxiliares recursivos para realizar los recorridos en el árbol.
- ` imprimirAnchura()`: Este método imprime los contactos del árbol en un recorrido por niveles (Anchura) utilizando una cola (Queue) para realizar el recorrido en amplitud.
- `obtenerNumeroContactos()`: Este método devuelve el número total de contactos almacenados en el árbol. Utiliza un método auxiliar recursivo obtenerNumeroContactosRecursivo(Nodo nodo) para contar los nodos en el árbol.
- `obtenerNumeroNiveles()`: Este método devuelve el número de niveles en el árbol. Utiliza un método auxiliar recursivo `obtenerNumeroNivelesRecursivo(Nodo nodo)` para calcular la altura del árbol.
## Conclusiones

El programa de gestión de contactos telefónicos desarrollado utilizando un árbol binario de búsqueda proporciona una solución eficiente y ordenada para la gestión de contactos. La estructura del árbol binario permite mantener los contactos ordenados por nombre y facilita las operaciones de búsqueda, inserción y eliminación. Además, se han incluido funcionalidades adicionales para agregar correos y redes sociales asociadas a cada contacto, lo que mejora la capacidad de almacenar información relevante para cada contacto.

Con este programa, los usuarios pueden gestionar de manera efectiva su lista de contactos telefónicos y realizar diversas operaciones de búsqueda y actualización de información. El uso de un menú de opciones simplifica la interacción con el programa y hace que sea fácil de usar para cualquier usuario.
