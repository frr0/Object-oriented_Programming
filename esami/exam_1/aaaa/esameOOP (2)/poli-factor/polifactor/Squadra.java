package polifactor;

import java.util.LinkedList;

public class Squadra {

	private String giudice;

	private LinkedList<Concorrente> cc = new LinkedList<Concorrente>();
	String Conc;
	

	public Squadra(String giudice) {
		this.giudice = giudice;
		
		// TODO Auto-generated constructor stub
	}

	public String getGiudice() {
		return giudice;
	}

	public LinkedList<Concorrente> getCc() {
		return cc;
	}

	public void setCc(LinkedList<Concorrente> cc) {
		this.cc = cc;
	}

}
