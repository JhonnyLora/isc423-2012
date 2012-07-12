package prueba;

import isc.jhonnytunes.profiler.Profilable;

/**
 * El proposito de esta clase es medir el algoritmo. En este caso se implementara la interface profilable, aunque hay otra manera mas
 * flexible, que seria, creando un nuevo objeto y hacer que el nuevo objeto componga la clase del algoritmo. El nuevo objeto implementa
 * profilable y entonces se hace un method forwarding hacia el metodo compuesto. 
 * 
 * @author jhonnytunes
 *
 */
public class InsertionSort implements Profilable {

	
	public void insertionSort(int[] arr) {
	      int i, j, newValue;
	      for (i = 1; i < arr.length; i++) {
	            newValue = arr[i];
	            j = i;
	            while (j > 0 && arr[j - 1] > newValue) {
	                  arr[j] = arr[j - 1];
	                  j--;
	            }
	            arr[j] = newValue;
	      }
	}

	@Override
	public void profilingMethod(Object[] pars) {
		
		int[] entrada = (int[]) pars[0];
		
		insertionSort(entrada);
		
	}

	
	
}
