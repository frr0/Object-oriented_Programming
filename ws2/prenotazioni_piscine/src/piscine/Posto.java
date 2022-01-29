package piscine;

public class Posto {
	
	String numero; //è di tipo String perché il numero è composto da
				   //un carattere (B oppure P) più un valore progressivo
				   //a partire da 1-->es. il 1° posto sul prato : P1
				   //il 3° posto a bordo piscina : B3
	
	
	public Posto(String numero) {
		this.numero = numero;
	}


	public String getNumero() {
		return numero;  
	}

	
	
	
}
