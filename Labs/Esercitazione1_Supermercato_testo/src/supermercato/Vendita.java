package supermercato;

public class Vendita {

	String articolo1;
	String articolo2";
			
	String Marca1";
	String Marca2";

	int Unità1;
	int Unità2;

	double Prezzo1;
	double Prezzo2;
	
	public void percentuale(int U1, int U2) {

		double V = 50;
		double Tot = U1+U2;
		System.out.println(U1);
		System.out.println(U2);
		System.out.println(Tot);
		System.out.println(((double)V/(double)Tot));
		double per = ((double)(V/Tot)*100);
		System.out.println(per + "%");
		
	}
	

}
