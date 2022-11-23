package com.example.binaryserch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* BIG O

        que hace:
        La búsqueda binaria es un algoritmo eficiente para encontrar
        un elemento en una lista ordenada de elementos. Funciona al dividir
        repetidamente a la mitad la porción de la lista que podría contener al elemento,
         hasta reducir las ubicaciones posibles a solo una.
         algoritmo de búsqueda es un conjunto de instrucciones que están diseñadas para localizar un elemento con
          ciertas propiedades dentro de una estructura de datos;
          Verifica si el elemento a buscar es menor al máximo elemento en el arreglo y mayor al mínimo elemento del arreglo,
           en caso de no ser así  se devolverá -1 ya que sabemos que no se encuentra el elemento.
          Obtiene el elemento que se encuentra en la mitad del arreglo y lo compara con el valor que se busca.
          En caso de que el elemento sea mayor al valor que se busca se descartará la parte derecha y se volverá a ejecutar la misma
           validación pero solo sobre el lado izquierdo del arreglo.
           El paso anterior se repetirá hasta encontrar el elemento
          En caso de no encontrar el elemento se devolverá -1 para indicar que no se encontró.

          a colección se ignoran justo después de la primera comparación.


         Historia.
         En 1962, Hermann Bottenbruch presentó en ALGOL 60 una implementación del algoritmo
         de búsqueda binaria en el cual colocaba la comparación de igualdad en el final del algoritmo,
          incrementando el número promedio de iteraciones por uno, pero reduciendo a uno el número de comparaciones por iteración.


          Java proporciona tres formas de realizar una búsqueda binaria:
          Usando el enfoque iterativo
          Usando un enfoque recursivo
          Usando el método Arrays.binarySearch ().


          ventajas. Se puede aplicar tanto a datos en listas lineales como en árboles binarios de búsqueda.
          método eficiente siempre que el vector esté ordenado.

          https://es.stackoverflow.com/questions/407957/busqueda-binaria-recursiva
          https://spa.myservername.com/binary-search-algorithm-java-implementation-examples.  busqueda ercursiva




         */

    }

}