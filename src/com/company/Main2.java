package com.company;

interface Movable{
    void move();
}

class Car implements Movable{
    @Override
    public void move() {
        System.out.println("car move");
    }
}

class Plane implements Movable{
    @Override
    public void move() {
        System.out.println("plane fly");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Movable movable = new Car();
        movable.move();
        movable = new Plane();
        movable.move();
    }
}
