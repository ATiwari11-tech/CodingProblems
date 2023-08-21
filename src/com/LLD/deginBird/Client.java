package com.LLD.deginBird;

public class Client {
    public static void main(String args[]){
        Pigeon p = new Pigeon();
        p.fly();
        Eagle e = new Eagle();
        e.fly();
        e.eat();
        Parrot pr = new Parrot();
        pr.fly();
        pr.eat();
    }
}
