package it.polito.po.test;

import java.util.LinkedList;

import junit.framework.TestCase;

import polifactor.*;

public class TestR3_PuntateBraniEsibizioni extends TestCase{

	Stagione st;
	
	Brano br1;
	Brano br2;
	
	public void testAggiungiEsibizionePuntataInedito() {
		
		Global.init(this);
		st = Global.st;
		br1 = Global.br1;
		
		System.out.println("\n\n*** testAggiungiEsibizionePuntataInedito() ***\n");

		System.out.println("* Informazioni brano prima esibizione puntata 1:\n");

		System.out.println("Titolo: "+br1.getTitolo());
		if(br1 instanceof Inedito)
			System.out.println("Tipo: Inedito");
		else if(br1 instanceof Cover) {
			System.out.println("Tipo: Cover");
			System.out.println("Anno: "+((Cover)br1).getAnno());
		}
		
		boolean corretto = false;

		if(br1.getTitolo().compareTo("Una novita' assoluta")==0 && br1 instanceof Inedito)
		{
			System.out.println("\nAggiunta esibizione a puntata (inedito) gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione aggiunta esibizione a puntata (inedito)");

		assertEquals("Implementazione del metodo aggiungiEsibizionePuntata() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testAggiungiEsibizionePuntataCover() {
		
		Global.init(this);
		st = Global.st;
		br2 = Global.br2;
		
		System.out.println("\n\n*** testAggiungiEsibizionePuntataCover() ***\n");

		System.out.println("* Informazioni brano seconda esibizione puntata 1:\n");

		System.out.println("Titolo: "+br2.getTitolo());
		if(br2 instanceof Inedito)
			System.out.println("Tipo: Inedito");
		else if(br2 instanceof Cover) {
			System.out.println("Tipo: Cover");
			System.out.println("Anno originale: "+((Cover)br2).getAnno());
		}
		
		boolean corretto = false;

		if(br2.getTitolo().compareTo("Sciccheria")==0 && br2 instanceof Cover && ((Cover)br2).getAnno()==2019)
		{
			System.out.println("\nAggiunta esibizione a puntata (cover) gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione aggiunta esibizione a puntata (cover)");

		assertEquals("Implementazione del metodo aggiungiEsibizionePuntata() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testStampaEsibizioniPuntata() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testStampaEsibizioniPuntata() ***\n");

		System.out.println("* Esibizioni puntata 1 (in ordine di aggiunta):\n");
		
		String stringaEsibizioni = st.stampaEsibizioniPuntata(1);
		System.out.println(stringaEsibizioni);

		boolean corretto = false;
		
		if((stringaEsibizioni.compareTo("20220115\nVociona, 7000, Una novita' assoluta\nPiano piano, 9000, Sciccheria, 2019\nIl melodioso, 15000, Canzone favolosa\nStonata, 4000, Canzone noiosa\nAcuto, 6000, Canzone orecchiabile\nSuono sordo, 5000, Canzone cosi' cosi'\n")==0)||
           (stringaEsibizioni.compareTo("20220115\nVociona, 7000, Una novita' assoluta\nPiano piano, 9000, Sciccheria, 2019\nIl melodioso, 15000, Canzone favolosa\nStonata, 4000, Canzone noiosa\nAcuto, 6000, Canzone orecchiabile\nSuono sordo, 5000, Canzone cosi' cosi'")==0))				
		{
			System.out.println("\nStampa esibizioni puntata gestita in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione stampa esibizioni puntata");

		assertEquals("Implementazione del metodo stampaEsibizioniPuntata() e/o dei metodi correlati errata", true,corretto);	
	}
	
	
	public void testElencoBrani() {
		
		Global.init(this);
		st = Global.st;
		
		System.out.println("\n\n*** testElencoBrani() ***\n");

		System.out.println("* Elenco brani esibizioni (per titolo):\n");
		LinkedList<Brano> listaBrani = new LinkedList<Brano>(st.elencoBrani());
		for(Brano b : listaBrani)
			if(b instanceof Inedito)
				System.out.println(b.getTitolo());
			else if(b instanceof Cover)
				System.out.println(b.getTitolo()+" ("+((Cover) b).getAnno()+")");

		Brano b1 = listaBrani.get(0);
		Brano b2 = listaBrani.get(1);
		Brano b3 = listaBrani.get(2);
		Brano b4 = listaBrani.get(3);
		Brano b5 = listaBrani.get(4);
		Brano b6 = listaBrani.get(5);
		
		boolean corretto = false;
		
		if(b1.getTitolo().compareTo("Canzone cosi' cosi'")==0 && 
		   b2.getTitolo().compareTo("Canzone favolosa")==0 && 		
		   b3.getTitolo().compareTo("Canzone noiosa")==0 && 
		   b4.getTitolo().compareTo("Canzone orecchiabile")==0 &&		   
		   b5.getTitolo().compareTo("Sciccheria")==0 && 		
		   b6.getTitolo().compareTo("Una novita' assoluta")==0)
		{
			System.out.println("\nElenco brani gestito in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella gestione elenco brani");

		assertEquals("Implementazione del metodo elencoBrani() e/o dei metodi correlati errata", true,corretto);	
	}
}
