package supermercato;

public class Vendita {

	//first part
	// public String articolo1;
	// public String articolo2;
	//
	// public String Marca1;
	// public String Marca2;
    //
	// public int Unita1;
	// public int Unita2;
    //
	// public double Prezzo1;
	// public double Prezzo2;

	//second part
	public String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(final String marca) {
		Marca = marca;
	}
	public int getUnita() {
		return Unita;
	}
	public void setUnita(final int unita) {
		Unita = unita;
	}
	public double getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(final double prezzo) {
		Prezzo = prezzo;
	}
	public String Marca;
	public int Unita;
	public double Prezzo;

	//important!!!!!!!!!!!!
	//source generate costruct fields

	// public void percentuale(int U1, int U2) {
    //
	//     double V = 50;
	//     double Tot = U1+U2;
	//     System.out.println(U1);
	//     System.out.println(U2);
	//     System.out.println(Tot);
	//     System.out.println(((double)V/(double)Tot));
	//     double per = ((double)(V/Tot)*100);
	//     System.out.println(per + "%");
	//
	// }


}
