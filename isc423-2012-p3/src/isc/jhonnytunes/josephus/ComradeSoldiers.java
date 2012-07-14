/**
 * 
 */
package isc.jhonnytunes.josephus;



/**
 * @author jhonnytunes
 *
 */
public final class ComradeSoldiers {

	//Primer soldado
	private ComradeSoldier first;
	private short size;
	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return first.toString();
		}	
	
	public void add (String n) {
	    if (first==null) {
	       first = new ComradeSoldier (n,null, null);
	    } else {
	       first = new ComradeSoldier (n, first, first.getNext());
	    }
	    size++;
	 }

	
	
	
	 /**
	 * @return the first
	 */
	public ComradeSoldier getFirst() {
		return first;
	}

	/**
	 * @return the size
	 */
	public short getSize() {
		return size;
	}

	public void addEnd (final String n) {
	    if (first==null) {
	       first = new ComradeSoldier (n, null, null);
	    } else {
	       ComradeSoldier p = first;
	       while (p.getNext()!=null) p=p.getNext();
	       p.setNext( new ComradeSoldier (n, p, null));
	    }
	    size++;
	 }

	 public String remove () {
	    final String n = first.getNombre();
	    first = first.getNext();
	    if (first!=null && first.getNext()!=null) first.getNext().setPrev(null);
	    size--;
	    return n;
	 }


	 public String remove (ComradeSoldier p) {
	    if (p==null) throw new IllegalArgumentException ();
	    if (p==first) return remove();
	    final String n = p.getNombre();
	   
	    if (p.getPrev()!=null) p.getPrev().setNext(p.getNext());
	    if (p.getNext()!=null)   p.getNext().setPrev(p.getPrev());
	    size--;
	    return n;
	 }

	 public ComradeSoldier cycle (ComradeSoldier p, int i) {
	    ComradeSoldier r = p;
	    while (i>0) {
	       if (r.getNext() == null) {
	          r = first;
	       } else {
	          r = r.getNext();
	       }
	       i--;
	    }
	    return r;
	 }
	
	
	
}
