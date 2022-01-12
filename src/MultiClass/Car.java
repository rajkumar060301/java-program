package MultiClass;

public class Car {
    String carName = "Nano";
    double price = 1900000;
    double battery = 25000;
    void  discount(){};


}
class  Main{
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car Name  is : "+ car.carName);
        System.out.println("Car Price is : " + car.price);
        System.out.println("Car battery in Mh : " + car.battery);
    }
}
