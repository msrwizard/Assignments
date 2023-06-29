package org.geekster;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting to Send out mails");

        MailHandler MailHandler = new MailHandler();
        MailHandler.sendMail();
    }
}