package piscine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class GestionePrenotazioni {

	TreeMap<String, Piscina> mappaPiscine = new TreeMap<String, Piscina>();
	LinkedList<Piscina> listaPiscine = new LinkedList<Piscina>();
	LinkedList<Prenotazione> listaPrenotazioni = new LinkedList<Prenotazione>();
	TreeMap<String, Prenotazione> mappaPrenotazioni = new TreeMap<String, Prenotazione>();
	
	
	public Piscina definisciPiscina(String indirizzoPiscina, int numPostiBordoPiscina, int numPostiPrato, int maxOccupantiPosto) {
		
		if(mappaPiscine.containsKey(indirizzoPiscina)) //controllo se la piscina esiste già attraverso
													   //l'indirizzo che è univoco (chiave)
		{												
			return mappaPiscine.get(indirizzoPiscina); 
		} 
		
		String codice = indirizzoPiscina.toUpperCase();        //il codice deve essere tutto
		codice = codice.replace(" ", ""); //maiuscolo e non deve avere
		codice = codice.replace(",", ""); //né spazi né virgole
		
		Piscina p = new Piscina(codice, indirizzoPiscina, numPostiBordoPiscina, numPostiPrato, maxOccupantiPosto);
		mappaPiscine.put(indirizzoPiscina, p);
		listaPiscine.add(p);
		
		
		return p;
	}

	public Piscina cercaPiscina(String indirizzoPiscina) {
		
		return mappaPiscine.get(indirizzoPiscina);
	}
	
	public Collection<Piscina> elencoPiscine(){
		return listaPiscine;
	}
	
	public Collection<Posto> elencoPostiBordoPiscina(String indirizzoPiscina){
		if(mappaPiscine.containsKey(indirizzoPiscina)) { //controllo che la piscina non sia a null-->cioè se mappaPiscine contiene la piscina in questione
			return cercaPiscina(indirizzoPiscina).listaPostiBordo;
		}
		
		return null;
	}
	
	public Collection<Posto> elencoPostiPrato(String indirizzoPiscina){
		if(mappaPiscine.containsKey(indirizzoPiscina)) { //controllo che la piscina non sia a null-->cioè se mappaPiscine contiene la piscina in questione
			return cercaPiscina(indirizzoPiscina).listaPostiPrato;
		}
		
		return null;
	}
	
	public Posto cercaPosto(String indirizzoPiscina, String numeroPosto) {
		
		if(mappaPiscine.containsKey(indirizzoPiscina)) {
			return cercaPiscina(indirizzoPiscina).mappaPosti.get(numeroPosto);
		}
		
		return null;
	}
	
	public void configuraPosto(String indirizzoPiscina, String numeroPosto, boolean ombrellone, int numLettini) {
	
	if(mappaPiscine.containsKey(indirizzoPiscina)) { //se la piscina esiste
		PostoBordo pb = (PostoBordo) cercaPiscina(indirizzoPiscina).mappaPosti.get(numeroPosto); //prendo il posto in questione
		pb.ombrellone = ombrellone;
		
		if(numLettini>cercaPiscina(indirizzoPiscina).maxOccupantiPosto) {
			numLettini = cercaPiscina(indirizzoPiscina).maxOccupantiPosto;
		} else {
			pb.numLettini = numLettini;
		}
		}
		
	}
	
	public String nuovaPrenotazione(String indirizzoPiscina, String data, char tipoPosto, String nome, String cognome, String cellulare) throws EccezioneTipoPostoEsaurito {
		
		//devo verificare che la piscina ed il posto esistano :
		Piscina pi = this.cercaPiscina(indirizzoPiscina); //mi prendo il riferimento alla piscina
		if(pi == null) {
			return null;
		}
		
		if(tipoPosto != 'B' && tipoPosto != 'P') {
			return null;
		}
		
		int cnt = 0;
		
		//devo verificare se ci sono altre prenotazioni per quel posto in quella data :
		for(Prenotazione pr : listaPrenotazioni) {
			//devo contare quanti posti prenotati di quel tipo ci sono in quella data
			
			//ho una lista di prenotazioni, e per ogni prenotazione ho le informazioni
			//del posto (tipo e numero) occupato; io scandisco la listaPrenotazioni e 
			//controllo che la piscina che sto considerando sia la stessa di quella
			//per cui devo prenotare, se è la stessa piscina allora guardo
			//se il posto che sto considerando è della tipologia che devo prenotare;
			//se sono della stessa tipologia, guardo la data; se la data di quella
			//prenotazione corrisponde alla data in cui devo prenotare, vuol dire che 
			//c'è già un posto prenotato di quel tipo in quella data e quindi
			//incremento il contatore cnt.
			//Alla fine il contatore mi dice quanti posti di quel tipo sono stati
			//già prenotati in quella data.
			//So anche quanti posti disponibili ci sono in generale di quel tipo
			//in quella piscina (numPostiBordoPiscina e numPostiPrato);
			//se il numero di posti occupati è minore dei posti occupabili totali,
			//allora posso fare qualcosa (aggiungere una prenotazione).
			if(pr.piscina.indirizzo.compareTo(indirizzoPiscina) == 0) {
				if( (tipoPosto == 'B' && pr.posto instanceof PostoBordo) 
						|| (tipoPosto == 'P' && pr.posto instanceof PostoPrato) ) {
					if(pr.data.compareTo(data) == 0) {
						cnt++;
					}
				}
			}
			
		}
		
		String codice = null;
		if( (tipoPosto == 'B' && cnt < pi.numPostiBordoPiscina) 
				|| (tipoPosto == 'P' && cnt < pi.numPostiPrato) ) {
			//Allora posso aggiungere questa prenotazione
			Posto po = pi.mappaPosti.get(""+tipoPosto+""+(cnt+1));
			
			codice = pi.codice + "-" + data + "-" + po.numero;
			
			Prenotazione prTemp = new Prenotazione(codice, data, //così creo la prenotazione
					pi, po, nome, cognome, cellulare);
			
			listaPrenotazioni.add(prTemp);
			mappaPrenotazioni.put(codice, prTemp);
			
		} else {
			throw new EccezioneTipoPostoEsaurito();
		}
		
		return codice;
	}
	
	public Piscina piscinaPrenotazione(String codicePrenotazione) {
		
		return mappaPrenotazioni.get(codicePrenotazione).piscina;
	}

	public String dataPrenotazione(String codicePrenotazione) {
		
		return mappaPrenotazioni.get(codicePrenotazione).data;
	}

	public Posto postoPrenotazione(String codicePrenotazione) {
		
		return mappaPrenotazioni.get(codicePrenotazione).posto;
	}
	
	public String stampaPrenotazione(String codicePrenotazione) {
		
		return mappaPrenotazioni.get(codicePrenotazione).toString();
	}

	public String stampaPrenotazioniPerCodice() {
		
		String s = "";
		LinkedList<Prenotazione> listaPrenotazione = new LinkedList<Prenotazione>(mappaPrenotazioni.values());
		
		for(Prenotazione pr : listaPrenotazione) {
			
			if(s != "") {
				s += "\n";
			}
			
			s += pr.toString();
		}
		
		return s;
	}

	public String stampaPrenotazioniPerCognomeNome() {
		
		String s = "";
		LinkedList<Prenotazione> listaPrenotazione = new LinkedList<Prenotazione>(mappaPrenotazioni.values());
		Collections.sort(listaPrenotazione); //Quando passo come parametro la lista (e basta)
											 //ordina usando l'algoritmo di confronto definito da
											 //Comparable in Prenotazione (cioè compareTo())
		
		for(Prenotazione pr : listaPrenotazione) {
			
			if(s != "") {
				s += "\n";
			}
			
			s += pr.toString();
		}
		
		return s;
		
	}
	
	public String stampaDatePrenotatePosto(String indirizzoPiscina, String numeroPosto) {
		
		Piscina pTemp = cercaPiscina(indirizzoPiscina);
		
		String s = "";
		
		if(indirizzoPiscina == null || numeroPosto == null || pTemp == null) { 
			return null;
		}
		
		for(Prenotazione pr : pTemp.listaPrenotazioni) {
			if(pr.posto.numero.compareTo(numeroPosto) == 0) { 
				s = s + pr.data;
			} 
		}
		
		return s;
	}
	
	public String StampaNumeroPostiLiberiData(String indirizzoPiscina, String data) { 
		
		Piscina pTemp = cercaPiscina(indirizzoPiscina);
		
		//String s = "";
		int contB = 0; //contatore posti bordo piscina
		int contP = 0; //contatore posti prato
		
		if(pTemp == null) {
			return null;
		}
		
		for(Prenotazione pr : pTemp.listaPrenotazioni) {
			if(pr.data.compareTo(data) == 0 && pr.posto instanceof PostoBordo) {
				contB++;
			}
		}
		
		for(Prenotazione pr : pTemp.listaPrenotazioni) {
			if(pr.data.compareTo(data) == 0 && pr.posto instanceof PostoPrato) {
				contP++;
			}
		}
		
		
		return ""+(pTemp.getNumPostiBordoPiscina()-contB)+" "+(pTemp.getNumPostiPrato()-contP);
		
	}
	
    public void leggi(String filename){
    	
    	try {
    		
    		FileReader fr = new FileReader(filename);
    		BufferedReader br = new BufferedReader(fr); //leggo riga per riga
    		
    		String riga;
    		
    		while( (riga = br.readLine()) != null) {//finché riesco a leggere dal BufferedReader
    												//una riga, e questa riga è diversa da null...
    			
    			//Qui dentro ho una riga
    			
    			String campi[] = riga.split(";");
    			
    			if(campi[0].compareTo("PISCINA") == 0) {
    				
    				String indirizzo = campi[1];
    				int numPostiBordoPiscina = Integer.parseInt(campi[2]);
    				int numPostiPrato = Integer.parseInt(campi[3]);
    				int maxPostiOccupabili = Integer.parseInt(campi[4]);
    				
    				this.definisciPiscina(indirizzo, numPostiBordoPiscina, numPostiPrato, maxPostiOccupabili);
    				//il metodo definisciPiscina() aggiunge già anche  la piscina alla struttura dati
    				
    			} else if(campi[0].compareTo("PRENOTAZIONE") == 0) {
    				
    				String indirizzo = campi[1];
    				String data = campi[2];
    				char tipoPosto = campi[3].charAt(0);
    				String nome = campi[4];
    				String cognome = campi[5];
    				String cellulare = campi[6];
    				
    				this.nuovaPrenotazione(indirizzo, data, tipoPosto, nome, cognome, cellulare);
    				
    			}
    			
    		}
    		
    		
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    }    	
	
}