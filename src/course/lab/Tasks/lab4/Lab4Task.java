/* Created by IntelliJ IDEA.
 * Author: Raj kumar
 * Date: 01/08/20
 * Time: 8:17 PM
 * File: Lab4Task.java
 */
package course.lab.Tasks.lab4;

import java.util.Scanner;
public class Lab4Task {
    // This is the total number of participants allowed in the conference.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static final byte TOTAL_PARTICIPANTS = 100;
    // This method will sell the ticket to the participant.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
        System.out.println(message);
    }
    public static void main(String[] args) {
        Scanner ScannerObject = new Scanner(System.in);
        byte TOTAL_SHOLD_TICKET=0;
        byte TOTAL_TICKET_LEFT =0,count=100;
        String participantName;
        while (TOTAL_SHOLD_TICKET<=TOTAL_PARTICIPANTS) {
            TOTAL_TICKET_LEFT=count;
            System.out.println("Enter the Left Ticket : "+TOTAL_TICKET_LEFT);
            System.out.println("Enter Your Name");
            participantName = ScannerObject.nextLine();
            TOTAL_SHOLD_TICKET+=1;
            count-=1;
            if (TOTAL_SHOLD_TICKET == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                break;
            }
        }

    }
}