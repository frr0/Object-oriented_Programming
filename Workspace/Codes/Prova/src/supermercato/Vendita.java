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



	/**
	 * Get nome.
	 *
	 * @return nome as String.
	 */
	public String getNome()
	{
	    return nome;
	}

	/**
	 * Set nome.
	 *
	 * @param nome the value to set.
	 */
	public void setNome(String nome)
	{
	    this.nome = nome;
	}

	/**
	 * Get Marca.
	 *
	 * @return Marca as String.
	 */
	public String getMarca()
	{
	    return Marca;
	}

	/**
	 * Set Marca.
	 *
	 * @param Marca the value to set.
	 */
	public void setMarca(String Marca)
	{
	    this.Marca = Marca;
	}

	/**
	 * Get Prezzo.
	 *
	 * @return Prezzo as double.
	 */
	public double getPrezzo()
	{
	    return Prezzo;
	}

	/**
	 * Set Prezzo.
	 *
	 * @param Prezzo the value to set.
	 */
	public void setPrezzo(double Prezzo)
	{
	    this.Prezzo = Prezzo;
	}
}
