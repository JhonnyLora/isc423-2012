/**
 * 
 */
package isc.jhonnytunes.profiler;

/**
 * @author jhonnytunes 20076446
 * Interfaz donde se definen los metodos a implementar por los profilers.
 *
 *
 */
public interface Profiler {
	
	/**
	 * Metodo para calcular el tiempo que tarda la ejecucion de un metodo en java.
	 * @param profilable Objecto Profilable a Medir.
	 * @return retorna el tiempo de ejecucion en milisegundos.
	 */
	long calculateExecutionTime(Profilable profilable, Object[] pars);

}
