/**
 * 
 */
package isc.jhonnytunes.josephus;

/**
 * 
 * Clase que representa un camarada. Es decir los individuos que estaban en la cueva
 * 
 * @author jhonnytunes
 *
 */
public final class ComradeSoldier extends Person {

	///Referencias a los vecinos en la ronda
	private ComradeSoldier next, prev;

	public ComradeSoldier(String nombre, ComradeSoldier next,
			ComradeSoldier prev) {
		super(nombre);
		this.next = next;
		this.prev = prev;
	}

	
	
	
	/**
	 * @param next the next to set
	 */
	public void setNext(ComradeSoldier next) {
		this.next = next;
	}




	/**
	 * @param prev the prev to set
	 */
	public void setPrev(ComradeSoldier prev) {
		this.prev = prev;
	}




	/**
	 * @return the next
	 */
	public ComradeSoldier getNext() {
		return next;
	}

	/**
	 * @return the prev
	 */
	public ComradeSoldier getPrev() {
		return prev;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(850);
		
		sb.append(getNombre());
		
		for ( ComradeSoldier com = this.next; com!=null; com = com.next){
			sb.append(com.getNombre());
			
		}
		
		return sb.toString();
	}
	
	
	
	
	
}
