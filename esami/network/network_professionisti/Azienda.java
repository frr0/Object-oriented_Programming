package network_professionisti;

public class Azienda extends Entita {
	
	private int numeroDipendenti;
	private String settore;

	public Azienda(String nome, String nazione, String indirizzo) {
		// TODO Auto-generated constructor stub
		super(nome, nazione, indirizzo);
	}

	public String getSettore() {
		return settore;
	}

	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}
	
}
