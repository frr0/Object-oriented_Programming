package network_professionisti;

public class CentroDiFormazione extends Entita{

	private String settore;
	private int numeroDipendenti;

	public String getSettore() {
		return settore;
	}

	public void setSettore(String settore) {
		this.settore = settore;
	}

	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(int numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public CentroDiFormazione(String nome, String nazione, String indirizzo, String settore, int numeroDipendenti) {
		// TODO Auto-generated constructor stub
		super(nome, nazione, indirizzo);
		this.settore = settore;
		this.numeroDipendenti = numeroDipendenti;
	}

}
