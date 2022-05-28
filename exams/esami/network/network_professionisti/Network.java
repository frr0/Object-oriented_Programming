package network_professionisti;

import java.util.*;

import javax.swing.DefaultRowSorter;

public class Network {
	
	HashMap<String, Iscritto> IscrittoperId = new HashMap<>();
	HashMap<String, Iscritto> IscrittoperNC = new HashMap<>();
	LinkedList<Iscritto> iscritti = new LinkedList<Iscritto>();

	LinkedList<Entita> entitas = new LinkedList<Entita>();

	HashMap<String, Azienda> Aziendapernome = new HashMap<>();
	HashMap<Integer, Azienda> AziendaperND = new HashMap<>();
	LinkedList<Azienda> As = new LinkedList<Azienda>();
	
	HashMap<String, CentroDiFormazione> CFpernome = new HashMap<>();
	HashMap<Integer, CentroDiFormazione> CFperND = new HashMap<>();
	LinkedList<CentroDiFormazione> Cs = new LinkedList<CentroDiFormazione>();

	public Iscritto nuovoIscritto(String nome, String cognome, String web, String email, String descrizione) {
		Iscritto i = new Iscritto(nome, cognome, web, email, descrizione);
		String id = "";
		int n = 0;

		if (cercaIscrittoPerNomeCognome(nome, cognome) != null) {
			n = i.getN() + 1;
			id = nome+ "-" + cognome+ "-" + n;
		} else {
			 id = nome+ "-" + cognome;
		}
		String NC = nome + cognome;

		i.setN(n);
		i.setId(id);
		
		IscrittoperId.put(id, i);
		IscrittoperNC.put(NC, i);
		iscritti.add(i);

		return i;
	}

	public Iscritto cercaIscrittoPerId(String id) {
		return IscrittoperId.get(id);
	}
	
	public Iscritto cercaIscrittoPerNomeCognome(String nome, String cognome) {
		String NC = nome + cognome;
		return IscrittoperNC.get(NC);
	}

	public Collection<Iscritto> elencoIscritti() {
		return iscritti;
	}
	
	public Entita nuovaEntita(String nome, String nazione, String indirizzo) throws EccezioneEntitaGiaDefinita {
		Azienda a;
		if (entitas.contains(nome)) {
			throw new EccezioneEntitaGiaDefinita();
		}
		a = new Azienda(nome, nazione, indirizzo);
		Aziendapernome.put(nome, a);
		AziendaperND.put(a.getNumeroDipendenti(), a);
		entitas.add(a);
		return a;
	}

	public Entita nuovaEntita(String nome, String nazione, String indirizzo, String settore, int numeroDipendenti) throws EccezioneEntitaGiaDefinita {
		CentroDiFormazione cf;
		if (entitas.contains(nome)) {
			throw new EccezioneEntitaGiaDefinita();
		}
		cf = new CentroDiFormazione(nome, nazione, indirizzo, settore, numeroDipendenti);
		entitas.add(cf);
		CFpernome.put(nome, cf);
		CFperND.put(numeroDipendenti, cf);
		return cf;
	}
	
	public Collection<Azienda> elencoAziendePerNome(){
		return Aziendapernome.values();
	}			

	public Collection<Azienda> elencoAziendePerNumeroDipendenti(){
		return AziendaperND.values();
	}			
	
	public Collection<CentroDiFormazione> elencoCentriDiFormazionePerNome(){
		return CFpernome.values();
	}			

	public Collection<CentroDiFormazione> elencoCentriDiFormazioneInNazionePerNome(String nazione){
		return CFperND.values();
	}			

	public Collection<Entita> elencoEntita(){
		return entitas;
	}			
	
	public void nuovoPeriodoDiFormazione(String idIscritto, String nomeCentroFormazione,String da, String a, String titolo) {
	}

	public String titoliFormazioneDateCrescenti(String idIscritto) {
		return null;
	}
	
	public String titoliFormazioneDateDecrescenti(String idIscritto) {
		return null;
	}

	public void nuovoPeriodoInAzienda(String idIscritto, String nomeAzienda,String da, String a, String ruolo) {
	}
	
	public String ruoliAziendaDateCrescenti(String idIscritto) {
		return null;
	}
	
	public String ruoliAziendaDateDecrescenti(String idIscritto) {
		return null;
	}
	
	public void nuovaConnessione(String idIscritto1, String idIscritto2) {
	}
	
	public Collection<Iscritto> elencoConnessioni(String idIscritto){
		return null;
	}
	
	public Collection<Iscritto> elencoConnessioniSuggerite(String idIscritto){
		return null;
	}
	
}

