package com.LLD.observer.after;

public class EmailService implements OrderPlacedSubscriber {//Consumer

    public EmailService(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }
    public void sendEmail(String to, String body){
        System.out.println("Sending Email To:"+to+" With Body:"+body);
    }

    @Override
    public void onOrderPlaced(Order order) {
        sendEmail(order.customerEmail,order.body);
    }
}
