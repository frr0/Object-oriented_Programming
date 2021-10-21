import basic.Automobile;

public class Classi {

	public static void main(String[] args) {
	//public let a function visible in all your program(s) (every files)

		/* String targa1 = "AB123CD"; */
		/* String marca1 = "VW"; */
		/* String modello1 = "T Rod"; */
        /*  */
		/* String targa2 = "CC456DD"; */
		/* String marca2 = "Fiat"; */
		/* String modello2 = "Panda"; */
		
		//ho creato 5 auto
		Automobile a1 = new Automobile();
		Automobile a2 = new Automobile();
		Automobile a3 = new Automobile();
		Automobile a4 = new Automobile();
		Automobile a5 = new Automobile();
		
		a1.targa = "AA111BB";
		a1.marca = "FIAT";
		a1.modello = "Panda";	
		a1.accendi();
		/* a1.accesa = "false";//wrong because accesa is private in Automobile */

		a2.targa = "AA112BB";
		a2.marca = "FIAT";
		a2.modello = "Punto";	

		a3.targa = "AA113BB";
		a3.marca = "FIAT";
		a3.modello = "Punto";	

		a4.targa = "AA114BB";
		a4.marca = "FIAT";
		a4.modello = "Punto";	

		a5.targa = "AA115BB";
		a5.marca = "FIAT";
		a5.modello = "Punto";	
		
		Automobile a6 = new Automobile();
		System.out.println(a6.targa);
		System.out.println(a6.marca);
		System.out.println(a6.modello);
		System.out.println(a6.cilindrata);
		System.out.println(a6.dimmiSeSeiAccesa());
		
		//è vuoto
		System.out.println(a1.targa);
		System.out.println(a1.marca);
		System.out.println(a1.modello);
		System.out.println(a2.targa);
		System.out.println(a2.marca);
		System.out.println(a2.modello);
		System.out.println(a3.targa);
		System.out.println(a3.marca);
		System.out.println(a3.modello);
		System.out.println(a4.targa);
		System.out.println(a4.marca);
		System.out.println(a4.modello);
		System.out.println(a5.targa);
		System.out.println(a5.marca);
		System.out.println(a5.modello);
	}
}