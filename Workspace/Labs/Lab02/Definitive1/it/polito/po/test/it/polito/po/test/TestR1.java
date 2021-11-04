package it.polito.po.test;

import junit.framework.*;

import aeroporto.Aeroporto;

public class TestR1 extends TestCase {
	
	public void testGetDenominazione(){

		System.out.println("\n*** testGetDenominazione() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		String denominazione = a.getDenominazione();
		
		System.out.println("Creato aeroporto ");
		
		System.out.println("\nDenominazione:\n"+denominazione);
		
		boolean corretto = false;
		
		if(denominazione != null && denominazione.compareTo("Aeroporto_1")==0)
		{
			System.out.println("\nDenominazione gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nDenominazione gestita in maniera errata");
			
		assertEquals("Implementazione del metodo getDenominazione() e/o dei metodi correlati errata", true,corretto);	  
	}

	
	public void testGetIndirizzo(){

		System.out.println("\n*** testGetIndirizzo() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		String indirizzo = a.getIndirizzo();
		
		System.out.println("Creato aeroporto ");
		
		System.out.println("\nIndirizzo:\n"+indirizzo);
		
		boolean corretto = false;
		
		if(indirizzo != null && indirizzo.compareTo("Via Aeroporto")==0)
		{
			System.out.println("\nIndirizzo gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nIndirizzo gestito in maniera errata");
			
		assertEquals("Implementazione del metodo getIndirizzo() e/o dei metodi correlati errata", true,corretto);	  
	}	
	
	public void testGetNumeroAerei(){

		System.out.println("\n*** testGetNumeroAerei() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		int numeroAerei = a.getNumeroAerei();
		
		System.out.println("Creato aeroporto ");
		
		System.out.println("\nNumero aerei:\n"+numeroAerei);
		
		boolean corretto = false;
		
		if(numeroAerei==10)
		{
			System.out.println("\nNumero aerei gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nNumero aerei gestito in maniera errata");
			
		assertEquals("Implementazione del metodo getNumeroAerei() e/o dei metodi correlati errata", true,corretto);
	}	
	
	
	public void testDescrizioneAeroporto(){

		System.out.println("\n*** testDescrizioneAeroporto() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		String descrizioneAeroporto = a.descrizioneAeroporto();
		
		boolean corretto = false;
		
		if(descrizioneAeroporto != null && descrizioneAeroporto.compareTo("10 (3)")==0)
		{
			System.out.println("\nDescrizione aeroporto gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nDescrizione aeroporto gestita in maniera errata");
			
		assertEquals("Implementazione del metodo descrizioneAeroporto() e/o dei metodi correlati errata", true,corretto);	  
	}
}
