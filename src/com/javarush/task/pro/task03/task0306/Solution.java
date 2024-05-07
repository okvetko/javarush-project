package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a =  console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if (((a + b) <= c) || ((a + c) <= b) || (((b + c) <= a))) {
            System.out.println("треугольник не существует");
        } else {
            System.out.println("треугольник существует");
        }

    }
}
