package com.BillZ;

/**
 * Created by Bill on 5/23/17.
 */
//extends keyword allows inheritance to Dog class, needs constructor to work
public class Dog extends Animal {

    //unique characteristics on dogs not on Animal
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //constructor needed to make extends work
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super means to call a constructor from the class we are extending
        //can set values or call in the above constructor, your choice
        super(name, 1, 1, size, weight);
        //these are for the strictly dog paramters
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew was called");
    }


    //override changes a method from a parent to make unique to child
    @Override
    public void eat() {
        System.out.println("Now doggo is eating");
        chew();
        super.eat();
    }


    public void walk(){
        System.out.println("Dog.walk() was called");
        move(5);
    }

    public void run(){
        System.out.println(("Dog.run() was called"));
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() was called");
        moveLegs(speed);
        super.move(speed);
    }
}
