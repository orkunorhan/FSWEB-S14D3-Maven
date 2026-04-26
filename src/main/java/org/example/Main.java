package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        Car car1 = new Mitsubishi(4, "Outlander");
        Car car2 = new Holden(6, "Commodore");
        Car car3 = new Ford(8, "Mustang");

        System.out.println(car1.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car3.brake());
        */

        System.out.println("\n");
        System.out.println("company package output:");
        System.out.println("\n");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("\n");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("\n");

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("\n");

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("\n");
        System.out.println("arge package output:");

        CarSkeleton gas = new GasPoweredCar("BMW Gas", "Gas powered car", 12.5, 6);
        CarSkeleton electric = new ElectricCar("Tesla", "Electric car", 500, 100);
        CarSkeleton hybrid = new HybridCar("Toyota", "Hybrid car", 20, 60, 4);

        System.out.println("\n");
        gas.startEngine();
        gas.drive();

        System.out.println("\n");
        electric.startEngine();
        electric.drive();

        System.out.println("\n");
        hybrid.startEngine();
        hybrid.drive();
    }
}