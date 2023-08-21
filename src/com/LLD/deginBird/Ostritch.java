package com.LLD.deginBird;

public class Ostritch extends Bird implements Eater{
    @Override
    void makeSound() {
        System.out.println("Make Sound");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}
