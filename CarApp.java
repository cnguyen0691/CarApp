package com.company;

import java.util.ArrayList;

public class CarApp {


    public static void main(String[] args) {
        ArrayList<Car>cars = new ArrayList<>();

        Car newCar = new Car();

        newCar.setCarModel("Porches");
        newCar.setCarType("suv");
        newCar.setCarColor("red");
        newCar.isStarting("starting");
        newCar.setSpeed(50);

        Car car = new Car();
        car.setCarModel("Toyota");
        car.setCarType("sedan");
        car.setCarColor("yellow");
        car.isStarting("accelerating");
        car.setSpeed(100);

        cars.add(newCar);
        cars.add(car);
        for (Car c: cars){
            System.out.println(c.getCarColor());
        }
}


}



