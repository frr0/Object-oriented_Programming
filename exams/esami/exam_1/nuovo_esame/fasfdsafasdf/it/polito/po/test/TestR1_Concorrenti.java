package it.polito.po.test;

import java.util.*;

import polifactor.*;

import junit.framework.TestCase;

public class TestR1_Concorrenti extends TestCase{

	Stagione st;
	String c1;
	String c2;
	String c3;
	
	public void testRegistraConcorrente() {
		
		Global.init(this);
		st = Global.st;
		c1 = Global.c1;

		System.out.println("\n\n*** testRegistraConcorrente() ***\n");

		System.out.println("* Codice assegnato al primo concorrente\n");
		
		System.out.println(c1);
		
		boolean corretto = false;

		if(c1.compareTo("S2C1")==0)
		{
			System.out.println("\nCodice concorrente assegnato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nell'assegnazione del codice al concorrente");

		assertEquals("Implementazione del metodo registraConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testRegistraAltriConcorrenti() {
		
		Global.init(this);
		st = Global.st;
		c2 = Global.c2;
		c3 = Global.c3;

		System.out.println("\n\n*** testRegistraAltriConcorrenti() ***\n");

		System.out.println("* Codice assegnato al secondo concorrente\n");
		
		System.out.println(c2);

		System.out.println("\n* Codice assegnato al terzo concorrente\n");
		
		System.out.println(c3);

		boolean corretto = false;

		if(c2.compareTo("S2C2")==0 && c3.compareTo("S2C3")==0)
		{
			System.out.println("\nCodici concorrente assegnati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nell'assegnazione dei codici ai concorrenti");

		assertEquals("Implementazione del metodo registraConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}

	
	public void testCercaConcorrentePerNomeDArte() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testCercaConcorrentePerNomeDArte() ***\n");

		System.out.println("* Ricerca concorrente \"Vociona\"");
		
		Concorrente c = st.cercaConcorrentePerNomeDArte("Vociona");

		System.out.println("\n* Informazioni relative al concorrente\n");

		System.out.println(""+c.getCognome());
		System.out.println(""+c.getNome());
		System.out.println(""+c.getDataNascita());
		
		
		boolean corretto = false;

		if(c.getNomeDArte().compareTo("Vociona")==0 && 
		   c.getDataNascita().compareTo("19960129")==0 &&
		   ((c.getNome().compareTo("Luisa")==0 && c.getCognome().compareTo("Gialli")==0) || 
		   (c.getNome().compareTo("Gialli")==0 && c.getCognome().compareTo("Luisa")==0)))
		{
			System.out.println("\nRicerca concorrente per nome d'arte gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore della gestione della ricerca concorrente per nome d'arte");

		assertEquals("Implementazione del metodo cercaConcorrentePerNomeDArte() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testCercaConcorrentePerCodice() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testCercaConcorrentePerCodice() ***\n");

		System.out.println("* Ricerca concorrente con codice S2C3");
		
		Concorrente c = st.cercaConcorrentePerCodice("S2C3");

		System.out.println("\n* Informazioni relative al concorrente\n");

		System.out.println(""+c.getCognome());
		System.out.println(""+c.getNome());
		System.out.println(""+c.getDataNascita());
		
		
		
		boolean corretto = false;

		if(c.getNomeDArte().compareTo("Piano piano")==0 && 
		   c.getDataNascita().compareTo("19760101")==0 &&
		   ((c.getNome().compareTo("Michele")==0 && c.getCognome().compareTo("Neri")==0) || 
		   (c.getNome().compareTo("Neri")==0 && c.getCognome().compareTo("Michele")==0)))
		{
			System.out.println("\nRicerca concorrente per codice gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore della gestione della ricerca concorrente per codice");

		assertEquals("Implementazione del metodo cercaConcorrentePerCodice() e/o dei metodi correlati errata", true,corretto);	
	}
	
	public void testRegistraConcorrenteEsistente() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testRegistraConcorrenteEsistente() ***\n");

		System.out.println("* Registrato concorrente \"Il melodioso\" gia' esistente");

		st.registraConcorrente("Il melodioso", "Alberto", "Rossi", "19980623");

		Concorrente c = st.cercaConcorrentePerNomeDArte("Il melodioso");

		System.out.println("\n* Informazioni relative al concorrente\n");

		System.out.println(""+c.getCognome());
		System.out.println(""+c.getNome());
		System.out.println(""+c.getDataNascita());
		
		boolean corretto = false;

		if(c.getNomeDArte().compareTo("Il melodioso")==0 && 
		   c.getDataNascita().compareTo("19980623")==0 &&
		   ((c.getNome().compareTo("Alberto")==0 && c.getCognome().compareTo("Rossi")==0) || 
		   (c.getNome().compareTo("Rossi")==0 && c.getCognome().compareTo("Alberto")==0)))
		{
			System.out.println("\nRegistrazione concorrente esistente gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore della gestione della registrazione concorrente esistente");

		assertEquals("Implementazione del metodo registraConcorrente() e/o dei metodi correlati errata", true,corretto);	
		
	}
	
	
	public void testElencoConcorrentiNomeDArte() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testElencoConcorrentiNomeDArte() ***\n");

		System.out.println("* Elenco concorrenti (per nome d'arte):\n");
		LinkedList<Concorrente> listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiNomeDArte());
		for(Concorrente c : listaConcorrenti)
			System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());

		boolean corretto = false;

		Concorrente c1 = listaConcorrenti.get(0);
		Concorrente c2 = listaConcorrenti.get(1);
		Concorrente c3 = listaConcorrenti.get(2);
		Concorrente c4 = listaConcorrenti.get(3);
		Concorrente c5 = listaConcorrenti.get(4);
		Concorrente c6 = listaConcorrenti.get(5);

		
		if(c1.getNomeDArte().compareTo("Acuto")==0 && 
		   c2.getNomeDArte().compareTo("Il melodioso")==0 && 		
		   c3.getNomeDArte().compareTo("Piano piano")==0 && 		
		   c4.getNomeDArte().compareTo("Stonata")==0 && 	
		   c5.getNomeDArte().compareTo("Suono sordo")==0 && 
		   c6.getNomeDArte().compareTo("Vociona")==0)
		{
			System.out.println("\nElenco concorrenti per nome d'arte gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione dell'elenco concorrenti per nome d'arte");

		assertEquals("Implementazione del metodo elencoConcorrentiNomeDArte() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testElencoConcorrentiDataNascita() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testElencoConcorrentiDataNascita() ***\n");

		System.out.println("* Elenco concorrenti (per data di nascita):\n");
		LinkedList<Concorrente> listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiDataNascita());
		for(Concorrente c : listaConcorrenti)
			System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());

		boolean corretto = false;

		Concorrente c1 = listaConcorrenti.get(0);
		Concorrente c2 = listaConcorrenti.get(1);
		Concorrente c3 = listaConcorrenti.get(2);
		Concorrente c4 = listaConcorrenti.get(3);
		Concorrente c5 = listaConcorrenti.get(4);
		Concorrente c6 = listaConcorrenti.get(5);


		
		
		if(((c1.getNomeDArte().compareTo("Acuto")==0 && 
		   c2.getNomeDArte().compareTo("Il melodioso")==0 && 		
		   c3.getNomeDArte().compareTo("Suono sordo")==0 && 		
		   c4.getNomeDArte().compareTo("Stonata")==0 && 	
		   c5.getNomeDArte().compareTo("Vociona")==0 && 
		   c6.getNomeDArte().compareTo("Piano piano")==0)) || 
				
		  (c1.getNomeDArte().compareTo("Piano piano")==0 && 
		   c2.getNomeDArte().compareTo("Stonata")==0 && 		
		   c3.getNomeDArte().compareTo("Vociona")==0 && 		
		   c4.getNomeDArte().compareTo("Suono sordo")==0 && 	
		   c5.getNomeDArte().compareTo("Il melodioso")==0 && 
		   c6.getNomeDArte().compareTo("Acuto")==0))
		{
			System.out.println("\nElenco concorrenti per nome d'arte gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione dell'elenco concorrenti per nome d'arte");

		assertEquals("Implementazione del metodo elencoConcorrentiNomeDArte() e/o dei metodi correlati errata", true,corretto);	
	}
}
