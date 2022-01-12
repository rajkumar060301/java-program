package DBC.Pratices;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Community Edition
 * Date: 09-Jan-22
 */

public class Rocket {
    private  void blastOff(){
        System.out.println("bang");
    }
    public static class  Shuttle extends  Rocket{
        public static void main(String[] args) {
            new Shuttle().go();

        }
        void  go(){
            blastOff();

        }
        private  void blastOff(){
            System.out.println("Sh-bang ");
        }
    }
}
