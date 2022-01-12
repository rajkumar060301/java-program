package Rajkumar;

public class ObjectRaj {
    int FirstNumber;
    int SecondNumber;
    int ThirdNumber;
    int FourNumber;
    int FiveNumber;
    int sum = 0;

    public ObjectRaj(int First, int Second, int Third, int Four, int Five) {
        FirstNumber = First;
        SecondNumber = Second;
        ThirdNumber = Third;
        FourNumber = Four;
        FiveNumber = Five;
        sum = First + Second + Third + Four + Five;
        System.out.println("Total Constructor Sum :" + sum);

    }

    public int getFirstNumber() {
        return FirstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        FirstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        SecondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return ThirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        ThirdNumber = thirdNumber;
    }

    public int getFourNumber() {
        return FourNumber;
    }

    public void setFourNumber(int fourNumber) {
        FourNumber = fourNumber;
    }

    public int getFiveNumber() {
        return FiveNumber;
    }

    public void setFiveNumber(int fiveNumber) {
        FiveNumber = fiveNumber;
    }

    public void sumOfNumber() {
        int totalSum = FirstNumber + SecondNumber + ThirdNumber + FourNumber + FiveNumber;
        System.out.println("This Is Method Sum :" + totalSum);
    }
}
