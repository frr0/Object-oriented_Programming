
public class CarApp {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.turnedOn);

		c1.paint("Yellow");
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.turnedOn);

		Car c2 = new Car();
    c1.printState();
    // c1.paint();

		
		Car c3;
		c3 = c2;
		
		Owner o1 = new Owner("Jonh", "Doe", 99, null, 0);
		// c3.owner = o1;
    // 
    c3.setOwner(o1); //using setter
		
		// o1.ownedCar[0] = c3;
    // for (int i = 0; i < 4; i++) {
    //   if (o1.ownedCar[i]==null) {
    //     o1.ownedCar[i] = c3;
    //   }
    // }
    
    // for (int i = 0; i < 4; i++) {
    //   if (o1.getOwnedCar()[i]==null) {
    //     o1.setOwnedCar()[i] = c3;
    //     break;
    //   }
    // }
    
    o1.addNewCar(c3);

	}

}