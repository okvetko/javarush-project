package com.javarush.task.pro.task10.task1002;

/* 
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    private int lavel;
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    private String name;


    public Skyscraper(){
        System.out.println(SKYSCRAPER_WAS_BUILD);

    }

    public Skyscraper(int lavel){
        this.lavel = lavel;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + lavel);
    }

    public Skyscraper(String name){
        this.name = name;
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + name);

    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

