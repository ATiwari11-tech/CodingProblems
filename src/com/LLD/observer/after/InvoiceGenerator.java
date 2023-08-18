package com.LLD.observer.after;

public class InvoiceGenerator implements OrderPlacedSubscriber{//Consumer

    public InvoiceGenerator(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }
    public void generateInvoice(Long orderId){
        System.out.println("Generating Invoice For Order:"+orderId);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.prodId);
    }
}
