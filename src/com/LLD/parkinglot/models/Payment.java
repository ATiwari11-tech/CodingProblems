package com.LLD.parkinglot.models;

import java.util.Date;

public class Payment extends BaseModel{
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public int getAmount() {
        return amount;
    }

    public Date getTime() {
        return time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private PaymentMode paymentMode;
    private int amount;
    private Date time;
    private PaymentStatus paymentStatus;
    private String referenceNumber;



}
