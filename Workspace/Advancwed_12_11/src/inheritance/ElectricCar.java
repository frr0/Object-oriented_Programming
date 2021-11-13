package inheritance;

public class ElectricCar extends Car {

	// La classe ElectricCar estende Car

	boolean cellsCharged;
	
	public ElectricCar(String c, String b, boolean t) {
		super(c, b, t); // Prima istruzione, in pratica
		                // invoca il costruttore di Car
		
		cellsCharged = false;
	}

	// Stesso nome di quello del padre, ma con istruzione diversa
	public String toString() {
		return color+" "+brand+" "+turnedOn+" "+cellsCharged;
	}
	
	
	
}
