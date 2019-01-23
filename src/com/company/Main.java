package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String number;
        String answer;

        do {
            System.out.println("Telephone number of receiver(example: 0048123456789): ");
            number = scan.nextLine();
            if(number.length() != 13) {
                System.out.println("Incorrect data format. Please, try again.");
            }
        } while (number.length() != 13);

        System.out.println("Sms content: " );
        String sms = scan.nextLine();

        do {
            System.out.println("Do you want to send this sms (y/n): ");
            answer = scan.nextLine();
            if(answer.equals("y")) {
                System.out.println("Sending in progress");
            } else if(answer.equals("n")) {
                System.out.println("You choose not to sending message. Have a nice day!");
            } else {
                System.out.println("Incorrect answer. Try again.");
            }
        } while ((!answer.equals("y")) && (!answer.equals("n")));

    }
}
