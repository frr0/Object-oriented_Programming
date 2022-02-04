package polifactor;

//import java.util.LinkedHashMap;
//import java.util.LinkedList;

public class Puntata {

	int numero;
	private String data;
	String esibizioni;
	Concorrente Eliminato;
//		=======================================
//	LinkedList<LinkedHashMap<Concorrente, Brano>> aesib = new LinkedList<LinkedHashMap<Concorrente, Brano>>();
//	LinkedHashMap<Concorrente, Brano> mapesib = new LinkedHashMap<>();
//		=======================================
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
