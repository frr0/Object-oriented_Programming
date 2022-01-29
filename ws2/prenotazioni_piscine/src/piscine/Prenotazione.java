package piscine;

public class Prenotazione implements Comparable<Prenotazione>{
	
	String codice;
	String data;
	Piscina piscina;  //invece che memorizzare i campi di una determinata classe
					  //(come ad es. il tipoPosto o l'indirizzoPiscina)
					  //è meglio memorizzare i riferimenti a quegli oggetti
					  //(quindi registrare direttamente la Piscina ed il Posto)
	Posto posto;
	String nome;
	String cognome;
	String cellulare;
	
	public Prenotazione(String codice, String data, Piscina piscina, Posto posto, String nome, String cognome, String cellulare) {
		this.codice = codice;
		this.data = data;
		this.piscina = piscina;
		this.posto = posto;
		this.nome = nome;
		this.cognome = cognome;
		this.cellulare = cellulare;
	}
	
	public String toString() {
		
		return codice+";"+piscina.indirizzo+";"+data+";"+posto.numero+";"+nome+";"+cognome+";"+cellulare;
	}

	@Override
	public int compareTo(Prenotazione p) { //Usato solo nella stampa ordinata per cognome-nome
		
		if(this.cognome.compareTo(p.cognome)==0) {
			return this.nome.compareTo(p.nome);
		} else {
			return this.cognome.compareTo(p.cognome);
		}
				
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String getNumeroPosto() {
		return posto.numero;
	}
		
	
	
}