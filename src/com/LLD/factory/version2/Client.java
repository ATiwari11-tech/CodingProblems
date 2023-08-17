package com.LLD.factory.version2;

public class Client {
    public static void main(String args[]){
        Database db = null;//will come from different implementation class
        Query q = db.createQuery();
    }
}
