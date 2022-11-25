package com.example.binaryserch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* BIG O log
        Como la búsqueda binaria divide un problema a la mitad cada vez que se ejecuta,
        su complejidad es de O (log n), una de las más efectivas que podemos encontrar en algoritmos.

      paradigma de  POO bien definido .

       que hace:
        La búsqueda binaria es un algoritmo eficiente para encontrar
        un elemento en una lista ordenada de elementos. Funciona al dividir
        repetidamente a la mitad la porción de la lista que podría contener al elemento,
        hasta reducir las ubicaciones posibles a solo una.
        algoritmo de búsqueda es un conjunto de instrucciones que están diseñadas para localizar un elemento con
        Verifica si el elemento a buscar es menor al máximo elemento en el arreglo y mayor al mínimo elemento del arreglo,
        en caso de no ser así  se devolverá -1 ya que sabemos que no se encuentra el elemento.
        Obtiene el elemento que se encuentra en la mitad del arreglo y lo compara con el valor que se busca.
        En caso de que el elemento sea mayor al valor que se busca se descartará la parte derecha y se volverá a ejecutar la misma
        validación pero solo sobre el lado izquierdo del arreglo.
        El paso anterior se repetirá hasta encontrar el elemento
        En caso de no encontrar el elemento se devolverá -1 para indicar que no se encontró.
        la colección se ignoran justo después de la primera comparación.


        Historia.
         En 1962, Hermann Bottenbruch presentó en ALGOL 60 una implementación del algoritmo
         de búsqueda binaria en el cual colocaba la comparación de igualdad en el final del algoritmo,
         incrementando el número promedio de iteraciones por uno, pero reduciendo a uno el número de comparaciones por iteración.


         Java proporciona tres formas de realizar una búsqueda binaria:  //hacer tres , si se puede sino dos sin el recursivo
         Usando el enfoque iterativo
         Usando un enfoque recursivo
         Usando el método Arrays.binarySearch ().

        ventajas.
           Se puede aplicar tanto a datos en listas lineales como en árboles binarios de búsqueda.
           método eficiente siempre que el vector esté ordenado.
          • La lista está ordenada por la clave de búsqueda
          • Se conoce el número de elementos
          • Se tiene acceso directo al elemento por posición en la lista

        Proceso.
          1.En primer lugar es ordenar los elementos, ya que a partir de ese momento buscará por ubicación dentro de la lista de elementos.
          2.Lo siguiente que hace es validar si el número que sea la mitad del array coincide con el número buscado.
          3.En el caso que no coincida realiza la siguiente comparación. Si el elemento que buscamos es menos al elemento que está en medio del array
          se queda con la parte izquierda del array, si el elemento que buscamos es mayor que el elemento que está en medio del array se queda con la parte derecha del array.
          4.Elige una de las dos partes y vuelve a realizar lo indicado en el punto 2. Así hasta que encuentre el número buscado o bien retorne indicando que no ha encontrado
          elemento.

          https://es.stackoverflow.com/questions/407957/busqueda-binaria-recursiva
          https://spa.myservername.com/binary-search-algorithm-java-implementation-examples.  busqueda ercursiva
          https://www.technodyan.com/busqueda-binaria-recursiva-en-java/ info
          https://somoshackersdelaprogramacion.es/exploramos-en-profundidad-el-algoritmo-de-busqueda-binaria pasos



         FUNCION posicion_bin( L, clave)  /psecodigo    https://www.cartagena99.com/recursos/alumnos/apuntes/POOTema6-EstDatos.pdf
          {
          tamtamaño_de_la_colección;
            inf0; //inf: limite inferior del intervalo
          suptam-1; //sup: limite superior del intervalo
        MIENTRAS inf<=sup HAZ
          {
          centro = ((sup + inf) / 2); //centro: elemento central del intervalo
          SI L[centro].clave = clave ENTONCES
          {
          posicionpos_de_L[centro];
          SALIR;
          }
          SI clave<L[centro].clave ENTONCES sup=centro-1
          EN CASO CONTRARIO inf=centro+1
          }
          posicion NoEncontrado;
          SALIR;
          }


         */



    }
}