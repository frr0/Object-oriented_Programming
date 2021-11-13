// Defines the structure of 
// possible Car objects 
// (created using new in another file)

public class Car {     
	// Attributes
	private String color; // INFORMATION HIDING
	private String brand;
	private boolean turnedOn;
	
	//String firstname
	//String lastname
	//int age
	private Owner owner; // I created the link between the car and its owner
	
	// Constructor(s)
	
	// This is what the DEFAULT constructor
	// would look like (it is added automatically
	// by Java, I don't need to rewrite it like that)
	/*
	public Car(){
		color = null; // Default initializations
		brand = null;
		turnedOn = false;
	}
	*/
	
	public Car(){
		color = "Red"; // Custom initialization
		brand = "Ferrari";
		turnedOn = false;
	}
	
	// Constructor in overloading
	// Same name, but different SIGNATURE
	public Car(String color, String brand, boolean turnedOn) {
		this.color = color;
		this.brand = brand;
		this.turnedOn = turnedOn;
		// this means THIS OBJECTS
		// Used to solve ambiguities in names
	}

	// E.g., with less parameters
	public Car(String brand, boolean turnedOn) {
		this.brand = brand;
		this.turnedOn = turnedOn;
		// color? 
	}

	// Methods
	void paint(String c) {
		// With a method, we can manage ERROR checking
		// if(String c is empty)
		// then ....
		// else
		
		color = c;   // Takes parameter c
		             // and assigns it to 
		             // attribute color
	}
	
	void paint() {
		color = "White";
	}
	
	void printState() {
		// With a method we can FACTORIZE common use operations 
		// (and IN CASE OF ERRORS or MAINTENAINCE NEEDS this
		// is the ONLY PLACE where we may implement CHANGES)
		
		System.out.println("Colore: "+color+" Marca: "+brand+" Stato accensione: "+turnedOn);
	}
	
	// GETTER / SETTER METHODS (to provide public access to private attributes)
	
    public Owner getOwner(){
	    return owner; // this.owner           	
	}
	
	
	public void setOwner(Owner owner) {
		if(owner!=null)	// Example of a possible error check (any instruction)
			this.owner=owner;
	}
	
	
	
	
	
}
