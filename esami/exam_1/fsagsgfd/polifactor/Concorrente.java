package polifactor;

public class Concorrente {

	private String nome;
	private String nomeDArte;
	private String cognome;
	private String codice;
	private String dataNascita;
	int numPuntata;
	int voti; int vot[]; //	int flag;
	String titolo;
	String giudice = null;	public String getGiudice(){return giudice;}public void setGiudice(String giudice){this.giudice=giudice;}

	public Concorrente(String nome, String nomeDArte, String cognome, String dataNascita) {
				this.nome = nome;
		// TODO Auto-generated constructor stub
				this.nomeDArte = nomeDArte;
				this.cognome = cognome;
				this.dataNascita = dataNascita;
	}

	public String getCodice() {
		return codice;
	}

	public String getNomeDArte() {
		return nomeDArte;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNomeDArte(String nomeDArte) {
		this.nomeDArte = nomeDArte;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

//	public String getGiudice() { return giudice; }
//
//	public void setGiudice(String giudice) { this.giudice = giudice; }
	
}
