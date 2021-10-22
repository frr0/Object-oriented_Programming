package aeroporto;

public class Aeroporto {
	String denominazione;
	String indirizzo;
	int numeroAerei;
	int numeroDecolli;
	int nIdentificativo = 0;
	Aereo[] aerei = new Aereo[50]; 
	
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
		for (int i = 0; i < numeroAerei; i++) {
			if (aerei[i].modello == modello) {
				return i; 
			}
		}
		Aereo aereo = new Aereo(modello, capienza, chilometriAutonomia);
		aerei[nIdentificativo] = aereo;
		return nIdentificativo++;
	}
	
	public String aereo(int identificativoAereo) {

		return identificativoAereo + ";" + aerei[identificativoAereo].modello;
	}

	public String[] aerei() {
		return null;
	}

	public String aggiungiViaggio(String nomeTratta, int numeroPasseggeri, int chilometriTratta) {
		return null;
	}

	public String viaggio(int identificativoAereo, String nomeTratta) {
		return null;
	}
	
	
	public String viaggi() {
		return null;
	}

	public String viaggiPerTratta(String nomeTratta) {
		return null;
	}
}

