package com.BillZ;

/**
 * Created by Bill on 5/25/17.
 */
public class Car extends Vehicle {

    public Car(int engine, String name, int weight, int speed) {
        super(engine, name, weight, speed);
    }

    int gear;

    public void shiftGearUp(int gear){
        gear++;
        System.out.println("You shifted the gear up to: " + gear);
    }



}
