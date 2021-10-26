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
		Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia);
		aerei[nIdentificativo] = aereo;
		for (int i = 0; i < numeroAerei; i++) {
			if (aerei[i].modello == modello) {
				return i; 
			}
		}
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
      if ( aerei[i].capienza > numeroPasseggeri && aerei[i].kmXTratta > chilometriTratta ) {
        if (aerei[i].capienza < aerei[bestAereo].capienza) {
          bestAereo = i;
        } else if (aerei[i].capienza == aerei[bestAereo].capienza) {
            if (aerei[i].kmXTratta < aerei[bestAereo].kmXTratta) {
              bestAereo = i;
            } else if (aerei[i].kmXTratta == aerei[bestAereo].kmXTratta) {
                return bestAereo + "; " + nomeTratta;
            }
        }
      }
		}
		return bestAereo + "; " + nomeTratta;
	}

	public String viaggio(int identificativoAereo, String nomeTratta) {
		return identificativoAereo + "; " + nomeTratta + "; " + tratte[identificativoAereo].capienza + "; " + tratte[identificativoAereo].kmXTratta;
	}
	
	
	public String viaggi() {
    for (int i = 0; i < nTratta; i++) {
      return i + "; " + tratte[i].nomeT + "; " + tratte[i].capienza + "; " + tratte[i].kmXTratta;
      /* break; */
    }
    return null;
	}

	public String viaggiPerTratta(String nomeTratta) {
    for (int i = 0; i < nTratta; i++) {
      if (nomeTratta == tratte[i].nomeT) {
        return i + "; " + tratte[i].nomeT + "; " + tratte[i].capienza + "; " + tratte[i].kmXTratta;
      }
    }
		return null;
	}
}

