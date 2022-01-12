package dbc2201;

class LectureSecond {
    // field / attributes  /behaviour of an object
    String mobilePhoneModelNumber;
    String mobilePhoneCompanyName;
    String mobilePhoneColor;
    double mobilePhonePrice;
    double mobilePhoneDiscount;
    //Encapsulation
    /*
    private double mobilePhonePrice;
    public double getMobilePrice(){ //function
        return mobilePrice;
    */

    //method / behaviour / procedures of an object
    void callContact() {
    }

    void textContact() {
    }

    void applyDiscount() {
        mobilePhonePrice = mobilePhonePrice - mobilePhoneDiscount;
    }
}

class Main {
    public static void main(String[] args) {
        LectureSecond nokia1100 = new LectureSecond();
        nokia1100.mobilePhoneModelNumber = "Nokia 1100";
        nokia1100.mobilePhoneCompanyName = "Nokia";
        nokia1100.mobilePhoneColor = "white";
        nokia1100.mobilePhonePrice = 110000;
        nokia1100.mobilePhoneDiscount = 100;
        System.out.println(nokia1100.mobilePhonePrice);
        LectureSecond samsung = new LectureSecond();
        samsung.mobilePhoneModelNumber = "J7Next";
        samsung.mobilePhoneCompanyName = "Samsung";
        samsung.mobilePhoneColor = "Gold";
        samsung.mobilePhonePrice = 1800.50;
        System.out.println(samsung.mobilePhonePrice);
    }
}