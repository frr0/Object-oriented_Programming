import java.util.*;

import polifactor.*;

public class Esempio {

	public static void main(String[] args) throws EccezioneLimiteConcorrenti, EccezioneConcorrenteAssegnatoAltraSquadra {
			
		Stagione1 st = new Stagione1(1);
		
		System.out.println("/******************************/");
		System.out.println("/**      R1. CONCORRENTI     **/");
		System.out.println("/******************************/\n");
		
		System.out.println("* Registrato nuovo concorrente");
		
		String ca1 = st.registraConcorrente("Voce d'oro", "Maria", "Rossi", "20001104");

		System.out.println("\n* Codice assegnato al concorrente\n");
		
		System.out.println(ca1);

		System.out.println("\n* Ricerca concorrente \"Voce d'oro\"");
		
		Concorrente a1 = st.cercaConcorrentePerNomeDArte("Voce d'oro");

		System.out.println("\n* Informazioni relative al concorrente\n");

		System.out.println("Cognome: "+a1.getCognome());
		System.out.println("Nome: "+a1.getNome());
		System.out.println("Data di nascita: "+a1.getDataNascita());

		System.out.println("\n* Registrati altri concorrenti");

		st.registraConcorrente("Il cantante silenzioso", "Alberto", "Blu", "20010222");
		st.registraConcorrente("La rumorosa", "Anna", "Neri", "20001104");

		System.out.println("\n* Elenco concorrenti (per nome d'arte):\n");
		LinkedList<Concorrente> listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiNomeDArte());
		for(Concorrente c : listaConcorrenti)
			System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());

		System.out.println("\n* Elenco concorrenti (per data di nascita e nome d'arte):\n");
	 	                        listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiDataNascita());
		for(Concorrente c : listaConcorrenti)
			System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());
		
		
		System.out.println("\n\n/******************************/");
		System.out.println("/**        R2. SQUADRE       **/");
		System.out.println("/******************************/\n");
		
		System.out.println("* Creata squadra del giudice \"G. Giudizioso\"\n");

		st.creaSquadra("G. Giudizioso");
		
		System.out.println("* Elenco squadre/giudici:\n");
		LinkedList<Squadra> listaSquadre = new LinkedList<Squadra>(st.elencoSquadre());
		for(Squadra s : listaSquadre)
			System.out.println(s.getGiudice());
		
		System.out.println("\n* Assegnazione concorrente alla squadra \"G. Giudizioso\"");
		
		try {
			st.assegnaConcorrente("G. Giudizioso", "S1C1");
		} catch (EccezioneLimiteConcorrenti lce) {
			System.out.println("Raggiunto limite numero concorrenti per squadra");
		} catch(EccezioneConcorrenteAssegnatoAltraSquadra cae) {
			System.out.println("Concorrente già assegnato ad altra squadra");
			
		}
		
		System.out.println("\n* Create altre squadre ed assegnati altri concorrenti");
		st.assegnaConcorrente("G. Giudizioso", "S1C2");
		st.creaSquadra("S. Attento");
		st.assegnaConcorrente("S. Attento", "S1C3");
		
		System.out.println("\n* Elenco concorrenti (per nome d'arte) squadra \"G. Giudizioso\":\n");
		                       listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiSquadra("G. Giudizioso"));
		for(Concorrente c : listaConcorrenti)
			System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());

		
		System.out.println("\n\n/****************************************/");
		System.out.println("/**  R3. PUNTATE, BRANI ED ESIBIZIONI  **/");
		System.out.println("/****************************************/\n");
		
		System.out.println("* Definita puntata 1 del 20221123\n");

		st.nuovaPuntata(1, "20221123");
		
		System.out.println("* Aggiunta esibizione puntata 1 concorrente S1C1 inedito \"La mia nuova canzone\"\n");
		
		Brano br = st.aggiungiEsibizionePuntata(1, "S1C1", 5000, "La mia nuova canzone");

		System.out.println("* Informazioni brano esibizione:\n");

		System.out.println("Titolo: "+br.getTitolo());
		if(br instanceof Inedito)
			System.out.println("Tipo: Inedito");
		else
			System.out.println("Tipo: Cover");
		
		System.out.println("\n* Esibizioni puntata 1 (in ordine di aggiunta):\n");
		
		String stringaEsibizioni = st.stampaEsibizioniPuntata(1);
		System.out.println(stringaEsibizioni);

		System.out.println("\n* Aggiunte altre esibizioni\n");
		
		st.aggiungiEsibizionePuntata(1, "S1C3", 9000, "Azzurro", 1968);
		st.aggiungiEsibizionePuntata(1, "S1C2", 5000, "Purtroppo urlo");
		
		       stringaEsibizioni = st.stampaEsibizioniPuntata(1);
		System.out.println(stringaEsibizioni);

		System.out.println("\n* Elenco brani esibizioni (per titolo):\n");
		LinkedList<Brano> listaBrani = new LinkedList<Brano>(st.elencoBrani());
		for(Brano b : listaBrani)
			if(b instanceof Inedito)
				System.out.println(b.getTitolo());
			else if(b instanceof Cover)
				System.out.println(b.getTitolo()+" ("+((Cover) b).getAnno()+")");

		
		System.out.println("\n\n/*************************************/");
		System.out.println("/**    R4. ELIMINATI E VINCITORI    **/");
		System.out.println("/*************************************/");

		System.out.println("\n* Concorrente eliminato puntata 1:\n");

		Concorrente ce = st.concorrenteEliminatoPuntata(1);
		System.out.println(""+ce.getCodice()+" "+ce.getNomeDArte()+" "+ce.getCognome()+" "+ce.getNome()+" "+ce.getDataNascita());
		
		System.out.println("\n* Concorrenti eliminati:\n");

		String stringaEliminati = st.stampaConcorrentiEliminati();
		System.out.println(stringaEliminati);
		
		System.out.println("\n* Vincitore della stagione:\n");

		Concorrente v = st.vincitore();

		if(v!=null)
			System.out.println(""+v.getCodice()+" "+v.getNomeDArte()+" "+v.getCognome()+" "+v.getNome()+" "+v.getDataNascita());
		else
			System.out.println("Non vi e' un vincitore");
		
	}
}






