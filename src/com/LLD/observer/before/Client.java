package com.LLD.observer.before;

import com.LLD.observer.before.EmailService;
import com.LLD.observer.before.InvoiceGenerator;
import com.LLD.observer.before.SMSService;

public class Client {
    public static void main(String[] args) {
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Flipkart flipkart = new Flipkart(emailService,smsService,invoiceGenerator,inventoryManagementSystem);//Injecting
        //dependencies
        flipkart.orderPlaced(new Order());
    }

}
