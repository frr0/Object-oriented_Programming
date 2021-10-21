package basic;
//classes have no main
//identità circa address
//creazione de inizializzazione dell'oggetto è tramite il costruttote automobile
//è un metodo, il metodo costruttore
//Costruttore di default (o vuoto, perchè senza parametri)
//se non c'è, esiste implicitamente e inizializza gli attributi a 0 o null


public class Automobile {

	public String targa;
	public String marca;
	public String modello;
	public int cilindrata;
	private boolean accesa;
	//private basically hide the variable, noone will ever see it
	//only Automobile knows about accesa
	
// Metodi (funzioni) riferiti alla classe 

	// Metodo Costruttore
	public Automobile(){ // posso sovrascrive il costruttore se ho un qualcosa che voglio sempre (se sono Audi, ovviamente faccio solo auto marca Audi)
		targa = "Non assegnata";
		marca = "Audi";
		modello = "da definire";
		cilindrata = -1;
		accesa = false;
		// this is what a costruttore fa di default
	}
	
	// public Automobile(){
	//     targa = t;
	//     marca = "Audi"
	// }

	public void accendi (){
		accesa = true;
	}

	void vendi (){
		//stuff
	}

	void spegni (){
		accesa = false;
	}

	public boolean dimmiSeSeiAccesa(){
		return accesa;
	}
}