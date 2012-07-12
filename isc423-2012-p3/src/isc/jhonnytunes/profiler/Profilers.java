package isc.jhonnytunes.profiler;

public class Profilers {

	private Profilers() {
		// TODO Auto-generated constructor stub
	}
	
	private static Profiler profiler = new StandardProfiler();
	
	public static Profiler getProfiler(){
		return profiler;
	}
	
}
