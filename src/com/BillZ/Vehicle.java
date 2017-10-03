package com.BillZ;

/**
 * Created by Bill on 5/25/17.
 */
public class Vehicle {
    private int engine;
    private String name;
    private int weight;
    private int speed;



    public Vehicle(int engine, String name, int weight, int speed) {
        this.engine = engine;
        this.name = name;
        this.weight = weight;
        this.speed = speed;

    }

    public void speedUp(int speed){
        speed++;
        System.out.println("speeding up to: " + speed);
    }

    public void slowDown(int speed){
        speed--;
        System.out.println("slowing down to: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public int getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
