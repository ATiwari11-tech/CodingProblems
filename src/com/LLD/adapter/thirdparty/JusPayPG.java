package com.LLD.adapter.thirdparty;

import java.util.UUID;

public class JusPayPG {//Third Party Code which we don't have control
    public boolean startPayment(String orderNumber){
        System.out.println("Payment Started Using Jus Pay");
        return true;
    }
}
