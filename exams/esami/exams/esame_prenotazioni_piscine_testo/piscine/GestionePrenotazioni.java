package piscine;

import java.util.*;

public class GestionePrenotazioni {
	
	LinkedList<Piscina> piscine = new LinkedList<Piscina>();
	LinkedList<Posto> posti = new LinkedList<Posto>();
	int n = 0;

	public Piscina definisciPiscina(String indirizzoPiscina, int numPostiBordoPiscina, int numPostiPrato, int maxOccupantiPosto) {
		String codice = (indirizzoPiscina.toUpperCase());
		codice = codice.replaceAll("[ ,]","");
		System.out.println(codice);
		Piscina p = new Piscina(codice, indirizzoPiscina, numPostiBordoPiscina, numPostiPrato, maxOccupantiPosto);
		piscine.add(p);
		return p;
	}

	public Piscina cercaPiscina(String indirizzoPiscina) {
		for (Piscina i: piscine) {
			if (i.getIndirizzo() == indirizzoPiscina) {
				return i;
			}
		}
		return null;
	}
	
	public Collection<Piscina> elencoPiscine(){
		return piscine;
	}
	
	public Collection<Posto> elencoPostiBordoPiscina(String indirizzoPiscina){
		String cod = "B" + ++n;
		PostoBordo pb = new PostoBordo(indirizzoPiscina, cod);
		posti.add(pb);
		return posti;
	}
	
	public Collection<Posto> elencoPostiPrato(String indirizzoPiscina){
		String cod = "P" + ++n;
		PostoPrato pp = new PostoPrato(indirizzoPiscina, cod);
		posti.add(pp);
		return posti;
	}
	
	public Posto cercaPosto(String indirizzoPiscina, String numeroPosto) {
		for (Posto a: posti) {
			if (indirizzoPiscina.compareTo(a.getIndirizzoPiscina()) == 0 && numeroPosto.compareTo(a.getCod()) == 0) {
				return a;
			}
		}
		return null;
	}
	
	public void configuraPosto(String indirizzoPiscina, String numeroPosto, boolean ombrellone, int numLettini) {
	}
	
	public String nuovaPrenotazione(String indirizzoPiscina, String data, char tipoPosto, String nome, String cognome, String cellulare) throws EccezioneTipoPostoEsaurito {
		return null;
	}
	
	public Piscina piscinaPrenotazione(String codicePrenotazione) {
		return null;
	}

	public String dataPrenotazione(String codicePrenotazione) {
		return null;
	}

	public Posto postoPrenotazione(String codicePrenotazione) {
		return null;
	}
	
	public String stampaPrenotazione(String codicePrenotazione) {
		return null;
	}

	public String stampaPrenotazioniPerCodice() {
		return null;
	}

	public String stampaPrenotazioniPerCognomeNome() {
		return null;
	}
	
	public String stampaDatePrenotatePosto(String indirizzoPiscina, String numeroPosto) {
		return null;
	}
	
	public String StampaNumeroPostiLiberiData(String indirizzoPiscina, String data) {
		return null;
	}
	
    public void leggi(String filename){
    }    	
	
}
