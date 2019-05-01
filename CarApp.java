package com.company;

public class CarApp {


    public static void main(String[] args) {
        Car newCar = new Car();

        newCar.setCarModel("Porches");
        newCar.setCarType("suv");
        newCar.setCarColor("red");
        newCar.isStarting("starting");
        newCar.setSpeed(50);


        newCar.setCarModel("Toyota");
        newCar.setCarType("sedan");
        newCar.setCarColor("yellow");
        newCar.isStarting("accelerating");
        newCar.setSpeed(100);

}


}



