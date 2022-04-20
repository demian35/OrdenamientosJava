
/* Ordenamiento selectionSort en java */
public class Selectionsort {
    /* funcion para ordenar el arreglo recibimos un arreglo de enteros */
    public static void selectionSort(int[] lista){
        for(int i=0;i<lista.length-1;i++){
            int indice=i;
            for(int j=i+1;j<lista.length;j++){
                if(lista[j]<lista[indice]){
                    indice=j;
                }
            }
            int numeroMenor=lista[indice];
            lista[indice]=lista[i];
            lista[i]=numeroMenor;
        }
    }

    public static void main(String[] args) {
        int[] lista1={9,14,3,2,43,11,58,22};
        System.out.println("Antes de ordenar");
        for(int i:lista1){
            System.out.println(i + "");
        }
        System.out.println();
        selectionSort(lista1); /*Ordenamos la lista  */
        System.out.println("Despues de ordenar");
        for(int i:lista1){
            System.out.println(i + "");
        }
    
    }
}
