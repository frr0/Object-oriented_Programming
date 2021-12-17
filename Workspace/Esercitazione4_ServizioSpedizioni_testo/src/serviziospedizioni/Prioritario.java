package serviziospedizioni;

public class Prioritario extends Collo {
	String MailMittente;

	public Prioritario(String codiceCollo, String citta, String dataDeposito, String indirizzoDestinatario,
			String indirizzoMittente, String mailMittente) {
		super(codiceCollo, citta, dataDeposito, indirizzoDestinatario, indirizzoMittente);
		MailMittente = mailMittente;
	}

	public String descriviti() {
		return getCodiceCollo() + " " + getCitta() + " " + getDataDeposito() + " " + getIndirizzoDestinatario() + " " + getIndirizzoMittente() + " " + getMailMittente();
	}

	public String getMailMittente() {
		return MailMittente;
	}

	public void setMailMittente(String mailMittente) {
		MailMittente = mailMittente;
	}

	/* public String getMailMittente() { */
	/*   return null; */
	/* } */

}
