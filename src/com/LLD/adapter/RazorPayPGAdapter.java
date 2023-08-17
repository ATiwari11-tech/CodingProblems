package com.LLD.adapter;

import com.LLD.adapter.thirdparty.RazorPG;

public class RazorPayPGAdapter implements PaymentGatewayInterface{
    private RazorPG razorPG = new RazorPG();
    @Override
    public void initiate(String orderNumber) {
        razorPG.initiatePayment(orderNumber);
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
