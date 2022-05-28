package it.polito.po.test;

import java.util.*;

import polifactor.*;

import junit.framework.TestCase;

public class TestR2_Squadre extends TestCase{

	Stagione st;

	boolean eccezione1;
	boolean eccezione2;
	boolean eccezione3;
	boolean eccezione4;
	boolean eccezione5;
	boolean eccezione6;
	boolean eccezione7;
	boolean eccezione8;

	public void testElencoSquadre() {
		
		Global.init(this);
		st = Global.st;

		System.out.println("\n\n*** testElencoSquadre() ***\n");

		System.out.println("* Elenco squadre/giudici:\n");
		LinkedList<Squadra> listaSquadre = new LinkedList<Squadra>(st.elencoSquadre());
		for(Squadra s : listaSquadre)
			System.out.println(s.getGiudice());

		Squadra s1 = listaSquadre.get(0);
		Squadra s2 = listaSquadre.get(1);
		Squadra s3 = listaSquadre.get(2);
		
		boolean corretto = false;

		if(s1.getGiudice().compareTo("Attento")==0 && 
		   s2.getGiudice().compareTo("Severa")==0 &&	
		   s3.getGiudice().compareTo("Superficiale")==0)
		{
			System.out.println("\nElenco squadre / Creazione squadra gestiti in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione dell'elenco squadre / creazione della squadra");

		assertEquals("Implementazione del metodo creaSquadra(), elencoSquadre() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testAssegnaConcorrente() {
		
		Global.init(this);
		st = Global.st;
		eccezione1 = Global.eccezione1;
		eccezione2 = Global.eccezione2;
		
		System.out.println("\n\n*** testAssegnaConcorrente() ***\n");

		if(eccezione1)
			System.out.println("Eccezione, raggiunto limite numero concorrenti nell'assegnare il concorrente S2C2 alla squadra \"Severa\"");
		else if(eccezione2) 
			System.out.println("Eccezione, concorrente già assegnato ad altra squadra nell'assegnare il concorrente S2C2 alla squadra \"Severa\"");		
		else
			System.out.println("Nessuna eccezione scatenata nell'assegnare il concorrente S2C2 alla squadra \"Severa\"");
			
		boolean corretto = false;

		if(eccezione1==false && eccezione2==false)
		{
			System.out.println("\nGenerazione eccezioni nell'assegnazione concorrente alla squadra gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione delle eccezioni nell'assegnazione concorrente alla squadra");

		assertEquals("Implementazione del metodo assegnaConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testAssegnaAltriTreConcorrentiDiCuiUnoInesistente() {
		
		Global.init(this);
		st = Global.st;
		eccezione3 = Global.eccezione3;
		eccezione4 = Global.eccezione4;
		
		System.out.println("\n\n*** testAssegnaAltriTreConcorrentiDiCuiUnoInesistente() ***\n");

		if(eccezione3)
			System.out.println("Eccezione, raggiunto limite numero concorrenti nell'assegnare i tre concorrenti (di cui uno inesistente) alla squadra \"Severa\"");
		else if(eccezione4) 
			System.out.println("Eccezione, concorrente già assegnato nell'assegnare i tre concorrenti (di cui uno inesistente) alla squadra \"Severa\"");		
		else
			System.out.println("Nessuna eccezione scatenata nell'assegnare i tre concorrenti (di cui uno inesistente) alla squadra \"Severa\"");
			
		boolean corretto = false;

		if(eccezione3==false && eccezione4==false)
		{
			System.out.println("\nGenerazione eccezioni nell'assegnazione concorrenti alla squadra gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione delle eccezioni nell'assegnazione concorrenti alla squadra");

		assertEquals("Implementazione del metodo assegnaConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}
	

	public void testAssegnaConcorrenteOltreIlLimite() {
		
		Global.init(this);
		st = Global.st;
		eccezione5 = Global.eccezione5;
		eccezione6 = Global.eccezione6;
		
		System.out.println("\n\n*** testAssegnaConcorrenteOltreIlLimite() ***\n");

		if(eccezione5)
			System.out.println("Eccezione, raggiunto limite numero concorrenti nell'assegnare un concorrente oltre il limite alla squadra \"Severa\"");
		else if(eccezione6) 
			System.out.println("Eccezione, concorrente già assegnato nell'assegnare un concorrente oltre il limite alla squadra \"Severa\"");		
		else
			System.out.println("Nessuna eccezione scatenata nell'assegnare un concorrente oltre il limite alla squadra \"Severa\"");
			
		boolean corretto = false;

		if(eccezione5==true && eccezione6==false)
		{
			System.out.println("\nGenerazione eccezioni nell'assegnazione concorrenti alla squadra gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione delle eccezioni nell'assegnazione concorrenti alla squadra");

		assertEquals("Implementazione del metodo assegnaConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}
	

	public void testAssegnaConcorrenteGiaAssegnato() {
		
		Global.init(this);
		st = Global.st;
		eccezione7 = Global.eccezione7;
		eccezione8 = Global.eccezione8;
		
		System.out.println("\n\n*** testAssegnaConcorrenteGiaAssegnato() ***\n");

		if(eccezione7)
			System.out.println("Eccezione, raggiunto limite numero concorrenti nell'assegnare il concorrente S2C2 (gia' assegnato) alla squadra \"Superficiale\"");
		else if(eccezione8) 
			System.out.println("Eccezione, concorrente già assegnato ad altra squadra nell'assegnare il concorrente S2C2 (gia' assegnato) alla squadra \"Superficiale\"");		
		else
			System.out.println("Nessuna eccezione scatenata nell'assegnare il concorrente S2C2 (gia' assegnato) alla squadra \"Superficiale\"");
			
		boolean corretto = false;

		if(eccezione7==false && eccezione8==true)
		{
			System.out.println("\nGenerazione eccezioni nell'assegnazione concorrenti alla squadra gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella generazione delle eccezioni nell'assegnazione concorrenti alla squadra");

		assertEquals("Implementazione del metodo assegnaConcorrente() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testElencoConcorrentiSquadra() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testElencoConcorrentiSquadra() ***\n");

		System.out.println("* Elenco concorrenti (per nome d'arte) squadra \"Severa\":\n");
		LinkedList<Concorrente> listaConcorrenti = new LinkedList<Concorrente>(st.elencoConcorrentiSquadra("Severa"));
        for(Concorrente c : listaConcorrenti)
        	System.out.println(""+c.getCodice()+" "+c.getNomeDArte()+" "+c.getCognome()+" "+c.getNome()+" "+c.getDataNascita());

		Concorrente c1 = listaConcorrenti.get(0);
		Concorrente c2 = listaConcorrenti.get(1);
		Concorrente c3 = listaConcorrenti.get(2);

		
		boolean corretto = false;

		if(c1.getNomeDArte().compareTo("Piano piano")==0 && 
		   c2.getNomeDArte().compareTo("Stonata")==0 && 		
		   c3.getNomeDArte().compareTo("Vociona")==0) 		
		{
			System.out.println("\nElenco concorrenti squadra gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione elenco concorrenti squadra");

		assertEquals("Implementazione del metodo elencoConcorrentiSquadra() e/o dei metodi correlati errata", true,corretto);	
	}
}
