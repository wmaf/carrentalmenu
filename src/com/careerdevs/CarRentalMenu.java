package com.careerdevs;

import java.util.ArrayList;

public class CarRentalMenu {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Honda", "Accord",1);
        Vehicle car2 = new Vehicle("Chevy", "Cruze",2);
        Vehicle car3 = new Vehicle("Toyota","Corolla",3);
        Vehicle car4 = new Vehicle("Chevy", "Volt",4);
        Vehicle truck1 = new Vehicle("Toyota","Tundra",5);
        Vehicle truck2 = new Vehicle("Chevy", "Taho",6);

        ArrayList<Vehicle> availableVehicle = new ArrayList<>();
        ArrayList<Vehicle> unavailableVehicle = new ArrayList<>();

        availableVehicle.add(car1);
        unavailableVehicle.add(truck1);

        System.out.println("Available Cars");

    }

}
