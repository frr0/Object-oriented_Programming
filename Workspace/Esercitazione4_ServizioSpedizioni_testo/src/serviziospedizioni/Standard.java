package serviziospedizioni;

public class Standard extends Collo {
	public Standard(String codiceCollo, String citta, String dataDeposito, String indirizzoDestinatario,
			String indirizzoMittente) {
		super(codiceCollo, citta, dataDeposito, indirizzoDestinatario, indirizzoMittente);
	}

	public String descriviti() {
		return getCodiceCollo() + " " + getCitta() + " " + getDataDeposito() + " " + getIndirizzoDestinatario() + " " + getIndirizzoMittente();
	}
}
