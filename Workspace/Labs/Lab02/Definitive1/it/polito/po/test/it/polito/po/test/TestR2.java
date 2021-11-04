package it.polito.po.test;

import aeroporto.Aeroporto;
import junit.framework.TestCase;

public class TestR2 extends TestCase{
	
	public void testAggiungiAereo(){

		System.out.println("\n*** aggiungiAereo() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id = a.aggiungiAereo("Aereo_A", 100, 1000);
		
		System.out.println("Id: " + id);
		
		boolean corretto = false;
		
		if(id==0)
		{
			System.out.println("\nAereo/i aggiunto/i in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAereo/i aggiunto/i in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiAereo() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testAggiungiAereoPiuAerei(){

		System.out.println("\n*** aggiungiAereoPiuAerei() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id2 = a.aggiungiAereo("Aereo_B", 100, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		
		boolean corretto = false;
		
		if(id1==0 && id2==1)
		{
			System.out.println("\nAereo/i aggiunto/i in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAereo/i aggiunto/i in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiAereo() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	
	public void testAggiungiAereoGiaPresente(){

		System.out.println("\n*** testAggiungiAereoGiaPresente() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id2 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id3 = a.aggiungiAereo("Aereo_B", 100, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		
		boolean corretto = false;
		
		if(id1==0 && id3==1)
		{
			System.out.println("\nAereo/i aggiunto/i in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAereo/i aggiunto/i in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiAereo() e/o dei metodi correlati errata", true,corretto);	
	}
	
	public void testAggiungiAereoNumeroEccessivoAerei(){

		System.out.println("\n*** testAggiungiAereoNumeroEccessivoAerei() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 3);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id2 = a.aggiungiAereo("Aereo_B", 100, 1000);
		int id3 = a.aggiungiAereo("Aereo_C", 100, 1000);
		a.aggiungiAereo("Aereo_D", 100, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		
		boolean corretto = false;
		
		if(id1==0 && id2==1 && id3==2)
		{
			System.out.println("\nAereo/i aggiunto/i in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAereo/i aggiunto/i in maniera errata");
			
		assertEquals("Implementazione del metodo aggiungiAereo() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testAereo(){

		System.out.println("\n*** testAereo() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 3);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id2 = a.aggiungiAereo("Aereo_B", 100, 1000);
		int id3 = a.aggiungiAereo("Aereo_C", 100, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		
		System.out.println("Ricerca aereo");
		String aereo1 = a.aereo(id1);
		
		System.out.println("Aereo cercato: " + aereo1);
		
		boolean corretto = false;
		
		if(aereo1!=null && aereo1.compareTo("Aereo_A;100;1000")==0)
		{
			System.out.println("\nAereo cercato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAereo cercato in maniera errata");
			
		assertEquals("Implementazione del metodo aereo() e/o dei metodi correlati errata", true,corretto);	  
	}
	
	public void testAerei(){

		System.out.println("\n*** testAerei() ***\n");
		
		Aeroporto a = new Aeroporto("Aeroporto_1", "Via Aeroporto", 10);

		System.out.println("Creato aeroporto ");
		
		a.setNumeroDecolli(3);
		
		System.out.println("Impostato numero decolli");

		System.out.println("Aggiunto aereo/i");
		int id1 = a.aggiungiAereo("Aereo_A", 100, 1000);
		int id2 = a.aggiungiAereo("Aereo_B", 100, 1000);
		int id3 = a.aggiungiAereo("Aereo_C", 100, 1000);
		
		System.out.println("Id1: " + id1);
		System.out.println("Id2: " + id2);
		System.out.println("Id3: " + id3);
		
		System.out.println("Descrizione aerei");
		String[] aerei = a.aerei();
		
		for(String s : aerei) {
			System.out.println(s);
		}
		
		boolean corretto = false;
		
		if(	aerei != null && aerei.length == 3 && 
			aerei[0].compareTo("0;Aereo_A")==0 &&
			aerei[1].compareTo("1;Aereo_B")==0 &&
			aerei[2].compareTo("2;Aereo_C")==0 )
		{
			System.out.println("\nAerei descritti in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nAerei descritti in maniera errata");
			
		assertEquals("Implementazione del metodo aerei() e/o dei metodi correlati errata", true,corretto);	  
	}
}
