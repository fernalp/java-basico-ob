package com.openbootcamp.ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartPhone = new SmartPhone("Apple","SE","Blanco",8,128,"M1","iOS 15");
        SmartDevice smartWatch = new SmartWatch("Xiaomi","Mi Band 3","Blanco","Bluetooth",false,true,true);

        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}
