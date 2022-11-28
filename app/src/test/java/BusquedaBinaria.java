public class BusquedaBinaria {

    private int num; //arreglo?, o con listas enlazadas, o array
    private int busNum;

    public int busquedaMetodos(){
        return 0;
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
