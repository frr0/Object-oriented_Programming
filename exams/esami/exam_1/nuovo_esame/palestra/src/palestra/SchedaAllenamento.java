package palestra;

import java.util.Collection;

public class SchedaAllenamento {
	
	String codice;
	int CodiceIscritto;
	String data;
	Collection<String> codiciEsercizi;
	
public SchedaAllenamento(String codice, int codiceIscritto, String data, Collection<String> codiciEsercizi) {
//		super();
		this.codice = codice;
		CodiceIscritto = codiceIscritto;
		this.data = data;
		this.codiciEsercizi = codiciEsercizi;
	}

	public int getCodiceIscritto() {
		return CodiceIscritto;
	}

	public Collection<String> getCodiciEsercizi() {
		return codiciEsercizi;
	}

	public void setCodiciEsercizi(Collection<String> codiciEsercizi) {
		this.codiciEsercizi = codiciEsercizi;
	}

	public void setCodiceIscritto(int codiceIscritto) {
		CodiceIscritto = codiceIscritto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getCodice() {
		return codice;
	}
}
