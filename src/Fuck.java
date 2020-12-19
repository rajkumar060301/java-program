public class Fuck {
    public int num1;
    private int num2;
    private int num3;
    public Fuck(int number1,int number2){
        num1 = number1;
        num2 = number2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num4) {
        num3 = num4;
    }

    public void addNumber(){
        int sum = num1+num2;
        System.out.println("Total Sum Of Number:"+sum);
    }

    public static void main(String[] args) {
        Fuck raj = new Fuck(10,20);
        raj.addNumber();
        raj.setNum3(40);
        System.out.println("Set Number is :"+raj.getNum3());
    }
}
