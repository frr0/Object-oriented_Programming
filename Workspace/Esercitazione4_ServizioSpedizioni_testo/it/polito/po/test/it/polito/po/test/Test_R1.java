package it.polito.po.test;

import junit.framework.TestCase;
import serviziospedizioni.Corriere;
import serviziospedizioni.ServizioSpedizioni;

public class Test_R1 extends TestCase{

	@SuppressWarnings("unused")
	public void testCreaCorriere(){
		
		System.out.println("\n*** testCreaCorriere() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");

		System.out.println("Informazioni sul corriere creato.\n");
		System.out.println("Codice: " + c1.getCodiceCorriere());
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Cognome: " + c1.getCognome());
		System.out.println("Eta: " + c1.getEta());
		System.out.println("Citta': " + c1.getCitta());
		
		
		boolean corretto = false;
		
		if (	c1.getCodiceCorriere().equals("MARO35TO") && 
				c1.getNome().equals("Mario") &&
				c1.getCognome().equals("Rossi") && 
				c1.getEta() == 35 &&
				c1.getCitta().equals("Torino")) {
			System.out.println("\nCorriere creato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione del corriere");

		assertEquals("Implementazione del metodo creaCorriere() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCreaCorriereStessoCodice(){
		
		System.out.println("\n*** testCreaCorriere() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c3 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		
		
		boolean corretto = false;
		
		if (	c1.getCodiceCorriere().equals("MARO35TO_1") && 
				c2.getCodiceCorriere().equals("MARO35TO_2") && 
				c3.getCodiceCorriere().equals("MARO35TO_3")){
			System.out.println("\nCorrieri creati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione dei corrieri");

		assertEquals("Implementazione del metodo creaCorriere() e/o dei metodi correlati errata", true,corretto);
	}
	
	
	@SuppressWarnings("unused")
	public void testCorriereDescriviti(){
		
		System.out.println("\n*** testCorriereDescriviti() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");

		System.out.println(c1.descriviti());
		
		boolean corretto = false;
		
		if ( c1.descriviti().equals("MARO35TO Mario Rossi 35 Torino") ) {
			System.out.println("\nCorriere descritto in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella descrizione del corriere");

		assertEquals("Implementazione del metodo descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCercaCorriere(){
		
		System.out.println("\n*** testCercaCorriere() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Ricerca del corriere con codice MARO26AS");
		Corriere cTrovato = s.cercaCorriere("MARO26AS");

		System.out.println("Informazioni sul collo trovato.\n");
		System.out.println(cTrovato.descriviti());
		
		boolean corretto = false;
		
		if ( cTrovato.equals(c2) ) {
			System.out.println("\nCorriere cercato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca del corriere");

		assertEquals("Implementazione del metodo cercaCorriere() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCercaCorrieri(){
		
		System.out.println("\n*** testCercaCorrieri() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Ricerca dei corrieri registrati");
		Corriere[] cc = s.cercaCorrieri();
		
		for (Corriere ci : cc) {
			System.out.println(ci.descriviti());
		}
		
		boolean corretto = false;
		
		if ( 	cc.length == 4 &&
				cc[0].equals(c1) &&
				cc[1].equals(c2) &&
				cc[2].equals(c3) &&
				cc[3].equals(c4)) {
			System.out.println("\nCorrieri cercati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca dei corrieri");

		assertEquals("Implementazione del metodo cercaCorrieri() e/o dei metodi correlati errata", true,corretto);
	}
	
}
