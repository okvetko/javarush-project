//package com.javarush.task.pro.task09.task0907;
//
//import java.util.regex.Pattern;
//
///*
//Шестнадцатеричный конвертер
//*/
//
//public class Solution {
//    private static final String HEX = "0123456789abcdef";
//
//    public static void main(String[] args) {
//        int decimalNumber = 1256;
//        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
//        String hexNumber = "4e8";
//        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
//    }
//
//    public static String toHex(int decimalNumber) {
//        if(decimalNumber <=0){
//            return "";
//        }
//        String result = "";
//        char[] characters = HEX.toCharArray();
//        while(decimalNumber != 0){
//            for (int i = 0; i < characters.length(); i++) {
//                //int index = characters[i].length();
//
//                if((characters[i]-'0') % 16 == characters[i])
//             result = characters[i] + result;
//                decimalNumber = decimalNumber/16;
//
//                }
//            }
//
//        }
//
//        return result;
//    }
//
//    public static int toDecimal(String hexNumber) {
//        if(hexNumber == null || hexNumber.equals("")){
//            return 0;}
//        int result = 0;
//        char[] characters = HEX.toCharArray();
//        for (int i = 0; i < characters.length(); i++){
//            result = 16 * result + characters[i];
//        }
//        return result;
//    }
//}
