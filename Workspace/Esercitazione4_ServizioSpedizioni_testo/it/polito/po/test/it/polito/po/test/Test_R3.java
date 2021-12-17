package it.polito.po.test;

import junit.framework.TestCase;
import serviziospedizioni.Collo;
import serviziospedizioni.Corriere;
import serviziospedizioni.ServizioSpedizioni;
import serviziospedizioni.Spedizione;

public class Test_R3 extends TestCase{
	
	@SuppressWarnings("unused")
	public void testCreaSpedizione(){
		
		System.out.println("\n*** testCreaSpedizione() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/06");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("AS_1", "Asti", "2021/12/10");

		System.out.println("Spedizioni create\n");
		System.out.println(sp1.descriviti());
		System.out.println(sp2.descriviti());
		System.out.println(sp3.descriviti());
		System.out.println(sp4.descriviti());
		
		boolean corretto = false;
		
		if (	sp1.descriviti().equals("P_TO_1 MARO35TO TO_1 2021/12/06") && 
				sp2.descriviti().equals("S_TO_1 MARO35TO TO_2 2021/12/05") && 
				sp3.descriviti().equals("S_TO_2 ANBI40TO TO_3 2021/12/05") &&
				sp4.descriviti().equals("S_AS_3 MARO26AS AS_1 2021/12/10")	) {
			System.out.println("\nSpedizioni create in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione delle spedizioni");

		assertEquals("Implementazione del metodo creaSpedizione(), descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCreaSpedizioneCorrieriImpegnati(){
		
		System.out.println("\n*** testCreaSpedizioneCorrieriImpegnati() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		Collo col5 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col6 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col7 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		Collo col8 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/05");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("TO_4", "Torino", "2021/12/05");
		Spedizione sp5 = s.creaSpedizione("TO_5", "Torino", "2021/12/05");
		Spedizione sp6 = s.creaSpedizione("TO_6", "Torino", "2021/12/05");
		Spedizione sp7 = s.creaSpedizione("TO_7", "Torino", "2021/12/05");

		System.out.println("Spedizioni create\n");
		System.out.println(sp1.descriviti());
		System.out.println(sp2.descriviti());
		System.out.println(sp3.descriviti());
		System.out.println(sp4.descriviti());
		System.out.println(sp5.descriviti());
		System.out.println(sp6.descriviti());
		
		if (sp7 != null)
			System.out.println(sp7.descriviti());
		
		boolean corretto = false;
		
		if (	sp1.descriviti().equals("P_TO_1 MARO35TO TO_1 2021/12/05") && 
				sp2.descriviti().equals("S_TO_1 ANBI40TO TO_2 2021/12/05") && 
				sp3.descriviti().equals("S_TO_2 MARO35TO TO_3 2021/12/05") &&
				sp4.descriviti().equals("P_TO_2 ANBI40TO TO_4 2021/12/05") &&
				sp5.descriviti().equals("S_TO_3 MARO35TO TO_5 2021/12/05") &&
				sp6.descriviti().equals("S_TO_4 ANBI40TO TO_6 2021/12/05") &&
				sp7 == null) {
			System.out.println("\nSpedizioni create in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione delle spedizioni");

		assertEquals("Implementazione del metodo creaSpedizione(), descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	
	@SuppressWarnings("unused")
	public void testCercaSpedizione(){
		
		System.out.println("\n*** testCercaSpedizione() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/06");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("AS_1", "Asti", "2021/12/10");

		System.out.println("Spedizioni create\n");
		System.out.println(sp1.descriviti());
		System.out.println(sp2.descriviti());
		System.out.println(sp3.descriviti());
		System.out.println(sp4.descriviti());
		
		System.out.println("Ricerca spedizione\n");
		Spedizione sc = s.cercaSpedizione("S_TO_2");
		
		boolean corretto = false;
		
		if (sc.equals(sp3)){
			System.out.println("\nSpedizione cercata in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle spedizioni");

		assertEquals("Implementazione del metodo cercaSpedizione() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCercaSpedizioni(){
		
		System.out.println("\n*** testCercaSpedizioni() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");
		Collo col2 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");
		Collo col3 = s.creaCollo("Torino", "2021/11/25", "Via Roma 16", "Via Allende 5");
		Collo col4 = s.creaCollo("Torino", "2021/11/20", "Via S. Agostino 23", "Via Einaudo 60");
		
		System.out.println("Creazione di spedizioni\n");
		Spedizione sp1 = s.creaSpedizione("TO_1", "Torino", "2021/12/06");
		Spedizione sp2 = s.creaSpedizione("TO_2", "Torino", "2021/12/05");
		Spedizione sp3 = s.creaSpedizione("TO_3", "Torino", "2021/12/05");
		Spedizione sp4 = s.creaSpedizione("AS_1", "Asti", "2021/12/10");

		System.out.println("Spedizioni create\n");
		System.out.println(sp1.descriviti());
		System.out.println(sp2.descriviti());
		System.out.println(sp3.descriviti());
		System.out.println(sp4.descriviti());
		
		System.out.println("Ricerca spedizione\n");
		Spedizione[] ss = s.cercaSpedizioni();
		
		System.out.println("Spedizioni trovate\n");
		for (Spedizione si : ss) {
			System.out.println(si.descriviti());
		}
		
		boolean corretto = false;
		
		if (	ss.length == 4 && ss[0].equals(sp1) &&
				ss[1].equals(sp2) &&
				ss[2].equals(sp3) &&
				ss[3].equals(sp4)){
			System.out.println("\nSpedizioni cercate in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca delle spedizioni");

		assertEquals("Implementazione del metodo cercaSpedizioni() e/o dei metodi correlati errata", true,corretto);
	}
}
