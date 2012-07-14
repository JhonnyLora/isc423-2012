package prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import isc.jhonnytunes.josephus.ComradeSoldier;
import isc.jhonnytunes.josephus.ComradeSoldiers;

public class Probando4 {

	
	public static void main(String[] args) {
		
		ComradeSoldiers list = new ComradeSoldiers ();

		 BufferedReader br = new BufferedReader (
		    new InputStreamReader (System.in));

		 
		 final int n = 2;
		 //final int n = Integer.parseInt(args[0]);
		 
		 // read in names until end of file
		 for (;;) {
		    String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    if (name==null) break;
		    list.addEnd (name);
		 }

		 if (list.getSize()==0) {
		    System.out.println ("Empty list.");
		 } else if (list.getSize()==1) {
		    System.out.println ("Only: " + list.remove());
		 } else {
		    System.out.println (list);
		    System.out.println ("First: " + list.remove());
		    System.out.println (list);

		    ComradeSoldier q = list.getFirst();
		    while (list.getSize() > 1) {
		       q = list.cycle (q, n-1);
		       System.out.println ("Next: " + list.remove(q));
		       System.out.println (list);
		    }
		    System.out.println ("Last: " + list.remove());
		
	}
	}}
