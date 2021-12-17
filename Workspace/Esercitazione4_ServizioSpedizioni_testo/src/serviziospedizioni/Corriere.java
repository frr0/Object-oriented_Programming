package serviziospedizioni;

//import java.util.Comparator;

public class Corriere {
	private String codiceCorriere;
	private String nome;
	private String Cognome;
	private int eta;
	private String citta;
	
	Spedizione spedizioni[] = new Spedizione[100];
	Giorno giorni[] = new Giorno[100];
	int n_spedizione = 0;
	

	public Corriere(String codiceCorriere, String nome, String cognome, int eta, String citta) {
		this.codiceCorriere = codiceCorriere;
		this.nome = nome;
		Cognome = cognome;
		this.eta = eta;
		this.citta = citta;
	}

	// public String getCodiceCorriere() {
	//   return null;
	// }
	//
	// public String getNome() {
	//   return null;
	// }
	//
	// public String getCognome() {
	//   return null;
	// }
	//
	// public int getEta() {
	//   return -1;
	// }
	//
	// public String getCitta() {
	//   return null;
	// }

	public String getCodiceCorriere() {
		return codiceCorriere;
	}


	public void setCodiceCorriere(String codiceCorriere) {
		this.codiceCorriere = codiceCorriere;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String descriviti() {
		return getCodiceCorriere() + " " + getNome() + " " + getCognome() + " " + getEta() + " " + getCitta();
	}

	public int compare(Corriere a, Corriere b) { 
		return b.getEta() - a.getEta();
	}

}

