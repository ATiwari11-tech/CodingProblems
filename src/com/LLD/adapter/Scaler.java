package com.LLD.adapter;

import com.LLD.adapter.thirdparty.RazorPG;

import java.util.List;

public class Scaler {
//    RazorPG razorPG = new RazorPG();
//    PaymentGatewayInterface paymentGateway = new RazorPayPGAdapter();
    //OR
    //PaymentGatewayInterface paymentGateway;
    //OR
    List<PaymentGatewayInterface> paymentGateways;
    Scaler(List<PaymentGatewayInterface> paymentGateways){
        this.paymentGateways = paymentGateways;
    }
    void admitStudent(){
//        razorPG.initiatePayment("12345678");//if i need to migrate from razor pay 3rd part to some other payment
        //gateway then it will be a problem
        //this also violates 'D' of SOLID i.e. Dependency Inversrion
//        paymentGateway.initiate("12345678");
        paymentGateways.get(0).initiate("12323423");
    }
}
