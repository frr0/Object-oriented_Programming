package aeroporto;

public class Aereo {

	String modello;
	int capienza;
	int kmXTratta;
    boolean alreadyTaken;
	
	public Aereo(String modello, int capienza, int kmXTratta) {
		super();
		this.modello = modello;
		this.capienza = capienza;
		this.kmXTratta = kmXTratta;
        alreadyTaken = false;
	}
	
}
