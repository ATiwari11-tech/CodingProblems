package com.LLD.observer.after;

public class Order {

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getProdId() {
        return prodId;
    }

    String customerEmail;
    String customerPhone;
    Long orderId;
    Long prodId;

    public String getBody() {
        return body;
    }

    String body;


}
