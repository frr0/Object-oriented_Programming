package casaeditrice;

import java.util.Collection;

public class CasaEditrice {

	public Autore definisciAutore(String nome, String cognome, String email){
		Autore autore = Autore(nome, cognome, email);
		return null;
	}
	
	public Collection<Autore> elencoAutori(){
		return null;
	}
	
	public Autore getAutore(int codice){
		return null;
    }

	public Autore getAutore(String nome, String cognome){
     	return null;
	}

	public Collection<Pubblicazione> pubblicazioniAutore(String nome, String cognome) throws AutoreInesistenteException {
		return null;
	}
	
	public void leggiPubblicazioni(String nomeFile) {
	}

}
