package com.LLD.observer.after;

import com.LLD.observer.after.InventoryManagementSystem;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);
        EmailService emailService = new EmailService(flipkart);

        //One way to calling addSubscriber, other way is above i.e. pass flipkart object to every constructor
//        flipkart.addSubscriber(invoiceGenerator);
//        flipkart.addSubscriber(emailService);
//        flipkart.addSubscriber(smsService);
//        flipkart.addSubscriber(inventoryManagementSystem);
    }
}
