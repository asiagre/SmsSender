package com.smssender;

import java.util.*;

public class CommunicationWithUser {
    Scanner scan = new Scanner(System.in);

    public String putNumber() {
        String number;
        do {
            System.out.println("Telephone number of receiver(example: 0048123456789): ");
            number = scan.nextLine();
            if (number.length() != 13) {
                System.out.println("Incorrect data format. Please, try again.");
            }
        } while (number.length() != 13);
        return number;
    }

    public String putContent() {
        System.out.println("Sms content: " );

        String sms = scan.nextLine();
        return sms;
    }

    public boolean confirmation() {
        String answer;
        do {
            System.out.println("Do you want to send this sms (y/n): ");
            answer = scan.nextLine();
            if(answer.equalsIgnoreCase("y")) {
                return true;
            } else if(answer.equalsIgnoreCase("n")) {
                return false;
            }
        } while ((!answer.equals("y")) && (!answer.equals("n")));
        return false;
    }
}
