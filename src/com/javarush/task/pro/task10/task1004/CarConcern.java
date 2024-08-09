package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public CarConcern(String model, int year) {
        this(model, year, "Оранжевый");
    }

    public CarConcern(String model) {
        this(model, 4321, "Оранжевый");
    }
}