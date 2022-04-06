import java.util.Arrays;

public class Mergesort{

    //mergesort recibe un arreglo
    public static void mergeSort(int Lista[]){
        if(Lista.length<=1){
            return;
        }

        //dividimos el arreglo en dos
        int medio=Lista.length/2;
        int izq[]=Arrays.copyOfRange(Lista, 0, medio);
        int der[]=Arrays.copyOfRange(Lista, medio, Lista.length);
        mergeSort(izq);
        mergeSort(der);
        mezcla(Lista, izq, der);
    }

    //metodo para mezclar y ordenar el arreglo
    public static void mezcla(int A[], int izq[], int der[]) {
        int i=0;
        int j=0;
        for(int k=0 ; k<A.length; k++){
            if(i>=izq.length){
                A[k]=der[j];
                j++;
                continue;
            }
            if(j>=der.length){
                A[k]=izq[i];
                i++;
                continue;
            }
            if(izq[i]<der[j]){
                A[k]=izq[i];
                i++;
            }else{
                A[k]=der[j];
                 j++;
            }
        }
    }

    //metodo para imprimir la lista
    public static void imprimeLista(int Lista[]){
        for(int i=0;i<Lista.length;i++){
                System.out.print(Lista[i]+" ");
        }
    }

    public static void main(String args[]){
        int Lista[]={45,17,23,67,21};
        System.out.println("Vector original");
        imprimeLista(Lista);
        System.out.println("\nVector ordenado");
        mergeSort(Lista);
        imprimeLista(Lista);
}
    
}