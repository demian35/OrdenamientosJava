public class Bubblesort{

	/*Metodo que se encargara de ordenar la lista en forma de burbuja  */
	public void ordena(int[] list){
		for (int i=0; i< list.length-1 ;i++) {
			for (int j=0;j<list.length-i-1;j++ ) {
				if(list[j]>list[j+1]){ /* si el elemento de la izqierda es mayor al de la derecha se cambian*/
					int valor= list[j];
					list[j]=list[j+1];
					list[j+1]=valor;
				}
				
			}
		}
	}

	/*Metodo para imprimir una lista */
	public void imprimeLista(int[] list){
		/*Accedemos a la lista*/
		for(int i=0; i< list.length ; i++){
			System.out.print(list[i] + " ");
		}
		 System.out.println();
	}

	

	/*main ejecutable*/
	public static void main(String[] args) {
		Bubblesort bubblesort = new Bubblesort();
		int list[] ={ 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
		bubblesort.ordena(list);
		System.out.println("Sorted array");
		bubblesort.imprimeLista(list);


	}

}