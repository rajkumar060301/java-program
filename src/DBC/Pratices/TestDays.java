package DBC.Pratices;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Community Edition
 * Date: 09-Jan-22
 */

public class TestDays {
    public  enum Days { MON, TUE , WED};

    public static void main(String[] args) {
        for(Days day : Days.values());
        Days[] days = Days.values();
        System.out.println(days[2]);
    }
}
