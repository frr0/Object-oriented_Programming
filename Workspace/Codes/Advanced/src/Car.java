
public class Car {

	String color;
	String brand;
	boolean turnedOn;
	
	public Car() {
		
	}
	void paint(String c) {
		color = "White";
	}
	
	void printState() {
		System.out.println("Colore: " + color + " Marca: " + brand + "Stato accensione: " + turnedOn);
	}

	Owner owner;

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		if (owner != null)
			this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}
	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}
	
}
