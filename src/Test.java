public class Test {
    public int age;//instance variable
    public String name;
    public Test(int agee,String names){
        age = agee;
        name=names;
    }
    public void exam(){
        int age=0;
        age=age+7;
        System.out.println("Age is:"+age);
        System.out.println("My Name:"+name);
    }

    public static void main(String[] args) {
        Test Rajkumar = new Test(20,"Rajkumar");
        Rajkumar.exam();
    }
}
