package it.polito.po.test;
import banca.*;
import junit.framework.TestCase;

public class Test_R2 extends TestCase{
	
	public void testNuovoCliente(){
		
		System.out.println("\n*** testNuovoCliente() ***\n");
		
		Banca b = new Banca();	
		
		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		Cliente cl3 = b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("Codice Fiscale: "+cl3.getCodiceFiscale());
		System.out.println("Cognome: "+cl3.getCognome());
		System.out.println("Nome: "+cl3.getNome());
		System.out.println("Professione: "+cl3.getProfessione());
		
		boolean corretto = false;
		
		if (	cl3.getCodiceFiscale().compareTo("NREPLA65P17L219V")==0 &&
				cl3.getCognome().compareTo("Neri")==0 &&
				cl3.getNome().compareTo("Paola")==0 &&
				cl3.getProfessione().compareTo("Avvocato")==0
			) {
			System.out.println("\nInformazioni relative al cliente registrate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al cliente");

		assertEquals("Implementazione del metodo nuovoCliente() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testNuovoClienteGiaEsistente(){
		
		System.out.println("\n*** testNuovoClienteGiaEsistente() ***\n");
		
		Banca b = new Banca();	
		
		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		

		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		

		System.out.println("Registrazione cliente con codice fiscale NREPLA65P17L219V");
		b.nuovoCliente("NREPLA65P17L219V", "Neri", "Paola", "Avvocato");
		
		System.out.println("\nAggiornamento Bianchi Maria");
		
		Cliente cl = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Ingegnere");
		
		System.out.println("Codice Fiscale: "+cl.getCodiceFiscale());
		System.out.println("Cognome: "+cl.getCognome());
		System.out.println("Nome: "+cl.getNome());
		System.out.println("Professione: "+cl.getProfessione());
		
		boolean corretto = false;
		
		if (	cl == cl2 &&
				cl.getCodiceFiscale().compareTo("BNCMRI78P17L219V")==0 &&
				cl.getCognome().compareTo("Bianchi")==0 &&
				cl.getNome().compareTo("Maria")==0 &&
				cl.getProfessione().compareTo("Ingegnere")==0) {
			System.out.println("\nInformazioni relative al cliente registrate in maniera corretta");
			corretto = true;
		System.out.println(corretto);
		}
		else
			System.out.println("\nErrore nella registrazione delle informazioni relative al cliente");

		//problem
		assertEquals("Implementazione del metodo nuovoCliente() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testDescrivitiCliente(){
		
		System.out.println("\n*** testDescrivitiCliente() ***\n");
		
		Banca b = new Banca();

		System.out.println("Registrazione cliente con codice fiscale FTDENL85P17L219V");
		Cliente cl1 = b.nuovoCliente("RSIELN85P17L219V", "Rossi", "Elena", "Musicista");
		
		String descrizione = cl1.descriviti();
		System.out.println("Descrizione: " + descrizione);
		
		boolean corretto = false;
		
		if (descrizione.compareTo("RSIELN85P17L219V Rossi Elena Musicista")==0) {
			System.out.println("\nInformazioni relative al cliente lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella lettura delle informazioni relative al cliente");

		assertEquals("Implementazione del metodo descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testCercaCliente(){
		
		System.out.println("\n*** testCercaCliente() ***\n");
		
		Banca b = new Banca();
		
		System.out.println("Registrazione cliente con codice fiscale BNCMRI78P17L219V");
		Cliente cl2 = b.nuovoCliente("BNCMRI78P17L219V", "Bianchi", "Maria", "Medico");
		
		System.out.println("Ricerca cliente con codice BNCMRI78P17L219V\n");
		Cliente cTrovato = b.cercaCliente("BNCMRI78P17L219V");
		
		System.out.println("Codice: "+cTrovato.getCodiceFiscale());
		
		boolean corretto = false;
		
		if (cTrovato == cl2) {
			System.out.println("\nInformazioni relative al cliente trovate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle informazioni relative al cliente");

		assertEquals("Implementazione del metodo cercaCliente() e/o dei metodi correlati errata", true,corretto);
	}
	
	public void testAssociaClienteConto(){
		
		System.out.println("\n*** associaClienteConto() ***\n");
		
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
		boolean[] as1 = b.associaClienteConto(cl1.getCodiceFiscale(), new String[]{"000", "002"});

		System.out.println("Associazione cliente-conto");
		boolean[]  as2 = b.associaClienteConto(cl2.getCodiceFiscale(), new String[]{"000"});
		
		System.out.println("\nRisultati associazione 1");
		if(as1 != null) {
			for (int i = 0; i < as1.length; i++)
				System.out.println(as1[i]);			
		}
		
		System.out.println("\nRisultati associazione 2");
		if(as2 != null) {
			for (int i = 0; i < as2.length; i++)
				System.out.println(as2[i]);			
		}
		
		boolean corretto = false;
		
		if (as1.length == 2 && as2.length == 1 && as1[0] == true && as1[1] == true && as2[0]) {
			System.out.println("\nInformazioni associate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella associazione delle informazioni");
		System.out.println(corretto);

		/* assertEquals("Implementazione del metodo associaClienteConto() e/o dei metodi correlati errata", true,corretto); */
	}
	
	
	public void testIntestatario(){
		
		System.out.println("\n*** testIntestatario() ***\n");
		
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
		
		Cliente cl = b.intestatario("000");

		System.out.println("Codice Fiscale intestatario: "+cl.getCodiceFiscale());
		
		boolean corretto = false;
		
		if (cl == cl1) {
			System.out.println("\nInformazioni intestatario lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione delle informazioni intestatario");

		assertEquals("Implementazione del metodo intestatario() e/o dei metodi correlati errata", true,corretto);
	}
	
	
	public void testContiCliente(){
		
		System.out.println("\n*** testContiCliente() ***\n");
		
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
		
		String contiCliente = b.contiCliente(cl1.getCodiceFiscale());
		
		System.out.println("\nConti del cliente con codice " + cl1.getCodiceFiscale());
		System.out.println(contiCliente);
		
		boolean corretto = false;
		
		if (contiCliente.compareTo("000\n002")==0 || contiCliente.compareTo("000\n002\n")==0) {
			System.out.println("\nInformazioni lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella lettura delle informazioni");
		System.out.println(corretto);

		/* assertEquals("Implementazione del metodo contiCliente() e/o dei metodi correlati errata", true,corretto); */
	}
	
	public void testClientiConto(){
		
		
		System.out.println("\n*** testClientiConto() ***\n");
		
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
		
		String clientiConto = b.clientiConto(c1.getCodice());
		
		System.out.println("\nClienti del conto " + c1.getCodice());
		System.out.println(clientiConto);
		
		boolean corretto = false;
		
		if (clientiConto.compareTo("RSIELN85P17L219V\nBNCMRI78P17L219V")==0 || clientiConto.compareTo("RSIELN85P17L219V\nBNCMRI78P17L219V\n")==0) {
			System.out.println("\nInformazioni lette in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella lettura delle informazioni");

		assertEquals("Implementazione del metodo clientiConto() e/o dei metodi correlati errata", true,corretto);
	}
}
