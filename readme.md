# Proyecto Fin de Ciclo - Gestión de contactos telefónicos

## Descripción

Este proyecto consiste en el desarrollo de un programa para gestionar una lista de contactos telefónicos utilizando un árbol binario de búsqueda. Cada contacto tiene un nombre, un número de teléfono, una colección de correos y un diccionario que almacena las redes sociales asociadas al contacto, donde la red social es la clave del diccionario y el valor es la URL del perfil (Ejemplo: {'"acebook": "link_facebook_profile"}).

## Funcionalidades del Programa

El programa principal ofrece las siguientes funcionalidades:

1. **Agregar Contacto**: Permite agregar un nuevo contacto proporcionando su nombre y número de teléfono.

2. **Buscar Contacto**: Permite buscar un contacto por su nombre e imprimir todos sus atributos. Si el contacto no existe, se pregunta si se desea crear un nuevo contacto con el nombre ingresado.

3. **Eliminar Contacto**: Permite eliminar un contacto por su nombre. Si el contacto no existe, se muestra un mensaje indicando que no se encontró el contacto.

4. **Agregar un correo**: Permite agregar un correo a la colección de correos asociados a un contacto, proporcionando el nombre del contacto y el correo.

5. **Agregar una red social**: Permite agregar una red social asociada a un contacto, proporcionando el nombre del contacto, la clave de la red social y su valor (URL). Si la clave de la red social ya existe, se actualizará la URL proporcionada.

6. **Imprimir el árbol según el recorrido**: Permite imprimir los contactos en diferentes órdenes de recorrido: preorder, inorder, postorder y por amplitud.

7. **Obtener el número de contactos totales (Peso del árbol)**: Muestra el número total de contactos presentes en el árbol.

8. **Obtener el número de niveles del árbol**: Muestra el número de niveles del árbol.

## Instrucciones de Uso

1. Ejecutar el programa y seguir las instrucciones del menú para realizar las diferentes operaciones de gestión de contactos.

2. Para agregar un nuevo contacto, seleccionar la opción "Agregar Contacto" e ingresar el nombre y el número de teléfono del contacto.

3. Para buscar un contacto, seleccionar la opción "Buscar Contacto" e ingresar el nombre del contacto. Se mostrarán todos los atributos del contacto si se encuentra en la lista. Si no existe, se puede optar por agregar un nuevo contacto con ese nombre.

4. Para eliminar un contacto, seleccionar la opción "Eliminar Contacto" e ingresar el nombre del contacto que se desea eliminar.

5. Para agregar un correo a un contacto, seleccionar la opción "Agregar un correo", ingresar el nombre del contacto y el correo a agregar.

6. Para agregar una red social a un contacto, seleccionar la opción "Agregar una red social", ingresar el nombre del contacto, la clave de la red social y la URL asociada. Si la clave ya existe, se actualizará la URL.

7. Para imprimir los contactos en diferentes órdenes, seleccionar la opción "Imprimir el árbol según el recorrido" y elegir el tipo de recorrido deseado.

8. Para obtener el número de contactos totales, seleccionar la opción "Obtener el número de contactos totales".

9. Para obtener el número de niveles del árbol, seleccionar la opción "Obtener el número de niveles del árbol".

## Conclusiones

El programa de gestión de contactos telefónicos desarrollado utilizando un árbol binario de búsqueda proporciona una solución eficiente y ordenada para la gestión de contactos. La estructura del árbol binario permite mantener los contactos ordenados por nombre y facilita las operaciones de búsqueda, inserción y eliminación. Además, se han incluido funcionalidades adicionales para agregar correos y redes sociales asociadas a cada contacto, lo que mejora la capacidad de almacenar información relevante para cada contacto.

Con este programa, los usuarios pueden gestionar de manera efectiva su lista de contactos telefónicos y realizar diversas operaciones de búsqueda y actualización de información. El uso de un menú de opciones simplifica la interacción con el programa y hace que sea fácil de usar para cualquier usuario.
