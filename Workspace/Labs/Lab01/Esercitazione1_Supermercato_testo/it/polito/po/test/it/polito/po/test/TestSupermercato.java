package it.polito.po.test;

import junit.framework.*;
import supermercato.*;

public class TestSupermercato extends TestCase {
	
	public void testGetIndirizzo(){

		System.out.println("\n*** testGetIndirizzo() ***\n");
		
		Supermercato s = new Supermercato();
		s.setIndirizzo("Via di un altro supermercato");

		String indirizzo = s.getIndirizzo();
		
		System.out.println("Creato supermercato ed impostato indirizzo");
		
		System.out.println("\nIndirizzo:\n"+indirizzo);
		
		boolean corretto = false;
		
		if(indirizzo != null && indirizzo.compareTo("Via di un altro supermercato")==0)
		{
			System.out.println("\nIndirizzo gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nIndirizzo gestito in maniera errata");
			
		assertEquals("Implementazione del metodo getIndirizzo() e/o dei metodi correlati errata", true,corretto);	  
	}

	
	public void testGetCostoGiornaliero(){

		System.out.println("\n*** testGetCostoGiornaliero() ***\n");
		
		Supermercato s = new Supermercato();
		s.setCostoGiornaliero(123.6);

		double costoGiornaliero = s.getCostoGiornaliero();
		
		System.out.println("Creato supermercato ed impostato costo giornaliero");

		System.out.println("\nCosto giornaliero:\n"+costoGiornaliero);

		
		boolean corretto = false;
		
		if(costoGiornaliero==123.6)
		{
			System.out.println("\nCosto giornaliero gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nCosto giornaliero gestito in maniera errata");
			
		assertEquals("Implementazione del metodo getCostoGiornaliero() e/o dei metodi correlati errata", true,corretto);	  
	}	
	
	
	public void testUltimaVenditaUnaVendita(){

		System.out.println("\n*** testUltimaVenditaUnaVendita() ***\n");
		
		Supermercato s = new Supermercato();

		System.out.println("Registrazione di una vendita");
		
		s.nuovaVendita("Caffe", "Illy", 400, 2.5);

		System.out.println("");
		System.out.println("Ultima vendita:");
		String ultimaVendita = s.ultimaVendita();
		System.out.println(ultimaVendita);
		
		boolean corretto = false;
		
		if(ultimaVendita != null && ultimaVendita.compareTo("Caffe, Illy, 400, 2.5")==0)
		{
			System.out.println("\nUltima vendita gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nUltima vendita gestita in maniera errata");
			
		assertEquals("Implementazione del metodo ultimaVendita() e/o dei metodi correlati errata", true,corretto);	  
	}	
	
	
	public void testUltimaVenditaPiuIngressi(){

		System.out.println("\n*** testUltimaVenditaPiuIngressi() ***\n");
		
		Supermercato s = new Supermercato();

		System.out.println("Registrazione di una vendita");
		
		s.nuovaVendita("Caffe", "Illy", 400, 2.5);
		
		System.out.println("Registrazione di un'altra vendita");
		
		s.nuovaVendita("Caffe", "Lavazza", 200, 2.2);

		System.out.println("");
		System.out.println("Ultima vendita:");
		String ultimaVendita = s.ultimaVendita();
		System.out.println(ultimaVendita);
		
		boolean corretto = false;
		
		if(ultimaVendita != null && ultimaVendita.compareTo("Caffe, Lavazza, 200, 2.2")==0)
		{
			System.out.println("\nUltima vendita gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nUltima vendita gestita in maniera errata");
			
		assertEquals("Implementazione del metodo ultimaVendita() e/o dei metodi correlati errata", true,corretto);	  
	}	
	

	public void testVendita(){

		System.out.println("\n*** testVendita() ***\n");
		
		Supermercato s = new Supermercato();

		System.out.println("Registrazione di una vendita");
		
		s.nuovaVendita("Caffe", "Illy", 400, 2.5);
		
		System.out.println("Registrazione di una seconda vendita");
		
		s.nuovaVendita("Caffe", "Borbone", 150, 1.8);
		
		System.out.println("Registrazione di una terza vendita");
		
		s.nuovaVendita("Caffe", "Lavazza", 200, 2.2);

		System.out.println("");
		System.out.println("Ricerca della vendita con nome prodotto Caffe e marca Borbone:");
		String venditaCercata = s.vendita("Caffe", "Borbone");
		System.out.println(venditaCercata);
		
		boolean corretto = false;
		
		if(venditaCercata != null && venditaCercata.compareTo("Caffe, Borbone, 150, 1.8")==0)
		{
			System.out.println("\nRicerca vendita gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nRicerca vendita gestita in maniera errata");
			
		assertEquals("Implementazione del metodo vendita() e/o dei metodi correlati errata", true,corretto);	  
	}	
	
	
	public void testGiorniCoperti(){

		System.out.println("\n*** testGiorniCoperti() ***\n");
		
		Supermercato s = new Supermercato();
		
		s.setCostoGiornaliero(90);

		System.out.println("Registrazione di più vendite");
		
		s.nuovaVendita("Caffe", "Illy", 400, 2.5);
		s.nuovaVendita("Caffe", "Borbone", 150, 1.8);
		s.nuovaVendita("Caffe", "Lavazza", 200, 2.2);

		System.out.println("");
		System.out.println("Numero di giorni coperti:");
		double giorniCoperti = s.giorniCoperti();
		System.out.println(giorniCoperti);
		
		boolean corretto = false;
		
		if(giorniCoperti==19.0)
		{
			System.out.println("\nCalcolo dei giorni coperti gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nCalcolo dei giorni coperti gestito in maniera errata");
			
		assertEquals("Implementazione del metodo giorniCoperti() e/o dei metodi correlati errata", true,corretto);	  
	}
}
