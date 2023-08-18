package com.LLD.observer.after;

public class SMSService implements OrderPlacedSubscriber {//Consumer/Observer

    public SMSService(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }
    public void sendSMS(String to,String body){
        System.out.println("Sending SMS to:"+to+" with body:"+body);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendSMS(order.customerPhone,order.body);
    }
}

