package it.polito.po.test;

import junit.framework.TestCase;

import polifactor.*;

public class TestR4_EliminatiVincitori extends TestCase{

	Stagione st;
	
	public void testConcorrenteEliminatoPuntata() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testConcorrenteEliminatoPuntata() ***\n");

		System.out.println("* Concorrente eliminato puntata 1:\n");

		Concorrente ce1 = st.concorrenteEliminatoPuntata(1);
		System.out.println(""+ce1.getCodice()+" "+ce1.getNomeDArte());
		
		System.out.println("\n* Concorrente eliminato puntata 2:\n");

		Concorrente ce2 = st.concorrenteEliminatoPuntata(2);
		System.out.println(""+ce2.getCodice()+" "+ce2.getNomeDArte()+" "+ce2.getCognome());
		
		System.out.println("\n* Concorrente eliminato puntata 3:\n");

		Concorrente ce3 = st.concorrenteEliminatoPuntata(3);
		System.out.println(""+ce3.getCodice()+" "+ce3.getNomeDArte()+" "+ce3.getCognome());
		
		System.out.println("\n* Concorrente eliminato puntata 4:\n");

		Concorrente ce4 = st.concorrenteEliminatoPuntata(4);
		System.out.println(""+ce4.getCodice()+" "+ce4.getNomeDArte()+" "+ce4.getCognome());
		
		System.out.println("\n* Concorrente eliminato puntata 5:\n");

		Concorrente ce5 = st.concorrenteEliminatoPuntata(5);
		System.out.println(""+ce5.getCodice()+" "+ce5.getNomeDArte()+" "+ce5.getCognome());

		boolean corretto = false;

		if(ce1.getNomeDArte().compareTo("Stonata")==0 && 
		   ce2.getNomeDArte().compareTo("Suono sordo")==0 &&
		   ce3.getNomeDArte().compareTo("Acuto")==0 && 
     	   ce4.getNomeDArte().compareTo("Vociona")==0 &&
           ce5.getNomeDArte().compareTo("Il melodioso")==0)
		{
			System.out.println("\nEliminazione concorrenti gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione eliminazione concorrenti");

		assertEquals("Implementazione del metodo concorrenteEliminatoPuntata() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testStampaConcorrentiEliminati() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testStampaConcorrentiEliminati() ***\n");

		String stringaEliminati = st.stampaConcorrentiEliminati();
		System.out.println(stringaEliminati);
		
		boolean corretto = false;

		if(stringaEliminati.compareTo("Acuto 3 20220205\nIl melodioso 5 20220119\nStonata 1 20220115\nSuono sordo 2 20220122\nVociona 4 20220112\n")==0 || 
		   stringaEliminati.compareTo("Acuto 3 20220205\nIl melodioso 5 20220119\nStonata 1 20220115\nSuono sordo 2 20220122\nVociona 4 20220112")==0)
		{
			System.out.println("\nStampa concorrenti eliminati gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione stampa concorrenti eliminati");

		assertEquals("Implementazione del metodo stampaConcorrentiEliminati() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testVincitore() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testVincitore() ***\n");

		System.out.println("\n* Vincitore della stagione:\n");

		st.concorrenteEliminatoPuntata(1);
		st.concorrenteEliminatoPuntata(2);
		st.concorrenteEliminatoPuntata(3);
		st.concorrenteEliminatoPuntata(4);
		st.concorrenteEliminatoPuntata(5);
		st.stampaConcorrentiEliminati();
		
		Concorrente v = st.vincitore();

		if(v!=null)
			System.out.println(""+v.getCodice()+" "+v.getNomeDArte());
		else
			System.out.println("Non vi e' un vincitore");
		
		boolean corretto = false;

		if(v.getNomeDArte().compareTo("Piano piano")==0)
		{
			System.out.println("\nVincitore stagione gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione vincitore stagione");

		assertEquals("Implementazione del metodo vincitore() e/o dei metodi correlati errata", true,corretto);	
	}
	
}
