package com.example.binaryserch;

public class BusquedaBinaria {

    private int num; //arreglo?, o con listas enlazadas, o array
    private int busNum;



    public int busquedaMetodos(int[] arreglo, int busqueda){
        int izquierda = 0, derecha = arreglo.length - 1;

        while(izquierda <= derecha){
            // Calculamos las mitades...
            int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
            int elementoDelMedio = arreglo[indiceDelElementoDelMedio];

            // Ver si está en la mitad y romper aquí el ciclo
            if(elementoDelMedio == busqueda){
                return indiceDelElementoDelMedio;
            }
            // Si no, entonces vemos si está a la izquierda o derecha

            if(busqueda < elementoDelMedio){
                derecha = indiceDelElementoDelMedio - 1;
            }else{
                izquierda = indiceDelElementoDelMedio + 1;
            }
        }
        // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no existe
        return -1;
    }

    public int busquedaBinaria(){
        return 0;
    }

    public int busquedaRecursiva(int arr[], int lo, int hi, int x){
        if (hi >= lo && lo < arr.length - 1) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return busquedaRecursiva(arr, lo, mid - 1, x);
            return busquedaRecursiva(arr, mid + 1, hi, x);
        }
        return -1;



    }
}
