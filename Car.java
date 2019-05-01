package com.company;

public class Car {
    private String carModel;
    private String carType;
    private String carColor;

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }



    public void setSpeed(int speed){
        System.out.println("The "+carColor+" "+carModel+" is " + carType+ " is going "+speed+" MPH");

    }

    public void isStarting (String sta){
        System.out.println("The " + carColor+" "+carModel+" is "+carType+" "+sta);
    }




}
