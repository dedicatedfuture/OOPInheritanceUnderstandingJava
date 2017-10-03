package com.BillZ;

/**
 * Created by Bill on 5/25/17.
 */
public class HondaCivic extends Car{

    public HondaCivic(int engine, String name, int weight, int speed) {
        super(engine, name, weight, speed);
    }

    public static void horn(){
        System.out.println("Honda Civic goes HONK HONK!");
    }

}
