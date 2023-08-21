package com.LLD.deginBird;

public class Sparrow extends Bird implements Flyer,Eater{
    @Override
    void makeSound() {
        System.out.println("Make Sound");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void fly() {
      System.out.println("Fly");
    }
}
