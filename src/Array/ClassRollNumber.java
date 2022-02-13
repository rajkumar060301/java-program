package Array;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 13-Jan-22
 */

public class ClassRollNumber {
    int[] rollNumberOfStudent = {191500623, 191500625, 158645};

    public static void main(String[] args) {
        ClassRollNumber classRollNumber = new ClassRollNumber();
        System.out.println(classRollNumber.rollNumberOfStudent[1]);
        for (int i = 0; i < classRollNumber.rollNumberOfStudent.length; i++) {
            System.out.print(classRollNumber.rollNumberOfStudent[i] + ",");

        }
    }
}
