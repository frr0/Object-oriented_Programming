import basic.Automobile;

public class Classi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String targa1 = "AB123CD";
		String marca1 = "VW";
		String modello1 = "T Rod";

		String targa2 = "CC456DD";
		String marca2 = "Fiat";
		String modello2 = "Panda";
		
		//ho creato 5 auto
		Automobile a1 = new Automobile();
		Automobile a2 = new Automobile();
		Automobile a3 = new Automobile();
		Automobile a4 = new Automobile();
		Automobile a5 = new Automobile();
		
		//è vuoto
		System.out.println(a1.targa);
		System.out.println(a1.marca);
		System.out.println(a1.modello);
	}
}