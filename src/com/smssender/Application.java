package com.smssender;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        CommunicationWithUser communication = new CommunicationWithUser();
        String number = communication.putNumber();
        String content = communication.putContent();

        if (communication.confirmation()) {
            SmsSender.sendSms(number, content);
        } else {
            System.out.println("You choose not to sending message. Have a nice day!");
        }
    }
}
