package piscine;

public class Piscina {



	private String codice;
	private String indirizzoPiscina;
	private int numPostiBordoPiscina;
	private int numPostiPrato;
	private int maxOccupantiPosto;



	public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public String getIndirizzo() {
		return indirizzoPiscina;
	}



	public void setIndirizzoPiscina(String indirizzo) {
		this.indirizzoPiscina = indirizzo;
	}



	public int getNumPostiBordoPiscina() {
		return numPostiBordoPiscina;
	}



	public void setNumPostiBordoPiscina(int numPostiBordoPiscina) {
		this.numPostiBordoPiscina = numPostiBordoPiscina;
	}



	public int getNumPostiPrato() {
		return numPostiPrato;
	}



	public void setNumPostiPrato(int numPostiPrato) {
		this.numPostiPrato = numPostiPrato;
	}



	public int getMaxOccupantiPosto() {
		return maxOccupantiPosto;
	}



	public void setMaxOccupantiPosto(int maxOccupantiPosto) {
		this.maxOccupantiPosto = maxOccupantiPosto;
	}



	public Piscina(String codice, String indirizzoPiscina, int numPostiBordoPiscina, int numPostiPrato, int maxOccupantiPosto) {
		this.codice = codice;
		this.indirizzoPiscina = indirizzoPiscina;
		this.numPostiBordoPiscina = numPostiBordoPiscina;
		this.numPostiPrato = numPostiPrato;
		this.maxOccupantiPosto = maxOccupantiPosto;
	}

//	public String getCodice() {
//		return null;
//	}
//
//	public String getIndirizzo() {
//		return null;
//	}
//
//	public int getNumPostiBordoPiscina() {
//		return -1;
//	}
//
//	public int getNumPostiPrato() {
//		return -1;
//	}
//
//	public int getMaxOccupantiPosto() {
//		return -1;
//	}

}
