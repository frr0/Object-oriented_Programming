package piscine;

public class Posto {
	
	String numero; //� di tipo String perch� il numero � composto da
				   //un carattere (B oppure P) pi� un valore progressivo
				   //a partire da 1-->es. il 1� posto sul prato : P1
				   //il 3� posto a bordo piscina : B3
	
	
	public Posto(String numero) {
		this.numero = numero;
	}


	public String getNumero() {
		return numero;  
	}

	
	
	
}
