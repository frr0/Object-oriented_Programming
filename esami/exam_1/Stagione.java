package polifactor;

//import Iscritto;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javafx.collections.SetChangeListener;

public class Stagione {

	int numeroStagione = 0; 
	LinkedHashMap<String, Concorrente> mapc = new LinkedHashMap<>();
	LinkedList<Concorrente> ac = new LinkedList<Concorrente>();

	LinkedHashMap<String, Squadra> mapsq = new LinkedHashMap<>();
	LinkedList<Squadra> asq = new LinkedList<Squadra>();
	
	LinkedHashMap<String, Puntata> mapp = new LinkedHashMap<>();
	LinkedHashMap<Integer, Puntata> mappn = new LinkedHashMap<>();
	LinkedList<Puntata> ap = new LinkedList<Puntata>();
	
	LinkedHashMap<String, Brano> mapb = new LinkedHashMap<>();
	LinkedList<Brano> ab = new LinkedList<Brano>();
	LinkedHashMap<String, Cover> mapcv = new LinkedHashMap<>();
	LinkedList<Cover> acv = new LinkedList<>();
	LinkedHashMap<String, Inedito> mapi = new LinkedHashMap<>();
	LinkedList<Inedito> ai = new LinkedList<>();
	
	LinkedList<Concorrente> ace = new LinkedList<Concorrente>();
	LinkedList<Concorrente> acvi = new LinkedList<Concorrente>();
	
	public Stagione(int numeroStagione) {
		
	}
	
	public String registraConcorrente(String nomeDArte, String cognome, String nome, String dataNascita) {
		int n = 0;
		Concorrente c;
//		for (Concorrente ci : ac) {
//			if (nomeDArte.compareTo(ac.getNomeDArte)) {
//				setCognome(cognome);
//			}
//		}
		c = new Concorrente(nome, nomeDArte, cognome, dataNascita) ;
		String codice;
//		for (Concorrente i : mapconc)  {
//			
//		}
//		if (nomeDArte)
		codice = "S" + numeroStagione + "C" + n++;
		ac.add(c);
		mapc.put(nomeDArte, c);
		mapc.put(dataNascita, c);
		return codice;
	}
	
	public Concorrente cercaConcorrentePerNomeDArte(String nomeDArte) {
		for (Concorrente ci: ac) {
			if (nomeDArte.compareTo(ci.getNomeDArte()) == 0) {
				return ci;
			}
		}
		return null;
	}
	
	public Concorrente cercaConcorrentePerCodice(String codice) {
		for (Concorrente ci: ac) {
			if (codice.compareTo(ci.getCodice()) == 0) {
				return ci;
			}
		}
		return null;
	}
	
	public Collection<Concorrente> elencoConcorrentiNomeDArte() {
		return ac.stream().sorted(Comparator.comparing(Concorrente::getNomeDArte)).collect(Collectors.toList());
	}
	
	public Collection<Concorrente> elencoConcorrentiDataNascita(){
		return ac.stream().sorted(Comparator.comparing(Concorrente::getDataNascita)).collect(Collectors.toList());	
	}
	
	public void creaSquadra(String giudice) {
		Squadra sq = new Squadra(giudice);
		asq.add(sq);
		mapsq.put(giudice, sq);
	}

	public Collection<Squadra> elencoSquadre(){
		return asq.stream().sorted(Comparator.comparing(Squadra::getGiudice)).collect(Collectors.toList());
	}
	
	public void assegnaConcorrente(String giudice, String codiceConcorrente) throws EccezioneLimiteConcorrenti, EccezioneConcorrenteAssegnatoAltraSquadra {
//	
//		if (ac.)
	
		for (Concorrente ci: ac) {
			if (codiceConcorrente.compareTo(ci.getCodice()) == 0) {
				ci.giudice = giudice;				
			}
		}
		
			
	
	}
	
	public Collection<Concorrente> elencoConcorrentiSquadra(String giudice) {
		LinkedList<Concorrente> tmp = new LinkedList<Concorrente>();
		
		for (Concorrente ci: ac) {
			if (giudice.compareTo(ci.giudice) == 0) {
				tmp.add(ci);				
			}
		}
//		for (Concorrente ci: ac) {
//			if (giudice.compareTo(ci.giudice) == 0) {
//						
//			}
//		}
//		return ac.stream().sorted(Comparator.comparing(Concorrente::giudice)).collect(Collectors.toList());
		return tmp;
	}

	public Puntata nuovaPuntata(int numero, String data) {
		Puntata p;
		
		for (Puntata pi : ap) {
			if (numero == pi.numero) {
				return pi;
			}
		}
		p = new Puntata(numero, data);
		ap.add(p);
		mappn.put(numero, p);
		mapp.put(data, p);
		return p;
	}
	
	public Inedito aggiungiEsibizionePuntata(int numeroPuntata, String codiceConcorrente, int voti, String titolo ) {
		Inedito i = new Inedito(numeroPuntata, codiceConcorrente, voti, titolo);
		Concorrente tmp;
		tmp = cercaConcorrentePerCodice(codiceConcorrente);
		tmp.numPuntata = numeroPuntata;
		tmp.titolo = titolo;
		tmp.voti = voti;
		return i;
	}
	
	public Cover aggiungiEsibizionePuntata(int numeroPuntata, String codiceConcorrente, int voti, String titolo, int anno) {
		Cover c = new Cover(numeroPuntata, codiceConcorrente, voti, titolo, anno);
		Concorrente tmp;
		tmp = cercaConcorrentePerCodice(codiceConcorrente);
		tmp.numPuntata = numeroPuntata;
		tmp.titolo = titolo;
		tmp.voti = voti;
		return c;
	}
	
	public String stampaEsibizioniPuntata(int numeroPuntata) {
		String ss = "";
		
		Puntata tmp = null;
		
		tmp.esibizioni = ss;
		
		for (Brano bi : ab) {
			if (numeroPuntata == bi.n) {
				ss += bi.getTitolo();
			}
		}
		

		
		return ss;
	}
	
	public Collection<Brano> elencoBrani() {
		return ab;
	}

	public Concorrente concorrenteEliminatoPuntata(int numeroPuntata) {
//		for (Puntata pi: ap) {
//			if (numeroPuntata == pi.getNumero()) {
//				return ;
//			}
//		}
		for (Concorrente ci: ac) {
			if (numeroPuntata != ci.numPuntata) {
				ace.add(ci);
				return ci;
			} else {
				acvi.add(ci);		
			}
		}
		return null;

//		return ap.ge/t(numeroPuntata);
	}
	
	public String stampaConcorrentiEliminati() {
//		int flag = 10000;
		
//		for (Concorrente ci: ac) {
//			if (ac.voti < flag) {
//				return ac;
//			}
//		}
		
//		tmp.esibizioni = ss;
		String ss = "";
		for (Concorrente bi : ace) {
				ss += bi.getNomeDArte() + " "+ bi.numPuntata + " ";
				return ss;
			}
		}
		return ss;
	}
	
	public Concorrente vincitore() {
		for (Concorrente ci: acvi) {
				return ci;
			}
		return null;
	}
	
}





