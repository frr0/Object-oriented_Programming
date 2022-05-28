package network_professionisti;

public class Entita {

	private String nome;
	private String nazione;
	private String indirizzo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Entita(String nome, String nazione, String indirizzo) {
		this.nome = nome;
		this.nazione = nazione;
		this.indirizzo = indirizzo;
		// TODO Auto-generated constructor stub
	}

/*	public String getNome() {
		return null;
	}

	public String getNazione() {
		return null;
	}

	public String getIndirizzo() {
		return null;
	}
	*/
}
