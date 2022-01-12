package DBC.Pratices;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Community Edition
 * Date: 09-Jan-22
 */

public interface Device {
    public void doIt();

}

abstract   class  Phone1 extends  Electronic{

}
abstract  class  Phone2 extends  Electronic{
    public  void doIt(int number){

    }
}
class  Phone3 extends  Electronic implements  Device{
    public  void  doStuff(){

    }
}