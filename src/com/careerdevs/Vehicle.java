package com.careerdevs;

public class Vehicle {
    private String vehicleMake;
    private String vehicleModel;
    private int idNumber;
    private boolean isRented;

    public Vehicle (String carMake, String carModel, int idNumber) {
        this.vehicleMake = carMake;
        this.vehicleModel = carModel;
        this.idNumber = idNumber;
        this.isRented = false;;

    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getIdNumber(){return idNumber; }

    public boolean isRented() {
        return isRented;
    }
    //Setter
    public void setRented(boolean rented) {
        isRented = rented;
    }
    public String getName() {
        return vehicleMake + " " + vehicleModel;
    }


    //pt  gets public to string.


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", idNumber=" + idNumber +
                ", isRented=" + isRented +
                '}';
    }
}

