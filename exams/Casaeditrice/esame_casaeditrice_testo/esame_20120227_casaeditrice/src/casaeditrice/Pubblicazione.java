package casaeditrice;

import java.util.Collection;

public class Pubblicazione {

	public String getTitolo(){
		return null;
	}
	
	public String getVolume(){
		return null;
	}
	
	public int getAnno(){
		return -1;
	}

	public Autore getProprietario(){
		return null;
	}

	public void aggiungiCoautori(Autore a, int contributo) throws AutoreDuplicatoException{
	}
	
	public Collection<Autore> elencoAutori(){
		return null;
	}

	public int getContributo(Autore a){
		return -1;
	}
	
}
