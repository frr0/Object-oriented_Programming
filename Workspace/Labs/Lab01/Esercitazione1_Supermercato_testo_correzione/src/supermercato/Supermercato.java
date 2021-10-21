package supermercato;

public class Supermercato {

    // Inserire tutti gli attributi necessari, eventualmente creare altre classi
  String indirizzo = new String(); 
  double costoGiornaliero;

  public Supermercato(String indirizzo, double costoGiornaliero, Vendita[] vendite, int n_vendite) {
    this.indirizzo = indirizzo;
    this.costoGiornaliero = costoGiornaliero;
    this.vendite = vendite;
    this.n_vendite = n_vendite;
  }

  Vendita[] vendite = new Vendita[50]; 
  int n_vendite;
  
  /**
  * Crea un nuovo Supermercato (costruttore)
  */
  public Supermercato() {
    // buona norma inizializzare attributi
    indirizzo = "";
    costoGiornaliero = 0;
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
    costoGiornaliero = s;
  }

  /**
  * Restituisce il costo giornaliero del supermercato
  */
  public double getCostoGiornaliero() {
    return costoGiornaliero;
  }

  /**
  * Gestisce la vendita di un prodotto del supermercato
  */  
  public void nuovaVendita(String n, String m, int u, double p) {
    Vendita v = new Vendita();
    v.nome = n;
    v.Marca = m;
    v.Unita = u;
    v.Prezzo = p;

    vendite[n_vendite] = v;
    n_vendite++;
  }

  /**
  * Restituisce le informazioni relative all'ultima vendita
  */  
  public String ultimaVendita() {
    return vendite[n_vendite-1].nome +", "+ vendite[n_vendite-1].Marca  +", "+ vendite[n_vendite-1].Unita +", "+  vendite[n_vendite-1].Prezzo;
  }

  /**
  * Restituisce le informazioni relative alla vendita di cui nome prodotto e marca sono passati come parametro 
  */  
  public String vendita(String n, String m) {
	int i = 0; for(i=0; i<50; i++) { if(vendite[i].nome == m || vendite[i].Marca == m) { break; } }
    return vendite[i].nome +", "+ vendite[i].Marca  +", "+ vendite[i].Unita +", "+  vendite[i].Prezzo;
  }

  /**
  * Restituisce il numero di giorni i cui costi sono coperti
  */  
  public double giorniCoperti() {
    double prezzo_tot = 0; for(int i=0; i<n_vendite; i++) { 
    	prezzo_tot +=(vendite[i].Unita * vendite[i].Prezzo); 
      System.out.println(vendite[i].Unita);
      System.out.println(vendite[i].Prezzo);
    }
    System.out.println(n_vendite);
    System.out.println(prezzo_tot);
    System.out.println(costoGiornaliero);
    return prezzo_tot/costoGiornaliero;
  }
}


