package inheritance;

public class Car {

	String color; // private
	String brand;
	boolean turnedOn;
	
	// Costruttore
	/*public Car() { // "Copia" del costruttore vuoto (l'ho esplicitato)
		color = null;
		brand = null;
		turnedOn = false;
	}*/
	
	public Car(String c, String b, boolean t) {
		color = c;
		brand = b;
		turnedOn = t;
	}

	// Metodi getter/setter
	
	// Altri metodi
	
	public void paint(String c) {
		color = c;
	}
	
	public void turnOn() {
		turnedOn = true;
	}
	
	// Metodo per "convertire", rappresentare un oggetto
	// (i suoi attribvuti) sotto forma di stringa
	public String toString() { // describeYourself
		return color+" "+brand+" "+turnedOn;
	}
	
	
	
}
