package network_professionisti;

public class Iscritto {

	private String nome;
	private String cognome;
	private String web;
	private String email;
	private String descrizione;
	private String Id;
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Iscritto(String nome, String cognome, String web, String email, String descrizione) {
		this.nome = nome;
		this.cognome = cognome;
		this.web = web;
		this.email = email;
		this.descrizione = descrizione;
		// TODO Auto-generated constructor stub
	}

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

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	
	
}
