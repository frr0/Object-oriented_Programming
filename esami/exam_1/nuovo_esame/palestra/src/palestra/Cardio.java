package palestra;

public class Cardio extends Esercizio {

	int minuti;
	
	public int getMinuti() {
		return minuti;
	}

	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}

	public Cardio(String codice, String descrizione, int minuti) {
		super(codice, descrizione);
		this.minuti = minuti;
		// TODO Auto-generated constructor stub
	}

	public String descriviti() {
		return super.descriviti()+" "+"CAR"+" "+minuti;
	}
}
