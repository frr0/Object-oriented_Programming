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
		String s1 = new String();
		System.out.println(s1);
		String s2 = new String("Ciao");
		System.out.println(s2);
		
	}

}