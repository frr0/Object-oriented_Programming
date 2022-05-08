package it.polito.po.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;
import palestra.Esercizio;
import palestra.Iscritto;
import palestra.Palestra;

public class Test_R4 extends TestCase{
	
	private static String writeFile(String content) throws IOException {          
	    File f = File.createTempFile("dati","txt");
	    FileOutputStream fos = new FileOutputStream(f);
	    fos.write(content.getBytes());
	    fos.close();
	    return f.getAbsolutePath();
	}
	
    public void testLeggiDatiPalestraFile() throws IOException{

        System.out.println("\n*** testLeggiDatiPalestraFile() ***\n");
        
        System.out.println("Lettura file in input.");
		
	    String stringa = "I;Mario;Rossi;Uomo;75;63\n"
	    		+ "I;Andrea;Bianchi;Uomo;69;55\n"
	    		+ "C;rpj;Rope-Jump;20\n"
	    		+ "C;brp;Burpees;10\n"
	    		+ "W;ddl;Deadlift;6;150\n"
	    		+ "W;sqt;Squat;6;120\n"
	    		+ "P;psu;Push-up;24.5\n"
	    		+ "P;pu;Pull-up;34.5";
	    
	  	String file = writeFile(stringa);

        Palestra p = new Palestra();
        
        System.out.println("\nLettura da file:\n");
		
		p.leggiDatiPalestra(file);
		
		System.out.println("\nElenco iscritti:\n");
		ArrayList<Iscritto> elencoIscritti = new ArrayList<>(p.elencoIscritti());
		for(Iscritto ii : elencoIscritti)
			System.out.println(ii.descriviti());
		
		System.out.println("\nElenco esercizi:\n");
		ArrayList<Esercizio> elencoEsercizi = new ArrayList<>(p.esercizi());
		for(Esercizio ei : elencoEsercizi)
			System.out.println(ei.descriviti());

        boolean corretto = false;

        if ( elencoIscritti.size() == 2 &&
        		elencoIscritti.get(0).descriviti().equals("1 Andrea Bianchi Uomo 69 55.0") &&
        		elencoIscritti.get(1).descriviti().equals("0 Mario Rossi Uomo 75 63.0") &&
        		elencoEsercizi.size() == 6 && 
        		elencoEsercizi.get(0).descriviti().equals("rpj Rope-Jump CAR 20") &&
        		elencoEsercizi.get(1).descriviti().equals("brp Burpees CAR 10") &&
        		elencoEsercizi.get(2).descriviti().equals("ddl Deadlift WGT 6 150") &&
        		elencoEsercizi.get(3).descriviti().equals("sqt Squat WGT 6 120") &&
        		elencoEsercizi.get(4).descriviti().equals("psu Push-up CPL 24.5") &&
        		elencoEsercizi.get(5).descriviti().equals("pu Pull-up CPL 34.5")
        		) {
                System.out.println("\nFile letto in maniera corretta");
                corretto = true;
        }
        else
                System.out.println("\nErrore nella lettura da file");

        assertEquals("Implementazione del metodo leggiDatiPalestraFile() e/o dei metodi correlati errata", true,corretto);
    }
    
}
