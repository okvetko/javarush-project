package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;



    public void setSalary(int newsalary) {
        if (newsalary > salary){
            salary = newsalary;
        }

    }

    public int getSalary(){
        return salary;
    }

}
