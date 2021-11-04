package it.polito.po.test;

import aeroporto.Aeroporto;
import junit.framework.TestCase;

public class TestR4 extends TestCase{
	
	public void testViaggio(){

		System.out.println("\n*** testViaggio() ***\n");
		
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
		
		System.out.println("Ricerca viaggio");
		String viaggio = a.viaggio(3, "Torino-Milano");
		
		System.out.println("Trovato viaggio: " + viaggio);
				
		boolean corretto = false;
		
		if(		viaggio != null && viaggio.compareTo("3;Torino-Milano;140;1500")==0)
		{
			System.out.println("\nViaggio cercato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nViaggio cercato in maniera errata");
			
		assertEquals("Implementazione del metodo viaggio() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testViaggi(){

		System.out.println("\n*** testViaggi() ***\n");
		
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
		
		System.out.println("Ricerca viaggi");
		String viaggi = a.viaggi();
		
		System.out.println("Trovato viaggi: \n\n" + viaggi);
		String stringaCorretta = "1;Torino-Bari;150;1200\n3;Torino-Milano;140;1500\n2;Torino-Brindisi;150;1400";
				
		boolean corretto = false;
		
		if(		viaggi != null && viaggi.compareTo(stringaCorretta)==0)
		{
			System.out.println("\nViaggi cercati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nViaggi cercati in maniera errata");
			
		assertEquals("Implementazione del metodo viaggi() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testViaggiPerTratta(){

		System.out.println("\n*** testViaggiPerTratta() ***\n");
		
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
		String viaggio4 = a.aggiungiViaggio("Torino-Bari", 150, 1400);
		
		System.out.println("Creato viaggio: "+viaggio1);
		System.out.println("Creato viaggio: "+viaggio2);
		System.out.println("Creato viaggio: "+viaggio3);
		System.out.println("Creato viaggio: "+viaggio4);
		
		System.out.println("Ricerca viaggi per la tratta Torino-Bari");
		String viaggi = a.viaggiPerTratta("Torino-Bari");
		
		System.out.println("Trovato viaggi: \n\n" + viaggi);
		String stringaCorretta = "1;Torino-Bari;150;1200\n2;Torino-Bari;150;1400";
				
		boolean corretto = false;
		
		if(		viaggi != null && viaggi.compareTo(stringaCorretta)==0)
		{
			System.out.println("\nViaggi cercati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nViaggi cercati in maniera errata");
			
		assertEquals("Implementazione del metodo viaggiPerTratta() e/o dei metodi correlati errata", true,corretto);	  
	}
}
