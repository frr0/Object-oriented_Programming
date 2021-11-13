public class Owner {


    private String firstname;
    private String lastname;
    private int age;
    
    private Car ownedCars[];
    private int num;
    
    public Owner(String firstname, String lastname, int age, Car[] ownedCar, int num) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
//        this.ownedCars = ownedCar;
//        this.setNum(num);
        ownedCars = new Car[4]; // So far they are at null
		num = 0;
    }




    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


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

    public Car[] getOwnedCar() {
        return ownedCars;
    }

    public void setOwnedCar(Car[] ownedCar) {
        this.ownedCars = ownedCar;
    }

    public void addNewCar(Car c) {
        if (num == 4) return;
        ownedCars[num++] = c;
    }
}
