package com.LLD.observer.before;

public class InvoiceGenerator {//Consumer
    public void generateInvoice(Long orderId){
        System.out.println("Generating Invoice For Order:"+orderId);
    }
}
