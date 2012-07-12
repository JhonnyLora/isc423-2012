package isc.jhonnytunes.profiler;

/**
 * Interfaz que define un objeto que puede ser medido por el profiler.
 * @author jhonnytunes
 *
 *
 */
public interface Profilable {
	
	/**
	 * Metodo a que va a ser medido por el profiler. Para utilizar el profiler se debe tener un objecto que implemente esta interface.
	 */
	public void profilingMethod(Object[] pars);

}
