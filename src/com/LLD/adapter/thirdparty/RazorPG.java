package com.LLD.adapter.thirdparty;

public class RazorPG {//Third Party Code which we don't have control
    public String initiatePayment(String cardNumber){
        System.out.println("Payment Started Using Razor Pay");
        return "RazorPay";
    }
}
