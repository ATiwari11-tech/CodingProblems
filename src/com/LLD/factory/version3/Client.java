package com.LLD.factory.version3;

public class Client {
    public static void main(String args[]){
        Database db;//here object should come from some other implementation class
        DatabaseFactory dbf = db.createDatabaseFactory();
        Query q = dbf.createQuery();
    }
}
