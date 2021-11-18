package it.polito.po.test;

import banca.*;
import junit.framework.TestCase;

public class Test_R3 extends TestCase{
	
	public void testNuovoPrestitoFido(){
		
		System.out.println("\n*** testNuovoPrestitoFido() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 001");
		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 002");
		Conto c3 = b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
		
		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
		Fido p3 = b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
		
		System.out.println("Capitale sul conto " + c3.getCodice() + " : " + c3.getCapitale());
		
		boolean corretto = false;
		
		if (p3 != null && p3 instanceof Fido && c3.getCapitale()==10000.0) {
			System.out.println("\nInformazioni relative al prestito registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al prestito");

		assertEquals("Implementazione del metodo nuovoPrestito() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testNuovoPrestitoMutuo(){
		
		System.out.println("\n*** testNuovoPrestitoMutuo() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 001");
		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 002");
		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
		Mutuo p1 = b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		Mutuo p2 = b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
		
		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
		
		System.out.println("Capitale sul conto " + c1.getCodice() + " : " + c1.getCapitale());
		
		boolean corretto = false;
		
		if (p1 != null && p1 instanceof Mutuo && p2 != null && p2 instanceof Mutuo && c1.getCapitale()==26200.0) {
			System.out.println("\nInformazioni relative al prestito registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al prestito");

		assertEquals("Implementazione del metodo nuovoPrestito() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testNuovoPrestitoMutuoAltriPrestiti(){
		
		System.out.println("\n*** testNuovoPrestitoMutuoAltriPrestiti() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 001");
		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 002");
		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
		
		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);

		System.out.println("Capitale sul conto " + c1.getCodice() + " : " + c1.getCapitale());
		
		boolean corretto = false;
		
		if (c1.getCapitale()==26200.0) {
			System.out.println("\nInformazioni relative al prestito registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al prestito");

		assertEquals("Implementazione del metodo nuovoPrestito() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testNuovoPrestitoMutuoNonAssociato(){
		
		System.out.println("\n*** testNuovoPrestitoMutuoNonAssociato() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		Conto c1 = b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 001");
		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 002");
		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
		
		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente NREPLA65P17L219V");
		b.nuovoPrestito("000", "NREPLA65P17L219V", 1200, 100.0, 12);
		

		System.out.println("Capitale sul conto " + c1.getCodice() + " : " + c1.getCapitale());
		
		boolean corretto = false;
		
		if (c1.getCapitale()==26200.0) {
			System.out.println("\nInformazioni relative al prestito registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al prestito");

		assertEquals("Implementazione del metodo nuovoPrestito() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testDescrivitiPrestito(){
		
		System.out.println("\n*** testDescrivitiPrestito() ***\n");
		
		Banca b = new Banca();		

		System.out.println("Registrazione conto 000");
		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 001");
		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
		System.out.println("Registrazione conto 002");
		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
		Mutuo p1 = b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
		
		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
		
		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
		Fido p3 = b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
		
		System.out.println("\nInformazioni relative al prestito 1");
		String d1 = p1.descriviti();
		System.out.println(d1);

		System.out.println("\nInformazioni relative al prestito 3");
		String d3 = p3.descriviti();
		System.out.println(d3);
		
		boolean corretto = false;
		
		if (d1.compareTo("000 BNCMRI78P17L219V M 5000.0")==0 && d3.compareTo("002 RSIELN85P17L219V F 0.5 5000.0")==0) {
			System.out.println("\nInformazioni relative al prestito lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella lettura delle informazioni relative al prestito");

		assertEquals("Implementazione del metodo descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
  	public void testPrestiti(){
  		
  		System.out.println("\n*** testPrestiti() ***\n");
  		
  		Banca b = new Banca();		
  
  		System.out.println("Registrazione conto 000");
  		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 001");
  		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 002");
  		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
  		
  		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
  		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
  		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
  		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
  		
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});
  
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
  		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
  		
  		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
  		
  		System.out.println("Tutti i prestiti\n");
  		Prestito[] prestiti = b.prestiti();
  		
  		if (prestiti != null) {
  			for(Prestito p : prestiti)
  				if(p!=null) 
  					System.out.println(p.descriviti());
  		}
  		
  		boolean corretto = false;
  		
  		if (	prestiti.length == 3 && 
  				prestiti[0].descriviti().contains("000") && prestiti[0].descriviti().contains("BNCMRI78P17L219V") && prestiti[0].descriviti().contains("5000.0") && 
  				prestiti[1].descriviti().contains("000") && prestiti[1].descriviti().contains("RSIELN85P17L219V") && prestiti[1].descriviti().contains("1200.0") &&
  				prestiti[2].descriviti().contains("002") && prestiti[2].descriviti().contains("RSIELN85P17L219V") && prestiti[2].descriviti().contains("5000.0")) {
  			System.out.println("\nInformazioni relative al prestito lette in maniera corretta");
  			corretto = true;
  		}
  		else
  			System.out.println("\nErrore nella lettura delle informazioni relative al prestito");
  
  		assertEquals("Implementazione del metodo prestiti() e/o dei metodi correlati errata", true,corretto);
  	}
  	
  	public void testPrestitiCliente(){
  		
  		System.out.println("\n*** testPrestitiCliente() ***\n");
  		
  		Banca b = new Banca();		
  
  		System.out.println("Registrazione conto 000");
  		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 001");
  		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 002");
  		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
  		
  		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
  		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
  		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
  		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
  		
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});
  
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
  		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
  		
  		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
  		
  		System.out.println("Tutti i prestiti del cliente RSIELN85P17L219V\n");
  		Prestito[] prestiti = b.prestiti("RSIELN85P17L219V");
  		
  		if (prestiti != null) {
  			for(Prestito p : prestiti)
  				if(p!=null) 
  					System.out.println(p.descriviti());
  		}
  		
  		boolean corretto = false;
  		
  		if (	prestiti.length == 2 && 
  				prestiti[0].descriviti().contains("000") && prestiti[0].descriviti().contains("RSIELN85P17L219V") && prestiti[0].descriviti().contains("1200.0") &&
  				prestiti[1].descriviti().contains("002") && prestiti[1].descriviti().contains("RSIELN85P17L219V") && prestiti[1].descriviti().contains("5000.0")		) {
  			System.out.println("\nInformazioni relative al prestito lette in maniera corretta");
  			corretto = true;
  		}
  		else
  			System.out.println("\nErrore nella lettura delle informazioni relative al prestito");
  
  		assertEquals("Implementazione del metodo prestiti() e/o dei metodi correlati errata", true,corretto);
  	}
  	
  	public void testPrestitiClienteTipo(){
  		
  		System.out.println("\n*** testPrestitiClienteTipo() ***\n");
  		
  		Banca b = new Banca();		
  
  		System.out.println("Registrazione conto 000");
  		b.nuovoConto(0.8, 20000.0, "20211311", "Mario Rossi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 001");
  		b.nuovoConto(0.7, 10000.0, "20211311", "Paolo Bianchi", "Unicredit - Via Regina Margherita");
  		System.out.println("Registrazione conto 002");
  		b.nuovoConto(0.6, 5000.0, "20211311", "Roberta Neri", "Banca Sella - Via Roma");
  		
  		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
  		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
  		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
  		
  
  		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
  		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
  		
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});
  
  		System.out.println("Associazione cliente-conto");
  		b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente BNCMRI78P17L219V");
  		b.nuovoPrestito("000", "BNCMRI78P17L219V", 5000, 416.67, 12);
  		
  		System.out.println("Nuovo prestito per il conto 000 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("000", "RSIELN85P17L219V", 1200, 100.0, 12);
  		
  		System.out.println("Nuovo prestito per il conto 002 e con garante il cliente RSIELN85P17L219V");
  		b.nuovoPrestito("002", "RSIELN85P17L219V", 5000, 416.67, 0.5);
  		
  		System.out.println("Tutti i mutui del cliente RSIELN85P17L219V\n");
  		Prestito[] prestiti = b.prestiti("RSIELN85P17L219V", "M");
  		
  		if (prestiti != null) {
  			for(Prestito p : prestiti)
  				if(p!=null) 
  					System.out.println(p.descriviti());
  		}
  		
  		boolean corretto = false;
  		
  		if (	prestiti.length == 1 && 
  				prestiti[0].descriviti().contains("000") && prestiti[0].descriviti().contains("RSIELN85P17L219V") && prestiti[0].descriviti().contains("1200.0")		) {
  			System.out.println("\nInformazioni relative al prestito lette in maniera corretta");
  			corretto = true;
  		}
  		else
  			System.out.println("\nErrore nella lettura delle informazioni relative al prestito");
  
  		assertEquals("Implementazione del metodo prestiti() e/o dei metodi correlati errata", true,corretto);
  	}
	
  	
}
