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

         Historia.
         En 1962, Hermann Bottenbruch presentó en ALGOL 60 una implementación del algoritmo
         de búsqueda binaria en el cual colocaba la comparación de igualdad en el final del algoritmo,
          incrementando el número promedio de iteraciones por uno, pero reduciendo a uno el número de comparaciones por iteración.


          algoritmo de búsqueda es un conjunto de instrucciones que están diseñadas para localizar un elemento con
          ciertas propiedades dentro de una estructura de datos;

          ventajas. Se puede aplicar tanto a datos en listas lineales como en árboles binarios de búsqueda.
          método eficiente siempre que el vector esté ordenado.
         */

    }

}