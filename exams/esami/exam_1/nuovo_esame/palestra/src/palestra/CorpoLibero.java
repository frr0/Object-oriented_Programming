package palestra;

public class CorpoLibero extends Esercizio {
	
	double calorie;
	
	public CorpoLibero(String codice, String descrizione, double calorie) {
		super(codice, descrizione);
		this.calorie = calorie;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public String descriviti() {
		return super.descriviti()+" "+"CPL"+" "+calorie;
	}

}
