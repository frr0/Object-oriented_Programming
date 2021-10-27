package aeroporto;

public class Aeroporto {
  String denominazione;
  String indirizzo;
  int numeroAerei;
  int numeroDecolli;
  int nIdentificativo = 0;
  int nTratta = 0;
  Aereo[] aerei = new Aereo[50]; 
  Tratta[] tratte = new Tratta[500];
  int m = 0;
  
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
    if (m == 0) {  Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia); aerei[nIdentificativo] = aereo; }
    if (m != 0) {
      for (int i = 0; i < numeroAerei; i++) {
        if (aerei[i].modello == modello) {
          return i; 
        } else {  Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia); aerei[nIdentificativo] = aereo; m++; }
      }
    } m++;
    return nIdentificativo++;
  }
  
  public String aereo(int identificativoAereo) {

    return aerei[identificativoAereo].modello + ";" + aerei[identificativoAereo].capienza + ";" + aerei[identificativoAereo].kmXTratta;
  }

  public String[] aerei() {
    String[] array = new String[nIdentificativo];
    for (int i = 0; i<nIdentificativo; i++) {
      array[i] = i + "; " + aerei[i].modello;
    }
    return array;
  }

  public String aggiungiViaggio(String nomeTratta, int numeroPasseggeri, int chilometriTratta) {
    int bestAereo = 0;

    Tratta tratta = new Tratta(nomeTratta, numeroPasseggeri, chilometriTratta);
    tratte[nTratta] = tratta;
    nTratta++;

    for (int i = 0; i < nIdentificativo; i++) {
      if ( aerei[i].capienza > numeroPasseggeri && aerei[i].kmXTratta > chilometriTratta && aerei[i].alreadyTaken == false ) {
        if (aerei[i].capienza < aerei[bestAereo].capienza) {
          bestAereo = i;
        } else if (aerei[i].capienza == aerei[bestAereo].capienza) {
            if (aerei[i].kmXTratta < aerei[bestAereo].kmXTratta) {
              bestAereo = i;
            } else if (aerei[i].kmXTratta == aerei[bestAereo].kmXTratta) {
                aerei[bestAereo].alreadyTaken = true;
                return bestAereo + "; " + nomeTratta;
            }
        }
      }
    }
    aerei[bestAereo].alreadyTaken = true;
    return bestAereo + "; " + nomeTratta;
  }

  public String viaggio(int identificativoAereo, String nomeTratta) {
    return identificativoAereo + "; " + nomeTratta + "; " + tratte[identificativoAereo].capienza + "; " + tratte[identificativoAereo].kmXTratta;
  }
  
  
  public String viaggi() {
    String a = ""; 
    for (int i = 0; i < nTratta; i++) { a += i + "; " + tratte[i].nomeT + "; " + tratte[i].capienza + "; " + tratte[i].kmXTratta + "\n"; }
    return a;
  }

  public String viaggiPerTratta(String nomeTratta) {
    String a = ""; 
    for (int i = 0; i < nTratta; i++) {
      if (nomeTratta == tratte[i].nomeT) { a += i + "; " + tratte[i].nomeT + "; " + tratte[i].capienza + "; " + tratte[i].kmXTratta + "\n"; }
        /* return i + "; " + tratte[i].nomeT + "; " + tratte[i].capienza + "; " + tratte[i].kmXTratta; */
    }
    return a;
  }
}

