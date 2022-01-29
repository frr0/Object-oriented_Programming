package piano_vaccinazioni;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Piano {
	
	LinkedList<Cittadino> cittadini = new LinkedList<Cittadino>();
	LinkedHashMap<String, LinkedList<Centro>> centriXRegione;
	LinkedHashMap<String, Centro> centriXid;
	LinkedHashMap<String, Integer> dosiConsegnatePerRegione;
	LinkedHashMap<String, Integer> dosiEffettuatePerRegione;
	
	public Piano() {
		centriXRegione = new LinkedHashMap<String, LinkedList<Centro>>();
		centriXid = new LinkedHashMap<>();
	}

	public Cittadino registraCittadino(String codiceTesseraSanitaria, String nome, String cognome, String dataDiNascita, String regione) {
		Cittadino c = new Cittadino(codiceTesseraSanitaria, nome, cognome, dataDiNascita, regione);
		cittadini.add(c);
		return c;
	}

	public Collection<Cittadino> elencoCittadiniPerCognomeNome() {
		return cittadini.stream().sorted(Comparator.comparing(Cittadino::getNome)).collect(Collectors.toList());
	}

	public Collection<Cittadino> elencoCittadiniPerDataDiNascita() {
		return cittadini.stream().sorted(Comparator.comparing(Cittadino::getDataDiNascita)).collect(Collectors.toList());
	}

	public Collection<Cittadino> cercaCittadiniEtaMinima(int etaMinima){
		return cittadini.stream().filter(c -> c.getEta() >= etaMinima).collect(Collectors.toList());
	}
	
	public Centro attivaCentro(String regione, int numeroMassimoDosi) {
		Centro c;
	if (!centriXRegione.containsKey(regione)) {
			centriXRegione.put(regione, new LinkedList<>());
		}	
		
		String codice = regione.substring(0, 3).toUpperCase() + (centriXRegione.get(regione).size() + 1);
		c = new Centro(regione, numeroMassimoDosi, codice);
		
		centriXid.put(codice, c);
		centriXRegione.get(regione).add(c);
		return c;
	}
	
	public Centro cercaCentro(String codiceCentro) {
		return centriXid.get(codiceCentro);
	}
	
	public void consegnaDosiVaccino(String codiceCentro, char tipoVaccino, int numeroDosi) throws EccezioneConsegnateMenoDosi {		
		Centro c = cercaCentro(codiceCentro);
		int dosiConsegnate = 0;
		EccezioneConsegnateMenoDosi eccezione = null;
		
		if (c != null) {
			try {
				c.aggiungiDosi(tipoVaccino, numeroDosi);
				dosiConsegnate = numeroDosi;
			} catch (EccezioneConsegnateMenoDosi e) {
				dosiConsegnate = e.dosiConsegnate;
				eccezione = e;
			}
		}
		
		if ( dosiConsegnatePerRegione.containsKey(c.getRegione())){
			int dosiRegione = dosiConsegnatePerRegione.get(c.getRegione()) + dosiConsegnate;
			dosiConsegnatePerRegione.put(c.getRegione(), dosiRegione);
		}
		else {
			dosiConsegnatePerRegione.put(c.getRegione(), dosiConsegnate);
		}
		
		if (eccezione != null)
			throw eccezione;
	}
	
	public int numeroDosiTipoVaccinoCentro(String codiceCentro, char tipoVaccino){
		return -1;
	}
	
	public int numeroDosiCentro(String codiceCentro) {
		return -1;
	}
	
	public char vaccina(String codiceTesseraSanitaria, String data) throws EccezioneDosiVaccinoNonDisponibili {
		return ' ';
	}

	public String stampaUltimaVaccinazioneCittadino(String codiceTesseraSanitaria) {
		return null;
	}
	
	public String stampaVaccinazioni() {
		return null;
	}
	
	public double percentualeUtilizzoDosi(String regione) {
		return -1;
	}

}

