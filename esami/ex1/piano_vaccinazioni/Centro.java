package piano_vaccinazioni;

public class Centro {
	
	

	private String regione;
	private int numeroMassimoDosi;
	private String codice;
	int dosiA;
	int dosiB;

	public Centro(String regione, int numeroMassimoDosi, String codice) {
		this.regione = regione;
		this.numeroMassimoDosi = numeroMassimoDosi;
		this.codice = codice;
		// TODO Auto-generated constructor stub
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public int getNumeroMassimoDosi() {
		return numeroMassimoDosi;
	}

	public void setNumeroMassimoDosi(int numeroMassimoDosi) {
		this.numeroMassimoDosi = numeroMassimoDosi;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

/*	public String getCodice() {
		return null;
	}

	public String getRegione() {
		return null;
	}

	public int getNumeroMassimoDosi() {
		return -1;
	}
*/
	public void aggiungiDosi(char tipoVaccino, int numeroDosi) throws EccezioneConsegnateMenoDosi {
		
		if (tipoVaccino == 'A') {
			if (numeroDosi + dosiA + dosiB > numeroMassimoDosi) {
				dosiA = numeroMassimoDosi - dosiB;
				throw new EccezioneConsegnateMenoDosi(numeroMassimoDosi - dosiB);
			}
			else {
				dosiA = dosiA + numeroDosi;
			}
		}
		else {
			if (numeroDosi + dosiA + dosiB > numeroMassimoDosi) {
				dosiB = numeroMassimoDosi - dosiA;
				throw new EccezioneConsegnateMenoDosi(numeroMassimoDosi - dosiA);
			}
			else {
				dosiB = dosiB + numeroDosi;
			}			
		}
		
	}

}
