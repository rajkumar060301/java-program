package CodexRitik;

import java.util.Arrays;
import java.util.Locale;

import static java.lang.String.valueOf;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello Java";
        char data[] = {'a', 'b', 'c','d'};
        String str1 = new String(data);
        System.out.println(str1.length());
        System.out.println("Hello World".charAt(3));
        char demo[] = new char[10];
        str.getChars(0,5,demo,0);
        System.out.println(demo);
        String str2="HELLO";
        String str3 ="hello",str4="hello";
        String b=str2.equals(str3)?"same":"not same";
        System.out.println(b);
        String c=str2.equalsIgnoreCase(str4)?"same":"not same";
        System.out.println(c);
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello World".endsWith("ld"));
        System.out.println("Hello".startsWith("l",2));
        System.out.println("Hello".compareTo("Hello"));
        System.out.println("WORLD".compareToIgnoreCase("world"));
        System.out.println("Hello".indexOf('e'));
        System.out.println("this is sample code".indexOf('e',14));
        System.out.println("this is sample code".lastIndexOf('e'));
        System.out.println("this is sample code".substring(5));
        System.out.println("this is sample code".substring(8,14));
        System.out.println("this is sample code".substring(5));
        System.out.println("this is sample code".concat(" Of java"));
        System.out.println("thim im mample code".replace('m','s'));
        System.out.println("     thim im mample code    ".trim());
        System.out.println(valueOf('c'));
        System.out.println("thim im mample code".toUpperCase());
        System.out.println(str2.toUpperCase());
        System.out.println("THIS IS A CODE".toLowerCase());
        //Use of String Buffer Class
        StringBuffer obj = new StringBuffer(str2);
        System.out.println(obj.append('Y'));
        System.out.println(obj.insert(2,'Y'));
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); // 21 (16 characters room is added
        System.out.println(sb.charAt(1)); // e
        sb.setCharAt(1,'i');
        System.out.println(sb);// Hillo
        sb.setLength(2); // Hi
        System.out.println(sb.append('l').append('l')); // Hill
        System.out.println(sb.insert(0,"Big")); // Big Hill
        System.out.println(sb.replace(3, 11,"")); // Big
        System.out.println(sb.reverse()); // gib
    }
}
