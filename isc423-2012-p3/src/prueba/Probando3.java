package prueba;

import isc.jhonnytunes.profiler.Profilable;
import isc.jhonnytunes.profiler.Profiler;
import isc.jhonnytunes.profiler.Profilers;

import java.util.Random;

/**
 * 
 */

/**
 * 
 * Clase de prueba para el ejercicio #3 de la practica.
 * 
 * @author jhonnytunes
 *
 */
public class Probando3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creando un arra de ints
		int[] entrada = new int[500];
		Random ran = new Random();
		
		for(int i=0; i< entrada.length; i++)
			entrada[i] = ran.nextInt(100000000);
		
		Profiler pro = Profilers.getProfiler();
		Profilable p = new InsertionSort();
		Object[] entradas = new Object[1];
		entradas[0] = entrada;
		
		System.out.println("Tiempo tomado para el algoritmo: " +pro.calculateExecutionTime(p, entradas));

	}

}
