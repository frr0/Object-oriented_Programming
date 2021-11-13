
public class Owner {

	private String firstname;
	private String lastname;
	private int age;
	
	//Car ownedCar = new Car(); // If just one
	
	private Car ownedCars[]; // = new Car[4];
	
	private int num; // = 0;
	
	public Owner(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		
		ownedCars = new Car[4]; // So far they are at null
		num = 0;
	}

	// Build the getter/setter methods using a wizard
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car[] getOwnedCars() {
		return ownedCars;
	}

	public void setOwnedCars(Car[] ownedCars) {
		this.ownedCars = ownedCars;
	}
	
	// Method used to delegate to the Owner the assignment of a new Car
	public void addNewCar(Car c) {
		
		if(num==4) // Check that number of cars is not too high
			return;
		
		ownedCars[num++] = c; // If ok, insert
		
		//num++;
		
	}
	
	
	
	
}
