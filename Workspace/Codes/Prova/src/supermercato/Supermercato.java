package supermercato;

public class Supermercato {

    // Inserire tutti gli attributi necessari, eventualmente creare altre classi
  String indirizzo = new String(); 
  double costo;
  Vendita[] vendite = new Vendita[50]; 
  int n_vendite;
  
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

    vendite[n_vendite] = v;
    n_vendite++;
  }

  /**
  * Restituisce le informazioni relative all'ultima vendita
  */  
  public String ultimaVendita() {
    return vendite[n_vendite-1].nome +", "+ vendite[n_vendite-1].Marca  +", "+ vendite[n_vendite-1].Unità +", "+  vendite[n_vendite-1].Prezzo;
  }

  /**
  * Restituisce le informazioni relative alla vendita di cui nome prodotto e marca sono passati come parametro 
  */  
  public String vendita(String n, String m) {
	int i = 0; for(i=0; i<50; i++) { if(vendite[i].nome == m || vendite[i].Marca == m) { break; } }
    return vendite[i].nome +", "+ vendite[i].Marca  +", "+ vendite[i].Unità +", "+  vendite[i].Prezzo;
  }

  /**
  * Restituisce il numero di giorni i cui costi sono coperti
  */  
  public double giorniCoperti() {
    double prezzo_tot = 0; for(int i=0; i<n_vendite; i++) { prezzo_tot =+((double)vendite[i].Unità * (double)vendite[i].Prezzo); }
    return prezzo_tot/costo;
  }
}


