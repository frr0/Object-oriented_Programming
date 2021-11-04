
public class CarApplication {

	public static void main(String[] args) {

		Car c1 = new Car();
		//System.out.println(c1);
		//c1.color="Orange";
		c1.paint("Orange");
		
		
		//System.out.println(c1.color);
		//System.out.println(c1.brand);
		//System.out.println(c1.turnedOn);
		c1.printState();
		
		//c1.paint("Yellow");
		c1.paint();
		//System.out.println(c1.color);
		//System.out.println(c1.brand);
		//System.out.println(c1.turnedOn);
		c1.printState();

		Car c2 = new Car("Green","Fiat",true);
		
		c2.printState(); // We DELEGATE to object c2   
		                 // the operation of printing itself
		                 // through the invocation of a METHOD
		                 // (surely better than accessing
		                 // all its attributes by myself
		                 // using dot notation)
		
		Car c3 = new Car("Pink","Lamborghini",true);
		
		Car cars[] = new Car[10];
		
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		cars[3] = new Car();
		
		System.out.println("-------- FOR ---------");
		for(int i=0;i<cars.length;i++) {
			//System.out.println(cars[i]);
			if(cars[i]!=null)	
				cars[i].printState(); // If cell is not null, print
		}
		
		System.out.println("-------- FOR EACH ---------");
		
		// This construct allows me to iterate on arrays, without using counters
		
		for( Car c : cars ) { // For each Car c in cars (till the end of the array)
			// When in the cycle, in c we do have one of the objects in cars
			if(c!=null) // Here c "corresponds" to one of the array cells
				c.printState();			
		}
		
		
		
		Owner o1 = new Owner("John","Doe",99);
		
		// c3.owner = o1; // Sets the Owner John Doe as owner of Car c3
		
		c3.setOwner(o1); // Using the setter method
		
		// How to say that John Doe owns c3?
		
		// I need to known how many cars are there already?

		// o1.ownedCars[0] = c3; 
		
		/*for(int i=0;i<4;i++) {
			if(o1.ownedCars[i]==null) { // This cell is empty
				o1.ownedCars[i] = c3;
				break; // Leave the iteration as soon as one cell has been set
			}
		}*/
		
		// Even with getter/setter methods, working on the array di ownedCars
		// is incredibly complex: INTUITION IS THAT IT IS NOT MY JOB
		// "touching" this array, I SHOULD USE DELEGATION 
		
		o1.addNewCar(c3);
		
		
		
		
		
		
		
	}

}
