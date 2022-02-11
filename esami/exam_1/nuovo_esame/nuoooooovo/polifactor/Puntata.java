package polifactor;

public class Puntata {

	int numero;
	private String data;
	String esibizioni;
	public Puntata(int numero, String data) {
		this.numero = numero;
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
