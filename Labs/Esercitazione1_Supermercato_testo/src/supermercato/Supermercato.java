package supermercato;

public class Supermercato {

    // Inserire tutti gli attributi necessari, eventualmente creare altre classi
	String indirizzo = new String(); 
	String costo = new String(); 
	
	/**
	* Crea un nuovo Supermercato (costruttore)
	*/
	public Supermercato() {
	}
	

	/**
	* Imposta l'indirizzo del supermercato
	*/
	public void setIndirizzo(String i) {
	}

	/**
	* Restituisce l'indirizzo del supermercato
	*/
	public String getIndirizzo() {
		return null;
	}

	/**
	* Imposta il costo giornaliero del supermercato
	*/
	public void setCostoGiornaliero(double s) {
	}

	/**
	* Restituisce il costo giornaliero del supermercato
	*/
	public double getCostoGiornaliero() {
		return -1.0;
	}

	/**
	* Gestisce la vendita di un prodotto del supermercato
	*/  
	public void nuovaVendita(String n, String m, int u, double p) {
	}

	/**
	* Restituisce le informazioni relative all'ultima vendita
	*/  
	public String ultimaVendita() {
		return null;
	}

	/**
	* Restituisce le informazioni relative alla vendita di cui nome prodotto e marca sono passati come parametro 
	*/  
	public String vendita(String n, String m) {
		return null;
	}

	/**
	* Restituisce il numero di giorni i cui costi sono coperti
	*/  
	public double giorniCoperti() {
		return -1.0;
		
	}

}
