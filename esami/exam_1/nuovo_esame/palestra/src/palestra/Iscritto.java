package palestra;

public class Iscritto {
	
	String nome;
	String cognome;
	String sesso;
	int eta;
	double peso;
	int codice;
	String data = "0000";
	
	SchedaAllenamento ss = new SchedaAllenamento(null, codice, "0", null);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public Iscritto(String nome, String cognome, String sesso, int eta, double peso, int codice) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.eta = eta;
		this.peso = peso;
		this.codice = codice;
	}

	public String descriviti() {
		return codice+" "+nome+" "+cognome+" "+sesso+" "+eta+" "+peso;
	}

}