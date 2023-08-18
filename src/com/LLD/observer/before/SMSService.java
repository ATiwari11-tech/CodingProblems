package com.LLD.observer.before;

public class SMSService {//Consumer/Observer
    public void sendSMS(String to,String body){
        System.out.println("Sending SMS to:"+to+" with body:"+body);
    }
}

