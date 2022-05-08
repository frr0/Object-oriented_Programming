package it.polito.po.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import palestra.Cardio;
import palestra.CorpoLibero;
import palestra.Esercizio;
import palestra.Iscritto;
import palestra.Palestra;
import palestra.Weightlifting;

public class Test_R2 extends TestCase{
	
    @SuppressWarnings("unused")
	public void testNuovoEsercizio(){

        System.out.println("\n*** testNuovoEsercizio() ***\n");

        Palestra p = new Palestra();
        
     	System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 170);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 100);
     	
		System.out.println("\nEsercizi creati:\n");
		System.out.println(e1.descriviti());
		System.out.println(e2.descriviti());
		System.out.println(e3.descriviti());
		System.out.println(e4.descriviti());
		System.out.println(e5.descriviti());
		System.out.println(e6.descriviti());

        boolean corretto = false;

        if ( e1 instanceof Cardio && e2 instanceof Weightlifting && e4 instanceof CorpoLibero && e6.descriviti().equals("ddl Deadlift WGT 6 100") ) {
                System.out.println("\nCreazione esercizio gestita in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella creazione dell'esercizio");

        assertEquals("Implementazione del metodo nuovoEsercizio() e/o dei metodi correlati errata", true,corretto);
	}

    @SuppressWarnings("unused")
	public void testEsercizio(){

        System.out.println("\n*** testEsercizio() ***\n");

        Palestra p = new Palestra();
        
     	System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 170);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 100);
     	
		System.out.println("\nRicerca esercizio:\n");
		Esercizio eTrovato = p.esercizio("pu");
		System.out.println(eTrovato.descriviti());

        boolean corretto = false;

        if ( eTrovato.equals(e5) ) {
                System.out.println("\nEsercizio cercato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca dell'esercizio");

        assertEquals("Implementazione del metodo esercizio() e/o dei metodi correlati errata", true,corretto);
	}


    @SuppressWarnings("unused")
	public void testEsercizi(){

        System.out.println("\n*** testEsercizi() ***\n");
        
        Palestra p = new Palestra();
     	
        System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 170);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 100);
     	
		System.out.println("\nElenco esercizi:\n");
		ArrayList<Esercizio> elencoEsercizi = new ArrayList<>(p.esercizi());
		for(Esercizio ei : elencoEsercizi)
			System.out.println(ei.descriviti());

        boolean corretto = false;

        if ( 	elencoEsercizi.size() == 6 &&
        		elencoEsercizi.get(0).equals(e1) &&
        		elencoEsercizi.get(1).equals(e2) &&
        		elencoEsercizi.get(2).equals(e3) &&
        		elencoEsercizi.get(3).equals(e4) &&
        		elencoEsercizi.get(4).equals(e5) &&
        		elencoEsercizi.get(5).equals(e6)) {
                System.out.println("\nElenco generato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella generazione dell'elenco");

        assertEquals("Implementazione del metodo esercizi() e/o dei metodi correlati errata", true,corretto);
	}


    @SuppressWarnings("unused")
	public void testElencoEserciziPerCodice(){

        System.out.println("\n*** testElencoEserciziPerCodice() ***\n");

        Palestra p = new Palestra();
        
     	System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 170);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 100);
     	
		System.out.println("\nElenchi esercizi");
		System.out.println("\nCodice, alfabeticamente:\n");
		ArrayList<Esercizio> elenco1 = new ArrayList<>(p.elencoEserciziPerCodice());
		for(Esercizio ei : elenco1)
			System.out.println(ei.descriviti());

        boolean corretto = false;

        if ( elenco1.size() == 6 &&
        		elenco1.get(0).equals(e3) &&
        		elenco1.get(1).equals(e6) &&
        		elenco1.get(2).equals(e4) &&
        		elenco1.get(3).equals(e5) &&
        		elenco1.get(4).equals(e1) &&
        		elenco1.get(5).equals(e2) ) {
                System.out.println("\nElenco generato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella generazione dell'elenco");

        assertEquals("Implementazione del metodo elencoEserciziPerCodice() e/o dei metodi correlati errata", true,corretto);
	}


    @SuppressWarnings("unused")
	public void testElencoEserciziPerTipologia(){

        System.out.println("\n*** testElencoEserciziPerTipologia() ***\n");

        Palestra p = new Palestra();

     	System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 110);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 160);
     	
     	System.out.println("\nElenchi esercizi");
     	System.out.println("\nTipologia:\n");
		ArrayList<Esercizio> elenco1 = new ArrayList<>(p.elencoEserciziPerTipologia());
		for(Esercizio ei : elenco1)
			System.out.println(ei.descriviti());
        
        boolean corretto = false;

        if ( elenco1.size() == 6 &&
        		elenco1.get(0).equals(e1) &&
        		elenco1.get(1).equals(e3) &&
        		elenco1.get(2).equals(e6) &&
        		elenco1.get(3).equals(e2) &&
        		elenco1.get(4).equals(e4) &&
        		elenco1.get(5).equals(e5) ) {
                System.out.println("\nElenco generato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella generazione dell'elenco");

        assertEquals("Implementazione del metodo elencoEserciziPerTipologia() e/o dei metodi correlati errata", true,corretto);
	}


    @SuppressWarnings("unused")
	public void testElencoEserciziCorpoLiberoPerCalorie(){

        System.out.println("\n*** testElencoEserciziCorpoLiberoPerCalorie() ***\n");

        Palestra p = new Palestra();

     	System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("Nuovi esercizi");
     	Esercizio e1 = p.nuovoEsercizio("rpj", "Rope-Jump", 20);
     	Esercizio e2 = p.nuovoEsercizio("sqt", "Squat", 6, 170);
     	Esercizio e3 = p.nuovoEsercizio("brp", "Burpees", 10);
     	Esercizio e4 = p.nuovoEsercizio("psu", "Push-up", 55.5);
     	Esercizio e5 = p.nuovoEsercizio("pu", "Pull-up", 16.5);
     	Esercizio e6 = p.nuovoEsercizio("ddl", "Deadlift", 6, 100);
        
     	System.out.println("\nElenchi esercizi");
     	System.out.println("\nCorpo libero per calorie:\n");
		ArrayList<Esercizio> elenco1 = new ArrayList<>(p.elencoEserciziCorpoLiberoPerCalorie());
		for(Esercizio ei : elenco1)
			System.out.println(ei.descriviti());
     	
        boolean corretto = false;

        if ( elenco1.size() == 2 &&
        		elenco1.get(0).equals(e5) &&
        		elenco1.get(1).equals(e4) ) {
                System.out.println("\nElenco generato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella generazione dell'elenco");

        assertEquals("Implementazione del metodo elencoEserciziCorpoLiberoPerCalorie() e/o dei metodi correlati errata", true,corretto);      
	}
}
