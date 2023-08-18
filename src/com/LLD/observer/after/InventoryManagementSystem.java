package com.LLD.observer.after;

public class InventoryManagementSystem implements OrderPlacedSubscriber {//Consumer

    public InventoryManagementSystem(Flipkart flipkart){
        flipkart.addSubscriber(this);
    }
    public void updateInventory(Long productId){
        System.out.println("Inventory Mgt. System:Order is placed. Updating Inventory with Product Id:"+productId);

    }

    @Override
    public void onOrderPlaced(Order order) {
        updateInventory(order.prodId);
    }
}
