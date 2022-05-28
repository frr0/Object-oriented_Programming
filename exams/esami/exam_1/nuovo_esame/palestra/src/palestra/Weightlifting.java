package palestra;

public class Weightlifting extends Esercizio {
	
	int ripetizioni;
	int carico;
	
	public Weightlifting(String codice, String descrizione, int ripetizioni, int carico) {
		super(codice, descrizione);
		this.ripetizioni = ripetizioni;
		this.carico = carico;
	}

	public int getRipetizioni() {
		return ripetizioni;
	}

	public void setRipetizioni(int ripetizioni) {
		this.ripetizioni = ripetizioni;
	}

	public int getCarico() {
		return carico;
	}

	public void setCarico(int carico) {
		this.carico = carico;
	}

	public String descriviti() {
		return super.descriviti()+" "+"WGT"+" "+ripetizioni+" "+carico;
	}
}
