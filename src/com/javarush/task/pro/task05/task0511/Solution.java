package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        multiArray = new int[length][];
        for (int i = 0; i < multiArray.length; i++) {
            int value = console.nextInt();
            multiArray[i] = new int[value];
        }

    }
}
