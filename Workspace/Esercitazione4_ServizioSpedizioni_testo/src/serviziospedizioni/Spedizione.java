package serviziospedizioni;

public class Spedizione {

	String codiceSpedizione;
	String codiceCorriere;
	private String codiceCollo;
	private String citta;
	private String dataConsegna;
	boolean occupato;

	public String descriviti() {
		return codiceSpedizione + " " + codiceCorriere + " " + getCodiceCollo() + " " + getDataConsegna();
	}

	public Spedizione(String codiceCollo, String citta, String dataConsegna) {
//		super();
		this.codiceCollo = codiceCollo;
		this.citta = citta;
		this.dataConsegna = dataConsegna;
	}

	public Spedizione(String codiceSpedizione, String codiceCorriere, String codiceCollo, String citta,
			String dataConsegna, boolean occupato) {
//		super();
		this.codiceSpedizione = codiceSpedizione;
		this.codiceCorriere = codiceCorriere;
		this.codiceCollo = codiceCollo;
		this.citta = citta;
		this.dataConsegna = dataConsegna;
		this.occupato = false;
	}

	public String getCodiceCollo() {
		return codiceCollo;
	}

	public void setCodiceCollo(String codiceCollo) {
		this.codiceCollo = codiceCollo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(String dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
}
