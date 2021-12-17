package serviziospedizioni;

public class Collo {
	private String codiceCollo;
	private String citta;
	private String dataDeposito;
	private String indirizzoDestinatario;
	private String indirizzoMittente;
	String tipo = "";
	
	public Collo(String codiceCollo, String citta, String dataDeposito, String indirizzoDestinatario, String indirizzoMittente) {
		this.codiceCollo = codiceCollo;
		this.citta = citta;
		this.dataDeposito = dataDeposito;
		this.indirizzoDestinatario = indirizzoDestinatario;
		this.indirizzoMittente = indirizzoMittente;
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

	public String getDataDeposito() {
		return dataDeposito;
	}

	public void setDataDeposito(String dataDeposito) {
		this.dataDeposito = dataDeposito;
	}

	public String getIndirizzoDestinatario() {
		return indirizzoDestinatario;
	}

	public void setIndirizzoDestinatario(String indirizzoDestinatario) {
		this.indirizzoDestinatario = indirizzoDestinatario;
	}

	public String getIndirizzoMittente() {
		return indirizzoMittente;
	}

	public void setIndirizzoMittente(String indirizzoMittente) {
		this.indirizzoMittente = indirizzoMittente;
	}

	// public String getCodiceCollo() {
	//   return null;
	// }
	//
	// public String getCitta() {
	//   return null;
	// }
	//
	// public String getDataDeposito() {
	//   return null;
	// }
	//
	// public String getIndirizzoDestinatario() {
	//   return null;
	// }
	//
	// public String getIndirizzoMittente() {
	//   return null;
	// }
}
