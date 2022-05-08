package it.polito.po.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import palestra.Esercizio;
import palestra.Iscritto;
import palestra.Palestra;
import palestra.SchedaAllenamento;
import palestra.SchedaNonEsistenteException;
import palestra.UtenteNonEsistenteException;

public class Test_R3 extends TestCase{
	
	
    @SuppressWarnings("unused")
	public void testNuovaSchedaAllenamento(){

        System.out.println("\n*** testNuovaSchedaAllenamento() ***\n");

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
		
		System.out.println("Nuove schede");
		ArrayList<String> eserciziScheda1 = new ArrayList<>();
		eserciziScheda1.add("sqt");
		eserciziScheda1.add("psu");
		SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
		
		System.out.println("\nScheda creata:\n");
		ArrayList<Esercizio> ee = new ArrayList<>(p.eserciziScheda(s1.getCodice()));
		for(Esercizio ei : ee)
			System.out.println(ei.descriviti());

        boolean corretto = false;

        if (ee.size() == 2 && ee.get(0).equals(e2) && ee.get(1).equals(e4)) {
        	
                System.out.println("\nScheda creata in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella creazione della scheda");

        assertEquals("Implementazione del metodo nuovaSchedaAllenamento() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
	public void testNuovaSchedaAllenamentoGiaEsistente(){

        System.out.println("\n*** testNuovaSchedaAllenamentoGiaEsistente() ***\n");

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
     	
     	System.out.println("Nuove schede");
     	ArrayList<String> eserciziScheda1 = new ArrayList<>();
     	eserciziScheda1.add("sqt");
     	eserciziScheda1.add("psu");
     	SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
		
		System.out.println("\nAggiunta esercizi");
		eserciziScheda1.add("ddl");
		eserciziScheda1.add("pu");
		p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
		
		System.out.println("\nScheda creata:\n");
		ArrayList<Esercizio> ee = new ArrayList<>(p.eserciziScheda(s1.getCodice()));
		for(Esercizio ei : ee)
			System.out.println(ei.descriviti());

        boolean corretto = false;

        if ( ee.size() == 4 && ee.get(0).equals(e2) && ee.get(1).equals(e4) && ee.get(2).equals(e6) && ee.get(3).equals(e5) ) {
                System.out.println("\nScheda creata in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella creazione della scheda");

        assertEquals("Implementazione del metodo nuovaSchedaAllenamento() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
    public void testCercaSchedaPerId(){

        System.out.println("\n*** testCercaSchedaPerId() ***\n");

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
     	
     	System.out.println("Nuove schede");
     	ArrayList<String> eserciziScheda1 = new ArrayList<>();
     	eserciziScheda1.add("sqt");
     	eserciziScheda1.add("psu");
     	SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
     	
		System.out.println("\nRicerca scheda:\n");
		SchedaAllenamento sTrovata = null;
		try {
			sTrovata = p.cercaSchedaPerId("2021/12/03_0");
			for(Esercizio ei : p.eserciziScheda(sTrovata.getCodice()))
				System.out.println(ei.descriviti());
		} catch (SchedaNonEsistenteException e) {
			e.printStackTrace();
		}

        boolean corretto = false;

        if ( sTrovata!= null && sTrovata.equals(s1) ) {
                System.out.println("\nScheda cercata in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca della scheda");

        assertEquals("Implementazione del metodo cercaSchedaPerId() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
    public void testCercaSchedaPerIdException(){

        System.out.println("\n*** testCercaSchedaPerIdException() ***\n");

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
     	
     	System.out.println("Nuove schede");
     	ArrayList<String> eserciziScheda1 = new ArrayList<>();
     	eserciziScheda1.add("sqt");
     	eserciziScheda1.add("psu");
     	SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
     	
		System.out.println("\nRicerca scheda:\n");
		SchedaAllenamento sTrovata = null;
		boolean eccezionelanciata = false;
		try {
			sTrovata = p.cercaSchedaPerId("2021/12/03_2");
			for(Esercizio ei : p.eserciziScheda(sTrovata.getCodice()))
				System.out.println(ei.descriviti());
		} catch (SchedaNonEsistenteException e) {
			e.printStackTrace();
			eccezionelanciata = true;
		}

        boolean corretto = false;

        if ( eccezionelanciata ) {
                System.out.println("\nScheda cercata in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca della scheda");

        assertEquals("Implementazione del metodo cercaSchedaPerId() e/o dei metodi correlati errata", true,corretto);
    }
    

    @SuppressWarnings("unused")
    public void testElencoSchedePerIdIscritto(){

        System.out.println("\n*** testElencoSchedePerIdIscritto() ***\n");

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
     	
     	System.out.println("Nuove schede");
     	ArrayList<String> eserciziScheda1 = new ArrayList<>();
     	eserciziScheda1.add("sqt");
     	eserciziScheda1.add("psu");
     	SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
     	
     	ArrayList<String> eserciziScheda2 = new ArrayList<>();
     	eserciziScheda2.add("pu");
     	eserciziScheda2.add("rpj");
     	SchedaAllenamento s2 = p.nuovaSchedaAllenamento(0, "2022/01/15", eserciziScheda2);
     	
		System.out.println("\nElenco schede per iscritto\n");
		ArrayList<SchedaAllenamento> schedeTrovate = null;
		try {
			schedeTrovate = new ArrayList<>(p.elencoSchedePerIdIscritto(0));
			for (SchedaAllenamento si : schedeTrovate) {
				System.out.println("\nScheda:" + si.getCodice());
				for(Esercizio ei : p.eserciziScheda(si.getCodice()))
					System.out.println(ei.descriviti());
			}
		} catch (UtenteNonEsistenteException e) {
			e.printStackTrace();
		}
        
        boolean corretto = false;

        if ( schedeTrovate.size() == 2 && schedeTrovate.get(0).equals(s1) && schedeTrovate.get(1).equals(s2) ) {
                System.out.println("\nSchede cercate in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca delle schede");

        assertEquals("Implementazione del metodo elencoSchedePerIdIscritto() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
    public void testElencoSchedePerIdIscrittoException(){

        System.out.println("\n*** testElencoSchedePerIdIscrittoException() ***\n");

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
     	
     	System.out.println("Nuove schede");
     	ArrayList<String> eserciziScheda1 = new ArrayList<>();
     	eserciziScheda1.add("sqt");
     	eserciziScheda1.add("psu");
     	SchedaAllenamento s1 = p.nuovaSchedaAllenamento(0, "2021/12/03", eserciziScheda1);
     	
     	ArrayList<String> eserciziScheda2 = new ArrayList<>();
     	eserciziScheda2.add("pu");
     	eserciziScheda2.add("rpj");
     	SchedaAllenamento s2 = p.nuovaSchedaAllenamento(0, "2022/01/15", eserciziScheda2);
     	
		System.out.println("\nElenco schede per iscritto\n");
		ArrayList<SchedaAllenamento> schedeTrovate = null;
		boolean eccezioneLanciata = false;
		try {
			schedeTrovate = new ArrayList<>(p.elencoSchedePerIdIscritto(5));
			for (SchedaAllenamento si : schedeTrovate) {
				System.out.println("\nScheda:" + si.getCodice());
				for(Esercizio ei : p.eserciziScheda(si.getCodice()))
					System.out.println(ei.descriviti());
			}
		} catch (UtenteNonEsistenteException e) {
			e.printStackTrace();
			eccezioneLanciata = true;
		}

        boolean corretto = false;

        if ( eccezioneLanciata ) {
                System.out.println("\nSchede cercate in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca delle schede");

        assertEquals("Implementazione del metodo elencoSchedePerIdIscritto() e/o dei metodi correlati errata", true,corretto);       
    }
}
