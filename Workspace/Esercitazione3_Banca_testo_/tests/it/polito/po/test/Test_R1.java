package it.polito.po.test;
import banca.*;
import junit.framework.TestCase;

public class Test_R1 extends TestCase{
	
	public void testNuovoConto(){
		
		System.out.println("\n*** testNuovoConto() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");

		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		
		System.out.println("Codice: "+c1.getCodice());
		System.out.println("Tasso: "+c1.getTassoInteresse());
		System.out.println("Capitale: "+c1.getCapitale());
		System.out.println("Data di apertura: "+c1.getDataApertura());
		System.out.println("Nome filiale: "+c1.getNomeFiliale());
		System.out.println("Nome operatore: "+c1.getNomeOperatore());
		
		boolean corretto = false;
		
		if (	c1.getCodice().compareTo("000")==0 &&
				c1.getTassoInteresse()==0.8 &&
				c1.getCapitale()==20000.0 &&
				c1.getDataApertura().compareTo("20211311")==0 &&
				c1.getNomeFiliale().compareTo("Unicredit - Via Regina Margherita")==0 &&
				c1.getNomeOperatore().compareTo("Mario Rossi")==0 ) {
			System.out.println("\nInformazioni relative al conto registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al conto");

		assertEquals("Implementazione del metodo nuovoConto() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testContoDescriviti(){
		
		System.out.println("\n*** testContoDescriviti() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");

		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		
		
		String descrizione = c1.descriviti();
		System.out.println("Descrizione: " + descrizione);
		
		boolean corretto = false;
		
		if (descrizione.compareTo("000 0.8 20000.0 20211311 Mario Rossi Unicredit - Via Regina Margherita")==0) {
			System.out.println("\nInformazioni relative al conto lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella lettura delle informazioni relative al conto");

		assertEquals("Implementazione del metodo descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testCercaConto(){
		
		System.out.println("\n*** testCercaConto() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");

		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		
		System.out.println("Ricerca conto con codice 000\n");
		Conto cTrovato = b.cercaConto("000");
		
		System.out.println("Codice: "+cTrovato.getCodice());
		
		boolean corretto = false;
		
		if (cTrovato == c1) {
			System.out.println("\nInformazioni relative al conto trovate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle informazioni relative al conto");

		assertEquals("Implementazione del metodo cercaConto() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testCercaContoInesistente(){
		
		System.out.println("\n*** testCercaContoInesistente() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");

		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		
		
		System.out.println("Ricerca conto con codice 010\n");
		Conto cTrovato = b.cercaConto("010");
		
		System.out.println("Conto: " + cTrovato);
		
		boolean corretto = false;
		
		if (cTrovato ==  null) {
			System.out.println("\nInformazioni relative al conto trovate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle informazioni relative al conto");

		assertEquals("Implementazione del metodo cercaConto() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testCercaConti(){
		
		System.out.println("\n*** testCercaConti() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		
		System.out.println("Registrazione conto 001");
		Conto c2 = b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		
		System.out.println("Registrazione conto 002");
		Conto c3 = b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		
		System.out.println("Ricerca della string b\n");
		Conto[] cTrovati = b.cercaConti("b");
		
		System.out.println("\nInformazioni conti trovati");
		if (cTrovati != null) {
			for(Conto c : cTrovati)
				if(c!=null) 
					System.out.println(""+c.descriviti());
		}
		
		boolean corretto = false;
		
		if (cTrovati.length == 2 && cTrovati[0] == c2 && cTrovati[1] == c3) {
			System.out.println("\nInformazioni relative ai conti trovate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle informazioni relative ai conti");

		assertEquals("Implementazione del metodo cercaConti() e/o dei metodi correlati errata", true,corretto);
	}

}
