package com.BillZ;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "shiny");

        dog.eat();
        dog.walk();
        dog.run();

        Vehicle boat = new Vehicle(4,"BoatFace", 300, 20);

        System.out.println(boat.getEngine() + boat.getName() + boat.getWeight() + boat.getSpeed());

        Car pontiac = new Car(1, "Krista's Whip", 250, 100);

        System.out.println(pontiac.getEngine() + pontiac.getName() + pontiac.getSpeed() + pontiac.getSpeed());

        HondaCivic billsCar = new HondaCivic(1, "Betsy", 280, 5000);

        billsCar.shiftGearUp(3);
        billsCar.horn();


    }
}
