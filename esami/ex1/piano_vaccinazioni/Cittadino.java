package piano_vaccinazioni;

public class Cittadino {

	private String codiceTesseraSanitaria;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String regione;
	private int eta;
	
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getCodiceTesseraSanitaria() {
		return codiceTesseraSanitaria;
	}

	public void setCodiceTesseraSanitaria(String codiceTesseraSanitaria) {
		this.codiceTesseraSanitaria = codiceTesseraSanitaria;
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

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public Cittadino(String codiceTesseraSanitaria, String nome, String cognome, String dataDiNascita, String regione) {
		this.codiceTesseraSanitaria = codiceTesseraSanitaria;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.regione = regione;
		int anno = Integer.parseInt(dataDiNascita.substring(0, 4));
		this.eta = 2021 - anno;
	}

//	public String getCodiceTesseraSanitaria() {
//		return null;
//	}
//
//	public String getNome() {
//		return null;
//	}
//
//	public String getCognome() {
//		return null;
//	}
//
//	public String getDataDiNascita() {
//		return null;
//	}
//
//	public String getRegione() {
//		return null;
//	}
	
}
