package supermercato;

public class Vendita {

	//first part
	public String articolo1;
	public String articolo2;
			
	public String Marca1;
	public String Marca2;

	public int Unità1;
	public int Unità2;

	public double Prezzo1;
	public double Prezzo2;

	//second part
	public String nome;
	public String Marca;
	public int Unità;
	public double Prezzo;
	
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
