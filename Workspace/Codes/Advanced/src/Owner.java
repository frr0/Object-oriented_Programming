public class Owner {


    private String firstname;
    private String lastname;
    private int age;
    
    private Car ownedCar[];
    private int num;
    
    public Owner(String firstname, String lastname, int age, Car[] ownedCar, int num) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.ownedCar = ownedCar;
        this.setNum(num);
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
        return ownedCar;
    }

    public void setOwnedCar(Car[] ownedCar) {
        this.ownedCar = ownedCar;
    }

    public void addNewCar(Car c) {
        if (num == 4) return;
        ownedCar[num++] = c;
    }
}
