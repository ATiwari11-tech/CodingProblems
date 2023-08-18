package com.LLD.observer.before;

public class Flipkart {//Producer/Creator
    private EmailService emailService;//Facade, we need to open this class always to make a new entry if required
    //when any order is placed, which violates OCP
    private InvoiceGenerator invoiceGenerator;//Facade, we need to open this class always to make a new entry if required
    //when any order is placed, which violates OCP
    private SMSService smsService;//Facade, we need to open this class always to make a new entry if required
    //when any order is placed, which violates OCP
    private InventoryManagementSystem inventoryManagementSystem;//Facade, we need to open this class always to make a new entry if required
    //when any order is placed, which violates OCP

    public Flipkart(EmailService emailService, SMSService smsService, InvoiceGenerator invoiceGenerator, InventoryManagementSystem inventoryManagementSystem){
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceGenerator = invoiceGenerator;
        this.inventoryManagementSystem = inventoryManagementSystem;
    }
    public void orderPlaced(Order order){
        emailService.sendEmail(order.customerEmail,"Your Order Is Placed");
        smsService.sendSMS(order.customerPhone,"Your Order Is Placed");
        invoiceGenerator.generateInvoice(order.orderId);
        inventoryManagementSystem.updateInventory(order.prodId);
    }
}
//Objective now is how can we avoid opening Flipkart Class when any service wants to subscribe when order is placed
//Go to after package
