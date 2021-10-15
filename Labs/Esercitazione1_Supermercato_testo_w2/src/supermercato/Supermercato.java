package supermercato;

public class Supermercato {

    // Inserire tutti gli attributi necessari, eventualmente creare altre classi
	String indirizzo = new String(); 
	//String costo = new String(); 
	double costo;
	Vendita v = new Vendita();
	
	/**
	* Crea un nuovo Supermercato (costruttore)
	*/
	public Supermercato() {

	}
	

	/**
	* Imposta l'indirizzo del supermercato
	*/
	public void setIndirizzo(String i) {
		indirizzo = i;
	}

	/**
	* Restituisce l'indirizzo del supermercato
	*/
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	* Imposta il costo giornaliero del supermercato
	*/
	public void setCostoGiornaliero(double s) {
		costo = s;
	}

	/**
	* Restituisce il costo giornaliero del supermercato
	*/
	public double getCostoGiornaliero() {
		return costo;
	}

	/**
	* Gestisce la vendita di un prodotto del supermercato
	*/  
	public void nuovaVendita(String n, String m, int u, double p) {
		Vendita v = new Vendita();
		v.nome = n;
		v.Marca = m;
		v.Unità = u;
		v.Prezzo = p;
	}

	/**
	* Restituisce le informazioni relative all'ultima vendita
	*/  
	public String ultimaVendita() {
		return v.nome + ", " + v.Marca + ", " + v.Unità + ", " + v.Prezzo;
	}

	/**
	* Restituisce le informazioni relative alla vendita di cui nome prodotto e marca sono passati come parametro 
	*/  
	public String vendita(String n, String m) {
		return v.nome + ", " + v.Marca + ", " + v.Unità + ", " + v.Prezzo;
	}

	/**
	* Restituisce il numero di giorni i cui costi sono coperti
	*/  
	public double giorniCoperti() {
		return (50 * (v.Unità * v.Prezzo))/costo;
		
	}

}
