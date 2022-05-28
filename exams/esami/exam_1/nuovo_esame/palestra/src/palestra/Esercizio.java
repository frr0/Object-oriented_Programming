package palestra;

public class Esercizio {
	String codice;
	String descrizione; 
	
	public Esercizio(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String descriviti() {
		return codice+" "+descrizione;
	}
}
