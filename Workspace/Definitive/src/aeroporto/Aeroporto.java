package aeroporto;

public class Aeroporto {
  String denominazione;
  String indirizzo;
  int numeroAerei;
  int numeroDecolli;
  int nIdentificativo = 0;
  int nTratta = 0;
  Aereo[] aerei = new Aereo[50]; 
  Tratta[] tratte = new Tratta[50];
  int m = 0;
  int mm = 0;
  int bestAereo = 0;
  int aaa = 0;
  
  public Aeroporto(String denominazione, String indirizzo, int numeroAerei) {
    this.denominazione = denominazione;
    this.indirizzo = indirizzo;
    this.numeroAerei = numeroAerei;
  }

  public String getDenominazione() {
    return denominazione;
  }

  public String getIndirizzo() {
    return indirizzo;
  }
  
  public int getNumeroAerei () {
    return numeroAerei;
  }
  
  public void setNumeroDecolli(int numeroDecolli){
    this.numeroDecolli = numeroDecolli;
  }
  
  public String descrizioneAeroporto() {
    return numeroAerei + " (" + numeroDecolli +")";
  }
  
  public int aggiungiAereo(String modello, int capienza, int chilometriAutonomia) {
    if (++aaa > 50) {return 999999;}
    boolean found = false;
    if (m == 0) {  Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia, m, found); aerei[nIdentificativo] = aereo; }
    if (m != 0) {
      for (int i = 0; i < nIdentificativo; i++) {
        if (aerei[i].modello == modello) {
          found = true;
          return i; 
        } 
      }
      if (!found) {  Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia, m, found ); aerei[nIdentificativo] = aereo; m++; return nIdentificativo++; }
    } 
    m++;
    return nIdentificativo++;
  }
  
  public String aereo(int identificativoAereo) {

    return aerei[identificativoAereo].modello + ";" + aerei[identificativoAereo].capienza + ";" + aerei[identificativoAereo].kmXTratta;
  }

  public String[] aerei() {
    String[] array = new String[nIdentificativo];
    for (int i = 0; i<nIdentificativo; i++) {
      array[i] = i + ";" + aerei[i].modello;
    }
    return array;
  }

  public String aggiungiViaggio(String nomeTratta, int numeroPasseggeri, int chilometriTratta) {

    // System.out.println("Tratta");
    // System.out.println(nomeTratta + numeroPasseggeri + chilometriTratta);
    // Tratta tratta = new Tratta(nomeTratta, numeroPasseggeri, chilometriTratta, 0 ); tratte[nTratta] = tratta;
    // System.out.println("Tratte[i]:");
    // System.out.println(tratte[nTratta].nomeT + tratte[nTratta].capienza + tratte[nTratta].kmXTratta);
    // nTratta++;

    for (int i = 0; i < nIdentificativo; i++) {
      Aereo.bubbleSortC(aerei, nIdentificativo); // sort per avere in prima posizione tra gli aerei giusti quello con meno posti
      if (aerei[i].alreadyTaken == true) {i++;} // non posso unsare lo stesso aereo
      if ( aerei[i].capienza >= numeroPasseggeri && aerei[i].kmXTratta >= chilometriTratta && aerei[i].alreadyTaken == false ) {// se passa questo, è un aereo giusto
    Tratta tratta = new Tratta(nomeTratta, numeroPasseggeri, chilometriTratta, 0 ); tratte[nTratta] = tratta;
    nTratta++;
        for (int j = 0; j < nIdentificativo; j++) {
          if ( i != j && aerei[i].capienza == aerei[j].capienza) { //controllo se altri aerei hanno stesso numero di posti
              Aereo.bubbleSortK(aerei, nIdentificativo); // se si, entro e faccio il sort dei km per avere al primo posto quello con meno km
              /* for (int k = 0; k<nIdentificativo; k++) { */
                if (aerei[i].kmXTratta == aerei[j].kmXTratta){
                  aerei[i].alreadyTaken = true;
                  tratte[nTratta-1].id = aerei[i].id;
                  return aerei[i].id + ";" + nomeTratta;
                } else {
                  aerei[i].alreadyTaken = true;
                  tratte[nTratta-1].id = aerei[i].id;
                  return aerei[i].id + ";" + nomeTratta;
                }
              /* } */
          } else if (aerei[i].capienza != aerei[j].capienza) {
              aerei[i].alreadyTaken = true;
              tratte[nTratta-1].id = aerei[i].id;
              return aerei[i].id + ";" + nomeTratta;
          }
        }
      }

      /* aerei[bestAereo].alreadyTaken = true; */
      /* return bestAereo + "; " + nomeTratta; */
    }
      /* aerei[bestAereo].alreadyTaken = true; */
      /* tratte[nTratta-1].id = aerei[bestAereo].id; */
      /* return bestAereo + "; " + nomeTratta; */
    return "Aereo not found for this viaggio/tratta!";

  }

  public String viaggio(int identificativoAereo, String nomeTratta) {
    //cicle to find everithing
    for (int i = 0; i < nTratta; i++) {
      if (tratte[i].id == identificativoAereo) {
        return identificativoAereo + ";" + nomeTratta + ";" + tratte[i].capienza + ";" + tratte[i].kmXTratta;
      }
    }
    /* return identificativoAereo + "; " + nomeTratta + "; " + tratte[nTratta].capienza + "; " + tratte[nTratta].kmXTratta; */
    return "";
  }
  
  
  public String viaggi() {
    /* Aereo.bubbleSortC(aerei, nIdentificativo); // sort per avere in prima posizione tra gli aerei giusti quello con meno posti */
    String a = ""; 
    for (int i = 0; i < nTratta; i++) { a += tratte[i].id + ";" + tratte[i].nomeT + ";" + tratte[i].capienza + ";" + tratte[i].kmXTratta + "\n"; }
    a = a.substring(0, a.length()-1) + "";
    return a;
  }

  public String viaggiPerTratta(String nomeTratta) {
    /* Aereo.bubbleSortC(aerei, nIdentificativo); // sort per avere in prima posizione tra gli aerei giusti quello con meno posti */
    String a = ""; 
    for (int i = 0; i < nTratta; i++) {
      if (nomeTratta == tratte[i].nomeT) { a += tratte[i].id + ";" + tratte[i].nomeT + ";" + tratte[i].capienza + ";" + tratte[i].kmXTratta + "\n"; }
    }
    a = a.substring(0, a.length()-1) + "";
    return a;
  }
}