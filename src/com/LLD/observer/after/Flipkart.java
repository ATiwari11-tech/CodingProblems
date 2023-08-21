package com.LLD.observer.after;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {//Producer/Creator
   List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

   public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
       orderPlacedSubscribers.add(orderPlacedSubscriber);
   }
    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
    public void orderPlaced(Order order){
       for(OrderPlacedSubscriber orderPlacedSubscriber:orderPlacedSubscribers){
           orderPlacedSubscriber.onOrderPlaced(order);
       }
    }
}
//Objective now is how can we avoid opening Flipkart Class when any service wants to subscribe when order is placed
//Go to after package
