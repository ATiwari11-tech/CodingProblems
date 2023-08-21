package com.LLD.deginBird;

public class Pigeon extends Bird implements Flyer,Eater{
    FlyingBehaviour fb = new SlowFlyingBehaviour();
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
        fb.fly();
        System.out.println("Fly");
    }
}
