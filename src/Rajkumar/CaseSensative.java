package Rajkumar;

/*c programing Language = ANSI / ISO - complete for cariable
python programing Language = PEP8 - snake_case for variable
java programing Language = JEP camelCase for variable

variable Naming Convention

create a variable name for the Roll number of a student

int numberOfCars; // ???
JAVA
PascalCase : RollNumberOfStudent
    (used for naming classes)

camelCase : rollNumberOfStudent | mobileCompanyName | mobilePrice
    (used for naming variables and method)

SCREAM_CASE : ROLL_NUMBER_of_STUDENT
    (used for naming constant)
*/


//Definition Class
class Car {
    String carCompanyName;
    String carModelName;
    String carColor;
    String carRegistrationNumber;
    double carMileage;
    //fields / attributes / properties
    private float carPrice;

    //methods / behaviour / procedures of an object
    void applyDiscount() {
        carPrice = carPrice * (20.0f / 100.0f);
    }

    public float getCarPrice() {
        int carPrice = 85000;
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }
}


class main {
    public static void main(String[] args) {
        Car objectScanner = new Car();
        objectScanner.carCompanyName = "TATA";
        objectScanner.carModelName = "1547";
        objectScanner.carColor = "red";
        objectScanner.carRegistrationNumber = "65464654";
        objectScanner.carMileage = 50;
        objectScanner.applyDiscount();
        System.out.println(objectScanner.getCarPrice());
    }
}


