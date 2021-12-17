package it.polito.po.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import serviziospedizioni.Collo;
import serviziospedizioni.Corriere;
import serviziospedizioni.ServizioSpedizioni;
import serviziospedizioni.Spedizione;

public class Test_R4 extends TestCase{
	
	@SuppressWarnings("unused")
	public void testElencoCorrieriPerEta(){
		
		System.out.println("\n*** testElencoCorrieriPerEta() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		ArrayList<Corriere> cc = new ArrayList<Corriere>(s.elencoCorrieriPerEta());
		
		System.out.println("Elenco generato\n");
		for (Corriere ci : cc) {
			System.out.println(ci.descriviti());
		}
		
		boolean corretto = false;
		
		if (cc.size() == 4 && cc.get(0).equals(c2) && cc.get(1).equals(c3) && cc.get(2).equals(c1) && cc.get(3).equals(c4)) {
			System.out.println("\nElenco generato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione dell'elenco");

		assertEquals("Implementazione del metodo elencoCorrieriPerEta() e/o dei metodi correlati errata", true,corretto);
	}


	
	@SuppressWarnings("unused")
	public void testElencoSpedizioniCorrierePerData(){
		
		System.out.println("\n*** testElencoSpedizioniCorrierePerData() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/06");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("AS_1", "Asti", "2021/12/10");

		ArrayList<Spedizione> ss = new ArrayList<Spedizione>(s.elencoSpedizioniCorrierePerData("MARO35TO"));
		
		System.out.println("Elenco generato\n");
		for (Spedizione si : ss) {
			System.out.println(si.descriviti());
		}
		
		boolean corretto = false;
		
		if (ss.size() == 2 && ss.get(0).equals(sp2) && ss.get(1).equals(sp1)) {
			System.out.println("\nElenco generato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione dell'elenco");

		assertEquals("Implementazione del metodo elencoSpedizioniCorrierePerData() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testElencoSpedizioniCittaPerPriorita(){
		
		System.out.println("\n*** testElencoSpedizioniCittaPerPriorita() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/06");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("AS_1", "Asti", "2021/12/10");

		ArrayList<Spedizione> ss = new ArrayList<Spedizione>(s.elencoSpedizioniCittaPerPriorita("Torino"));
		
		System.out.println("Elenco generato\n");
		for (Spedizione si : ss) {
			System.out.println(si.descriviti());
		}
		
		boolean corretto = false;
		
		if (ss.size() == 3 && ss.get(0).equals(sp1) && ss.get(1).equals(sp2) && ss.get(2).equals(sp3)) {
			System.out.println("\nElenco generato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione dell'elenco");

		assertEquals("Implementazione del metodo elencoSpedizioniCorrierePerData() e/o dei metodi correlati errata", true,corretto);
	}
}
