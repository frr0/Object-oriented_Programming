package piscine;

import java.util.*;

public class Piscina {

	String codice;
	String indirizzo;
	int numPostiBordoPiscina;
	int numPostiPrato;
	int maxOccupantiPosto;
	
	TreeMap<String, Posto> mappaPosti = new TreeMap<String, Posto>();
	LinkedList<Posto> listaPostiBordo = new LinkedList<Posto>();
	LinkedList<Posto> listaPostiPrato = new LinkedList<Posto>();
	LinkedList<Prenotazione> listaPrenotazioni = new LinkedList<Prenotazione>();
	TreeMap<String,Prenotazione> mappaPrenotazioni = new TreeMap<String, Prenotazione>();
	
	public Piscina(String codice, String indirizzo, int numPostiBordoPiscina, int numPostiPrato,
			int maxOccupantiPosto) {
		this.codice = codice;
		this.indirizzo = indirizzo;
		this.numPostiBordoPiscina = numPostiBordoPiscina;
		this.numPostiPrato = numPostiPrato;
		this.maxOccupantiPosto = maxOccupantiPosto;
		
		for(int i=1; i<=numPostiBordoPiscina; i++) {
			PostoBordo p = new PostoBordo("B"+i);  //creo un oggetto di tipo bordo piscina
			mappaPosti.put("B"+i, p);  //aggiungo i posti alla mappa dei posti
			listaPostiBordo.add(p);  //aggiungo i posti bordo piscina alla lista bordo piscina
									 //la lista bordo piscina sarà quindi ordinata per numero
		}
		
		for(int i=1; i<=numPostiPrato; i++) {
			PostoPrato p = new PostoPrato("P"+i);  //creo un oggetto di tipo prato
			mappaPosti.put("P"+i, p);  //aggiungo i posti alla mappa dei posti
			listaPostiPrato.add(p);  //aggiungo i posti sul prato alla lista prato
									 //la lista prato quindi sarà ordinata per numero
		}
		
		
	}

	public String getCodice() {
		return codice;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public int getNumPostiBordoPiscina() {
		return numPostiBordoPiscina;
	}

	public int getNumPostiPrato() {
		return numPostiPrato;
	}

	public int getMaxOccupantiPosto() {
		return maxOccupantiPosto;
	}

}
