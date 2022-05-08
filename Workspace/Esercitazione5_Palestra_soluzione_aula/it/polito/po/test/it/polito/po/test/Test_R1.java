package it.polito.po.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import palestra.Iscritto;
import palestra.Palestra;

public class Test_R1 extends TestCase{

    public void testNuovaIscrizione(){

        System.out.println("\n*** testNuovaIscrizione() ***\n");

        Palestra p = new Palestra();

        System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
        
		System.out.println("\nUtenti iscritti:\n");
		System.out.println(i1.descriviti());
		System.out.println(i2.descriviti());
		System.out.println(i3.descriviti());
     	
        boolean corretto = false;

        if ( i1.descriviti().equals("0 Mario Verdi Uomo 25 84.5") &&
        		i2.descriviti().equals("1 Roberto Bianchi Uomo 28 80.1") &&
        		i3.descriviti().equals("2 Maria Rossi Donna 22 57.9") ) {
                System.out.println("\nCreazione iscritti gestita in maniera corretta");   
                corretto = true;
        }
        else
                System.out.println("\nErrore nella creazione degli iscritti");

        assertEquals("Implementazione del metodo nuovaIscrizione() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
    public void testCercaIscrittoPerId(){

        System.out.println("\n*** testCercaIscrittoPerId() ***\n");

        Palestra p = new Palestra();
        
        System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
		System.out.println("\nRicerca iscritto:\n");
		Iscritto iTrovato = p.cercaIscrittoPerId(1);
		System.out.println(iTrovato.descriviti());

        boolean corretto = false;

        if ( iTrovato.equals(i2) && iTrovato != null ) {
                System.out.println("\nRicerca iscritto gestita in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca di un iscritto");

        assertEquals("Implementazione del metodo cercaIscrittoPerId() e/o dei metodi correlati errata", true,corretto);
    }


    @SuppressWarnings("unused")
    public void testCercaIscrittoPerNomeCognome(){

        System.out.println("\n*** testCercaIscrittoPerNomeCognome() ***\n");

        Palestra p = new Palestra();
        
        System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);

     	System.out.println("\nRicerca iscritto/i per nome e cognome:\n");
		ArrayList<Iscritto> iTrovatiNomeCognome = new ArrayList<>(p.cercaIscrittoPerNomeCognome("b", "i"));
		for(Iscritto ii : iTrovatiNomeCognome)
			System.out.println(ii.descriviti());
     	
        boolean corretto = false;

        if ( iTrovatiNomeCognome.size() == 1 &&
        		iTrovatiNomeCognome.get(0).equals(i2)) {
                System.out.println("\nRicerca gestita in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella ricerca per nome e cognome");

        assertEquals("Implementazione del metodo cercaIscrittoPerNomeCognome() e/o dei metodi correlati errata", true,corretto);
    }


    public void testElencoIscritti(){

        System.out.println("\n*** testElencoIscritti() ***\n");

        Palestra p = new Palestra();
        
        System.out.println("Nuove iscrizioni");
     	Iscritto i1 = p.nuovaIscrizione("Mario", "Verdi", "Uomo", 25, 84.5);
     	Iscritto i2 = p.nuovaIscrizione("Roberto", "Bianchi", "Uomo", 28, 80.1);
     	Iscritto i3 = p.nuovaIscrizione("Maria", "Rossi", "Donna", 22, 57.9);
     	
     	System.out.println("\nElenco iscritti:\n");
		ArrayList<Iscritto> elencoIscritti = new ArrayList<>(p.elencoIscritti());
		for(Iscritto ii : elencoIscritti)
			System.out.println(ii.descriviti());

        boolean corretto = false;

        if ( elencoIscritti.size() == 3 &&
        		elencoIscritti.get(0).equals(i3) &&
        		elencoIscritti.get(1).equals(i1) &&
        		elencoIscritti.get(2).equals(i2) )
        		{
                System.out.println("\nElenco generato in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella generazione dell'elenco");

        assertEquals("Implementazione del metodo elencoIscritti() e/o dei metodi correlati errata", true,corretto);
    }
	
}
