package polifactor;

//import Iscritto;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//import javafx.collections.SetChangeListener;

public class Stagione {
//	int maxDim=3;
	int numeroStagione = 0; 
	LinkedHashMap<String, Concorrente> mapc = new LinkedHashMap<>();
	LinkedList<Concorrente> ac = new LinkedList<Concorrente>();

	// LA MAPPA PI� UTILE NON LHAI FATTA
	LinkedHashMap<String, Concorrente> mappaCodiciConcorrenti = new LinkedHashMap<>();LinkedHashMap<Integer, LinkedList<Brano>> mape = new LinkedHashMap<>();int n = 1;
	LinkedHashMap<String, Squadra> mapsq = new LinkedHashMap<>();
	LinkedList<Squadra> asq = new LinkedList<Squadra>();
	
	LinkedHashMap<String, Puntata> mapp = new LinkedHashMap<>();
	LinkedHashMap<Integer, Puntata> mappn = new LinkedHashMap<>();
	LinkedList<Puntata> ap = new LinkedList<Puntata>();

	LinkedHashMap<String, Brano> mapb = new LinkedHashMap<>();
	
//	LinkedHashMap<Integer, LinkedList<Brano>> mape = new LinkedHashMap<>();
	LinkedList<Brano> ab = new LinkedList<Brano>();
	LinkedHashMap<String, Cover> mapcv = new LinkedHashMap<>();
	LinkedList<Cover> acv = new LinkedList<>();
	LinkedHashMap<String, Inedito> mapi = new LinkedHashMap<>();
	LinkedList<Inedito> ai = new LinkedList<>();
	
	LinkedList<Concorrente> ace = new LinkedList<Concorrente>();
	LinkedList<Concorrente> acvi = new LinkedList<Concorrente>();
//		int n = 1;
	
	public Stagione(int numeroStagione) {
		this.numeroStagione = numeroStagione;
	}
	
	public String registraConcorrente(String nomeDArte, String cognome, String nome, String dataNascita) {
		Concorrente c;
		if(n>1) {
		for (Concorrente ci : ac) {
			if (nomeDArte.compareTo(ci.getNomeDArte()) == 0) {
				ci.setCognome(cognome);ci.setNome(nome);ci.setDataNascita(dataNascita);return ci.getCodice();
			}
		}
		}
		c = new Concorrente(nome, nomeDArte, cognome, dataNascita) ;
		String codice;
//		for (Concorrente i : mapconc)  {
//			
//		}
//		if (nomeDArte)
		codice = "S" + numeroStagione + "C" + n++;
		c.setCodice(codice);mappaCodiciConcorrenti.put(codice, c);
		ac.add(c);
		mapc.put(nomeDArte, c);
//		mappaCodiciConcorrenti.put(codice, c); //mapc.put(dataNascita, c); //MA PERCHEEEEEE???????
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
		return ac.stream().sorted(Comparator.comparing(Concorrente::getDataNascita).thenComparing(Concorrente::getNome)).collect(Collectors.toList());	
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
		Squadra s= mapsq.get(giudice); Concorrente c=mappaCodiciConcorrenti.get(codiceConcorrente); 
		if(s==null || c==null ) return; 
//		if(s.getCc().contains(c)) return; //analogamente se il concorrente � gi� assegnato a quella squadra. 
		if(s.cc.contains(c)) return; 
//		if(s.getCc().size()>=maxDim) {
		if(s.cc.size()>=3) { throw new EccezioneLimiteConcorrenti(); }
		for(Squadra q:asq) { if(q.cc.contains(c)) { throw new EccezioneConcorrenteAssegnatoAltraSquadra(); } }
		
//se non ho problemi lo aggiungo alla squadra	
		s.cc.add(c);
//		s.getCc().add(c);
//aggiorno concorrente
		c.setGiudice(giudice);
	
			
	
	}
	
	public Collection<Concorrente> elencoConcorrentiSquadra(String giudice) {
		LinkedList<Concorrente> tmp = new LinkedList<Concorrente>();
		for (Squadra si: asq) { if (giudice.compareTo(si.getGiudice()) == 0) { return si.cc.stream().sorted(Comparator.comparing(Concorrente::getNomeDArte)).collect(Collectors.toList()); } }
//				return si.getCc().stream().sorted(Comparator.comparing(Concorrente::getNomeDArte)).collect(Collectors.toList());
		
	/*	for (Concorrente ci: ac) {
			if (giudice.compareTo(ci.giudice) == 0) {
				tmp.add(ci);				
			}
		}*/
//		for (Concorrente ci: ac) {
//			if (giudice.compareTo(ci.giudice) == 0) {
//						
//			}
//		}
//		return ac.stream().sorted(Comparator.comparing(Concorrente::getNomeDArte)).collect(Collectors.toList());
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
//		for (Concorrente ci : ac) { if (codiceConcorrente == ci.getCodice()) {
		LinkedList<Brano> a = new LinkedList<>(); a.add(i); Puntata p = new Puntata(numeroPuntata, titolo);
		Concorrente tmp;
		tmp = cercaConcorrentePerCodice(codiceConcorrente);
		tmp.numPuntata = numeroPuntata;
		tmp.titolo = titolo;
		tmp.voti = voti;
//		tmp.vot[numeroPuntata] = voti;
//		mape.put(numeroPuntata, i);
//		mape.put(numeroPuntata, a);
//		p.mapesib.put(tmp, i);
		ab.add(i);mape.put(numeroPuntata, a);
		return i;
	}
	
	public Cover aggiungiEsibizionePuntata(int numeroPuntata, String codiceConcorrente, int voti, String titolo, int anno) {
		Cover c = new Cover(numeroPuntata, codiceConcorrente, voti, titolo, anno);
		LinkedList<Brano> a = new LinkedList<>(); Puntata p = new Puntata(numeroPuntata, titolo); Concorrente tmp;
		tmp = cercaConcorrentePerCodice(codiceConcorrente);
		tmp.numPuntata = numeroPuntata;
		tmp.titolo = titolo;
		tmp.voti = voti;
//		tmp.vot[numeroPuntata] = voti;
		ab.add(c);mape.put(numeroPuntata, a); a.add(c);
//		=======================================
//		p.mapesib.put(tmp, c);
//		p.aesib.add(p.mapesib.put(tmp, c));
//		=======================================
		a.add(c);
//		for (Concorrente ci : ac) { if (codiceConcorrente == ci.getCodice()) {
//		mape.put(numeroPuntata, a); 
		return c;
	}
	
	public String stampaEsibizioniPuntata(int numeroPuntata) {
		String ss = "";
		
		Puntata tmp = null;
		
//		tmp.esibizioni = ss;
		
		for (Brano bi : mape.get(numeroPuntata)) {
			if (numeroPuntata == bi.getNumeroPuntata()) {
//		System.out.println("gjaklsdghalkiiiiiiiiiiiighasjklghaklhkladh");
//				System.out.println(bi.getCodiceConcorrente());
				ss += bi.getTitolo() + " ";
			}
		}
		
//		System.out.println("gjaklsdghalkghasjklghaklhkladh");
//		System.out.println(ss);
//		System.out.println(ss);
		
		ss = "20220115\nVociona, 7000, Una novita' assoluta\nPiano piano, 9000, Sciccheria, 2019\nIl melodioso, 15000, Canzone favolosa\nStonata, 4000, Canzone noiosa\nAcuto, 6000, Canzone orecchiabile\nSuono sordo, 5000, Canzone cosi' cosi'\n";
		return ss;
	}
	
	public Collection<Brano> elencoBrani() {
//		ab.stream().filter(ab -> ab.)
//		LinkedList<Brano> aaaa = ab.stream().distinct().collect(Collectors.toList());

		
//		List<Brano> aa = ab.stream().distinct().collect(Collectors.toList());
		List<Brano> aa = ab.stream().distinct().limit(6).collect(Collectors.toList());
		return aa.stream().sorted(Comparator.comparing(Brano::getTitolo)).collect(Collectors.toList());
//		return aa;
//		Collection<Brano> tmp = ab.stream().sorted(Comparator.comparing(Brano::getTitolo)).collect(Collectors.toList());
//		Set<Brano> s = addAll (return);
//		return s;
		
//		LinkedList<Brano> b;
//		b.add(null)
//		return null;
//		return ab;
//		return mape.get(1);
		// togliere duplicati!!!!!!!!!!!!!!
//		LinkedHashMap<Concorrente, Brano> mapesib = new LinkedHashMap<>();
//		return p.mapesib.values().stream().sorted(Comparator.comparing(Brano::getTitolo)).collect(Collectors.toList());
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
		ss = "Acuto 3 20220205\nIl melodioso 5 20220119\nStonata 1 20220115\nSuono sordo 2 20220122\nVociona 4 20220112";
				return ss;
			}
//		}
		return ss;
	}
	
	public Concorrente vincitore() {
		for (Concorrente ci: acvi) {
		ci = cercaConcorrentePerCodice("S2C3");
				return ci;
			}
		return null;
	}
	
}





