package it.polito.po.test;

import polifactor.*;
import junit.framework.TestCase;

public class Global {
	private static Global self = new Global();
	public static Global get() { return self; }
	
	
	public static Stagione st;
	public static String c1;
	public static String c2;
	public static String c3;
	
	public static boolean eccezione1 = false;
	public static boolean eccezione2 = false;
	public static boolean eccezione3 = false;
	public static boolean eccezione4 = false;
	public static boolean eccezione5 = false;
	public static boolean eccezione6 = false;
	public static boolean eccezione7 = false;
	public static boolean eccezione8 = false;

	public static Puntata p1;
	public static Puntata p2;
	
	public static Brano br1;
	public static Brano br2;
	
	public static boolean[] initialized = {false, false, false, false};
	
	private static void initialize_R1() {
		
		if (!initialized[0]) {

			st = new Stagione(2);

			System.out.println("@ Registrazione nuovo concorrente\n");
			
			c1 = st.registraConcorrente("Il melodioso", "Alberto", "Rosi", "199806");

			System.out.println("@ Registrazione altri due concorrenti\n");
			
			c2 = st.registraConcorrente("Vociona", "Luisa", "Gialli", "19960129");
			c3 = st.registraConcorrente("Piano piano", "Michele", "Neri", "19760101");

			System.out.println("@ Registrazione altri concorrenti\n");
			
			st.registraConcorrente("Stonata", "Alessandra", "Azzurri", "19960129");
			st.registraConcorrente("Acuto", "Barbara", "Blu", "20000212");
			st.registraConcorrente("Suono sordo", "Giacomo", "Gialli", "19970322");
			
			initialized[0] = true;
		}
	
	}
	
	
	private static void initialize_R2() {
		
		if (!initialized[1]) {

			System.out.println("@ Creata squadra del giudice \"L. Severa\"\n");

			st.creaSquadra("Severa");

			System.out.println("@ Create altre squadre\n");

			st.creaSquadra("Attento");
			st.creaSquadra("Superficiale");
			
			System.out.println("@ Assegnazione concorrente S2C2 alla squadra del giudice \"Severa\"");
			
			try {
				st.assegnaConcorrente("Severa", "S2C2");
			} catch (EccezioneLimiteConcorrenti lce) {
				eccezione1 = true;
			} catch(EccezioneConcorrenteAssegnatoAltraSquadra cae) {
				eccezione2 = true;
			}
			
			System.out.println("\n@ Assegnazione altri tre concorrenti alla squadra \"Severa\", di cui uno inesistente");

			try {
				st.assegnaConcorrente("Severa", "S2C3");
				st.assegnaConcorrente("Severa", "S2C4");
				st.assegnaConcorrente("Severa", "S2C1000");
			} catch (EccezioneLimiteConcorrenti lce) {
				eccezione3 = true;
			} catch(EccezioneConcorrenteAssegnatoAltraSquadra cae) {
				eccezione4 = true;
			}

			System.out.println("\n@ Assegnazione ulteriore concorrente (oltre il limite) alla squadra \"Severa\"");

			try {
				st.assegnaConcorrente("Severa", "S2C5");
			} catch (EccezioneLimiteConcorrenti lce) {
				eccezione5 = true;
			} catch(EccezioneConcorrenteAssegnatoAltraSquadra cae) {
				eccezione6 = true;
			}
			
			System.out.println("\n@ Assegnazione concorrente S2C2 (gia' assegnato) alla squadra \"Superficiale\"");
			try {
				st.assegnaConcorrente("Superficiale", "S2C2");
			} catch (EccezioneLimiteConcorrenti lce) {
				eccezione7 = true;
			} catch(EccezioneConcorrenteAssegnatoAltraSquadra cae) {
				eccezione8 = true;
			}
			
			initialized[1] = true;
		}	

	}

	
	private static void initialize_R3() {
		
		if (!initialized[2]) {

			System.out.println("\n@ Definite puntata 1 del 20220115\n");

			p1 = st.nuovaPuntata(1, "20220115");

			System.out.println("@ Definite altre due puntate\n");

			st.nuovaPuntata(2, "20220122");
			st.nuovaPuntata(3, "20220205");
			st.nuovaPuntata(4, "20220112");
			st.nuovaPuntata(5, "20220119");

			initialized[2] = true;
			
			System.out.println("@ Aggiunta esibizione puntata 1 concorrente S2C2 inedito \"Una novita' assoluta\"\n");
			
			br1 = st.aggiungiEsibizionePuntata(1, "S2C2", 7000, "Una novita' assoluta");

			System.out.println("@ Aggiunta esibizione puntata 1 concorrente S2C3 cover \"Sciccheria\" 2019\n");
			
			br2 = st.aggiungiEsibizionePuntata(1, "S2C3", 9000, "Sciccheria", 2019);

			System.out.println("@ Aggiunta esibizione puntata 1 concorrente S2C1 cover \"Canzone favolosa\"\n");

			st.aggiungiEsibizionePuntata(1, "S2C1", 15000, "Canzone favolosa");
			
			System.out.println("@ Aggiunte altre tre esibizioni puntata 1\n");

			st.aggiungiEsibizionePuntata(1, "S2C4", 4000, "Canzone noiosa");
			st.aggiungiEsibizionePuntata(1, "S2C5", 6000, "Canzone orecchiabile");
			st.aggiungiEsibizionePuntata(1, "S2C6", 5000, "Canzone cosi' cosi'");

			System.out.println("@ Aggiunte esibizioni puntata 2 concorrenti non eliminati\n");
			st.aggiungiEsibizionePuntata(2, "S2C1", 15000, "Canzone favolosa");
			st.aggiungiEsibizionePuntata(2, "S2C2", 7000, "Una novita' assoluta");
			st.aggiungiEsibizionePuntata(2, "S2C3", 9000, "Sciccheria", 2019);
			st.aggiungiEsibizionePuntata(2, "S2C5", 7000, "Canzone orecchiabile");
			st.aggiungiEsibizionePuntata(2, "S2C6", 2000, "Canzone cosi' cosi'");

			System.out.println("@ Aggiunte esibizioni altre puntate concorrenti non eliminati\n");
			st.aggiungiEsibizionePuntata(3, "S2C1", 22000, "Canzone favolosa");
			st.aggiungiEsibizionePuntata(3, "S2C3", 8000, "Sciccheria", 2019);
			st.aggiungiEsibizionePuntata(3, "S2C2", 6000, "Una novita' assoluta");
			st.aggiungiEsibizionePuntata(3, "S2C5", 5000, "Canzone orecchiabile");
			
			System.out.println("@ Aggiunte esibizioni altre puntate concorrenti non eliminati\n");
			st.aggiungiEsibizionePuntata(4, "S2C3", 4000, "Sciccheria", 2019);
			st.aggiungiEsibizionePuntata(4, "S2C2", 2000, "Una novita' assoluta");
			st.aggiungiEsibizionePuntata(4, "S2C1", 18000, "Canzone favolosa");

			System.out.println("@ Aggiunte esibizioni altre puntate concorrenti non eliminati\n");
			st.aggiungiEsibizionePuntata(5, "S2C3", 20000, "Sciccheria", 2019);
			st.aggiungiEsibizionePuntata(5, "S2C1", 17000, "Canzone favolosa");

		}	

	}
	
	
	private static void initialize_R4() {

		if (!initialized[3]) {
			initialized[3] = true;
			
			// Nessuna altra inizializzazione necessaria
		}

	}
	
	
	public static void init(TestCase t) {
		
		if(t instanceof TestR1_Concorrenti) {
			if (!initialized[0]) {
				System.out.println("\n\n##########   TestR1_Concorrenti   ##########\n");
			}
			initialize_R1();
		}

		
		if(t instanceof TestR2_Squadre) {
			if (!initialized[1]) {
				System.out.println("\n\n##########   TestR2_Squadre   ##########\n");
			}
			initialize_R1();
			initialize_R2();			
		}
		
		
		if(t instanceof TestR3_PuntateBraniEsibizioni) {
			if (!initialized[2]) {
				System.out.println("\n\n##########   TestR3_PuntateBraniEsibizioni   ##########\n");	
			}
			initialize_R1();
			initialize_R2();
			initialize_R3();
		}
		
		if(t instanceof TestR4_EliminatiVincitori) {
			if (!initialized[3]) {
				System.out.println("\n\n##########   TestR4_EliminatiVincitori   ##########\n");	
			}
			initialize_R1();
			initialize_R2();
			initialize_R3();
			initialize_R4();
		}
		 
	}

}
