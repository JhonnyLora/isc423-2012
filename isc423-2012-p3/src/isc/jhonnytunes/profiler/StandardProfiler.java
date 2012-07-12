/**
 * 
 */
package isc.jhonnytunes.profiler;

/**
 * 
 * Clase que representa la medicion del tiempo utilizando el timer de java. "System.nano"
 * @author jhonnytunes 20076446
 * 
 *
 */
 class StandardProfiler implements Profiler{
	
	StandardProfiler() {
		
	}

	@Override
	public long calculateExecutionTime(Profilable profilable, Object[] pars){
		
		long start = System.nanoTime(), lfinal;
		
		try{
			profilable.profilingMethod(pars);
			lfinal = System.nanoTime();
		}
		catch(Exception e){
			
			throw new RuntimeException("El metodo en ejecucion lanzo una exception \nDetalle: "+e.getMessage());
			
		}
		return lfinal - start;		
	}

}
