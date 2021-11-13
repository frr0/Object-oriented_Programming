package inheritance;

public class CarApplication {

	public static void main(String[] args) {

		Car c1 = new Car("Red","Ferrari", false);
		
		ElectricCar ec1 = new ElectricCar("White", "Fiat", false);
		
		System.out.println("*** c1 ***");
		System.out.println(c1); // describeYourself()
		                        // toString()
		
		System.out.println("*** ec1 ***");
		System.out.println(ec1.toString());
		
		Car c2 = c1;
		
		Car c3 = ec1; // ElectricCar IS A Car
		
		Car cars[] = new Car[10];
		cars[0] = c1;
		cars[1] = ec1;
		
		
		
	}

}
