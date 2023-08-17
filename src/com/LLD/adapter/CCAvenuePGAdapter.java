package com.LLD.adapter;

import com.LLD.adapter.thirdparty.CCAvenuePG;

public class CCAvenuePGAdapter implements PaymentGatewayInterface{
    private CCAvenuePG ccAvenuePG = new CCAvenuePG();
    @Override
    public void initiate(String orderNumber) {
        ccAvenuePG.startPayment(orderNumber);

    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
