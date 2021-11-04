package it.polito.po.test;

import aeroporto.Aeroporto;
import junit.framework.TestCase;

public class TestR3 extends TestCase{
	
	public void testAggiungiViaggio(){

		System.out.println("\n*** testAggiungiViaggio() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1500);
		int id2 = a.aggiungiAereo("Aereo_B", 150, 1000);
		int id3 = a.aggiungiAereo("Aereo_C", 200, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		
		System.out.println("Creazione viaggio");
		String viaggio = a.aggiungiViaggio("Torino-Bari", 100, 1500);
		
		System.out.println("Creato viaggio: "+viaggio);
		
				
		boolean corretto = false;
		
		if(	viaggio != null && viaggio.compareTo("0;Torino-Bari")==0 )
		{
			System.out.println("\nViaggio aggiunto in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nViaggio aggiunto in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiViaggio() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testAggiungiViaggioPiuViaggi(){

		System.out.println("\n*** testAggiungiViaggioPiuViaggi() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1500);
		int id2 = a.aggiungiAereo("Aereo_B", 150, 1300);
		int id3 = a.aggiungiAereo("Aereo_C", 150, 1800);
		int id4 = a.aggiungiAereo("Aereo_D", 150, 1500);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		System.out.println("Id4: " + id4);
		
		System.out.println("Creazione viaggio");
		String viaggio1 = a.aggiungiViaggio("Torino-Bari", 150, 1200);
		String viaggio2 = a.aggiungiViaggio("Torino-Milano", 140, 1500);
		String viaggio3 = a.aggiungiViaggio("Torino-Roma", 180, 1500);
		String viaggio4 = a.aggiungiViaggio("Torino-Brindisi", 150, 1400);
		
		System.out.println("Creato viaggio: "+viaggio1);
		System.out.println("Creato viaggio: "+viaggio2);
		System.out.println("Creato viaggio: "+viaggio3);
		System.out.println("Creato viaggio: "+viaggio4);
		
				
		boolean corretto = false;
		
		if(		viaggio1 != null && viaggio2 != null && viaggio4 != null &&
				viaggio1.compareTo("1;Torino-Bari")==0 &&
				viaggio2.compareTo("3;Torino-Milano")==0 &&
				viaggio4.compareTo("2;Torino-Brindisi")==0)
		{
			System.out.println("\nViaggi aggiunti in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nViaggi aggiunti in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiViaggio() e/o dei metodi correlati errata", true,corretto);	  
	}
}
