package polifactor;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Squadra {

	private String giudice;

	LinkedList<Concorrente> cc = new LinkedList<Concorrente>();
	String Conc;
	

	public Squadra(String giudice) {
		this.giudice = giudice;
		// TODO Auto-generated constructor stub
	}

	public String getGiudice() {
		return giudice;
	}

}
