package com.LLD.observer.before;

public class EmailService {//Consumer
    public void sendEmail(String to, String body){
        System.out.println("Sending Email To:"+to+" With Body:"+body);
    }
}
