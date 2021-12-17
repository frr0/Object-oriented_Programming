package it.polito.po.test;

import junit.framework.TestCase;
import serviziospedizioni.Collo;
import serviziospedizioni.Corriere;
import serviziospedizioni.Prioritario;
import serviziospedizioni.ServizioSpedizioni;
import serviziospedizioni.Standard;

public class Test_R2 extends TestCase{

	@SuppressWarnings("unused")
	public void testCreaColloStandard(){
		
		System.out.println("\n*** testCreaColloStandard() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Asti", "2021/11/19", "Via Passo Buole 22", "Via dei Fraschei 17");

		System.out.println("Informazioni sul collo creato.\n");
		System.out.println("Codice: " + col1.getCodiceCollo());
		System.out.println("Citta': " + col1.getCitta());
		System.out.println("Data di deposito': " + col1.getDataDeposito());
		System.out.println("Indirizzo mittente: " + col1.getIndirizzoMittente());
		System.out.println("Indirizzo destinatario: " + col1.getIndirizzoDestinatario());
		if (col1 instanceof Standard) {
			System.out.println("Tipologia: Standard");
		}
		else {
			System.out.println("Tipologia: Prioritario");
			System.out.println("Mail mittente: " + ((Prioritario)col1).getMailMittente());
		}
		
		boolean corretto = false;
		
		if (	col1 instanceof Standard &&
				col1.getCodiceCollo().equals("AS_1")	&& 
				col1.getCitta().equals("Asti") && 
				col1.getDataDeposito().equals("2021/11/19") &&
				col1.getIndirizzoMittente().equals("Via Passo Buole 22") &&
				col1.getIndirizzoDestinatario().equals("Via dei Fraschei 17")) {
			System.out.println("\nCollo creato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione del collo");

		assertEquals("Implementazione del metodo creaCollo() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCreaColloPrioritario(){
		
		System.out.println("\n*** testCreaColloStandard() ***\n");
		
		ServizioSpedizioni s = new ServizioSpedizioni();
		
		System.out.println("Registrazione di corrieri\n");
		Corriere c1 = s.registraCorriere("Mario", "Rossi", 35, "Torino");
		Corriere c2 = s.registraCorriere("Mario", "Rossi", 26, "Asti");
		Corriere c3 = s.registraCorriere("Paolo", "Verdi", 31, "Vercelli");
		Corriere c4 = s.registraCorriere("Angela", "Bianchi", 40, "Torino");
		
		System.out.println("Creazione di colli\n");
		Collo col1 = s.creaCollo("Torino", "2021/11/27", "Via Avogadro 31", "Via Amendola 2", "fabio.garcea@polito.it");

		System.out.println("Informazioni sul collo creato.\n");
		System.out.println("Codice: " + col1.getCodiceCollo());
		System.out.println("Citta': " + col1.getCitta());
		System.out.println("Data di deposito': " + col1.getDataDeposito());
		System.out.println("Indirizzo mittente: " + col1.getIndirizzoMittente());
		System.out.println("Indirizzo destinatario: " + col1.getIndirizzoDestinatario());
		if (col1 instanceof Standard) {
			System.out.println("Tipologia: Standard");
		}
		else {
			System.out.println("Tipologia: Prioritario");
			System.out.println("Mail mittente: " + ((Prioritario)col1).getMailMittente());
		}
		
		boolean corretto = false;
		
		if (	col1 instanceof Prioritario &&
				col1.getCodiceCollo().equals("TO_1")	&& 
				col1.getCitta().equals("Torino") && 
				col1.getDataDeposito().equals("2021/11/27") &&
				col1.getIndirizzoMittente().equals("Via Avogadro 31") &&
				col1.getIndirizzoDestinatario().equals("Via Amendola 2") &&
				((Prioritario)col1).getMailMittente().equals("fabio.garcea@polito.it")) {
			System.out.println("\nCollo creato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella creazione del collo");

		assertEquals("Implementazione del metodo creaCollo() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testColloDescriviti(){
		
		System.out.println("\n*** testColloDescriviti() ***\n");
		
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
		
		Collo[] cc = {col1, col2, col3, col4};
		String[] results = new String[4];
		int i = 0;
		
		System.out.println("Colli creati\n");
		for (Collo ci : cc) {
			if (ci instanceof Standard) {
				results[i] = ((Standard)ci).descriviti();
				System.out.println(results[i++]);
			}
			else {
				results[i] = ((Prioritario)ci).descriviti();
				System.out.println(results[i++]);
			}
		}
		
		boolean corretto = false;
		
		if ( 	results[0].equals("AS_1 Asti 2021/11/19 Via Passo Buole 22 Via dei Fraschei 17") && 
				results[1].equals("TO_1 Torino 2021/11/27 Via Avogadro 31 Via Amendola 2 fabio.garcea@polito.it")) {
			System.out.println("\nCollo descritto in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella descrizione del collo");

		assertEquals("Implementazione del metodo descriviti() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCercaCollo(){
		
		System.out.println("\n*** testCercaCollo() ***\n");
		
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
		
		System.out.println("Ricerca del collo con codice TO_1");
		Collo colTrovato = s.cercaCollo("TO_1");

		System.out.println("Informazioni sul collo trovato.\n");
		System.out.println("Codice: " + colTrovato.getCodiceCollo());
		System.out.println("Citta': " + colTrovato.getCitta());
		System.out.println("Data di deposito': " + colTrovato.getDataDeposito());
		System.out.println("Indirizzo mittente: " + colTrovato.getIndirizzoMittente());
		System.out.println("Indirizzo destinatario: " + colTrovato.getIndirizzoDestinatario());
		if (colTrovato instanceof Standard) {
			System.out.println("Tipologia: Standard");
		}
		else {
			System.out.println("Tipologia: Prioritario");
			System.out.println("Mail mittente: " + ((Prioritario)colTrovato).getMailMittente());
		}
		
		boolean corretto = false;
		
		if ( colTrovato.equals(col2) ) {
			System.out.println("\nCollo cercato in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca del collo");

		assertEquals("Implementazione del metodo cercaCollo() e/o dei metodi correlati errata", true,corretto);
	}
	
	@SuppressWarnings("unused")
	public void testCercaColli(){
		
		System.out.println("\n*** testCercaColli() ***\n");
		
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
		
		System.out.println("Ricerca dei colli registrati");
		Collo[] cc = s.cercaColli();
		
		for (Collo ci : cc) {
			if (ci instanceof Standard) {
				System.out.println(((Standard)ci).descriviti());
			}
			else {
				System.out.println(((Prioritario)ci).descriviti());
			}
		}
		
		boolean corretto = false;
		
		if ( 	cc.length == 4 &&
				cc[0].equals(col1) &&
				cc[1].equals(col2) &&
				cc[2].equals(col3) &&
				cc[3].equals(col4)) {
			System.out.println("\nColli cercati in maniera corretta");
			corretto = true;
		}
		else
			System.out.println("\nErrore nella ricerca dei colli");

		assertEquals("Implementazione del metodo cercaColli() e/o dei metodi correlati errata", true,corretto);
	}
	
}
