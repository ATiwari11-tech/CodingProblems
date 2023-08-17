package com.LLD.adapter;

import com.LLD.adapter.thirdparty.JusPayPG;

public class JusPayPGAdapter implements PaymentGatewayInterface {
    private JusPayPG jusPayPG = new JusPayPG();
    @Override
    public void initiate(String orderNumber) {
        jusPayPG.startPayment(orderNumber);

    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
