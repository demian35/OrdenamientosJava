public class Quicksort{
	
	public static void ordenamiento(int arreglo [], int inicio , int fin){
		if(inicio>=fin) 
			return;
		/*Creamos un pivote para empezar a ordenar*/
			int pivote=arreglo[inicio];
			int izq=inicio+1;
			int der=fin;
			while(izq<=der){ /*Mientras el elemento izquierdo sea menor que el derecho entra en el otro while*/
				while(izq<=fin && arreglo[izq]<pivote){
					izq++;
				}/*Mientras el elemento izquierdo sea menor o igual que el final y tambien sea menor al pivote entonces recorremos una posicion*/
				while(der>inicio && arreglo[der]>=pivote){/*mientras el elemento de la dercha sea mayor que el inicio y que el pivote entonces retrocedemos desde la derecha*/
					der--;
				}
				if(izq<der){
					int temp=arreglo[izq];
					arreglo[izq]=arreglo[der];
					arreglo[der]=temp;
				}	
			}
			if(der>inicio){
				int temp=arreglo[inicio];
				arreglo[inicio]=arreglo[der];
				arreglo[der]=temp;
			}
		ordenamiento(arreglo,inicio,der-1);
		ordenamiento(arreglo,der+1,fin);
	}

	public static void ordenaArreglo(int arreglo[]){
		final int n=arreglo.length;
		ordenamiento(arreglo,0,n-1);
	}

	public static void imprimeArreglo(int arreglo[]){
		for(int i=0; i<arreglo.length;i++){
			System.out.print(arreglo[i] + " ");
		}
	}	

	private static int arreglo[]={20,12,28,24,8,4,16,2,5,6,8,1,8,41,45,57,49,50,55,57,59,60,54,53,63,67,80,88,87,82,84,81,80};

	public static void main(String[] args) {
		System.out.println("Arreglo sin ordenar");
		imprimeArreglo(arreglo);
		ordenaArreglo(arreglo);
		System.out.println("\nArreglo Ordenado");
		imprimeArreglo(arreglo);
	}

}

