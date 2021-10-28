
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.turnedOn);

		c1.paint("Yellow");
		System.out.println(c1.color);
		System.out.println(c1.brand);
		System.out.println(c1.turnedOn);

		Car c2 = new Car();
		
		Car c3;
		c3 = c2;
	}

}
