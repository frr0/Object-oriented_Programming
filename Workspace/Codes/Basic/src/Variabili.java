public class Variabili {

	public static void main(String[] args) { 
		int x = 5;
		float f;
		double d;
		char c;// is in 16bits
		byte b;//in ca2 da -128 a +127
		boolean q;//true or false
		System.out.print(x);
		System.out.print("\n");
		System.out.println("Il valore di x e`: " + x);
		
		d = 4.5;
		System.out.print(d);
		System.out.print("\n");
		System.out.println(x);
		System.out.println("blabla");
		System.out.println(d+"\n"+x);
		
		String s = "Questa e' la mia prima stringa";
		System.out.println(s);
		//create a string
		
		String String;
		s = new String();//oggetto è stato creato in memoria dal costruttore String() e inizializzato a ""
		
		String s1 = new String("CIao");//passaggio parametro "ciao" al costruttore, inizialiazzata con valore specifico: Ciao
		
		String aa = "Ciao";
		aa = "Ciaoooooooooo";
		
		System.out.println(aa); //si adatta al type di dato passato come parametro (no, %d, %f...)
		

		System.out.println(s1);
		String s2 = new String("Ciao");
		System.out.println(s2);
		
	}

}
