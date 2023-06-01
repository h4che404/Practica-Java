package org.example;

import Smarts.SmartPhone;
import Smarts.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone iphone1 = new SmartPhone(true, true, 3, "Apple", 3, "Snapdragon635");

        String informacion = iphone1.toString();
        System.out.println(informacion);

        SmartWatch appleWatch = new SmartWatch(true, true, 1, "Apple", "SnapDragon343");

        String informacion1 = appleWatch.toString();
        System.out.println(informacion1);


    }
}