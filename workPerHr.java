package com.EmployeeWage;

public class workPerHr {
    public static void main(String args[]){
        int Part_Time=4;
        int Full_Time=8;
        int Wage_per_Hr=20;
        int empPresent=1;
        int empCheck = (int)Math.floor(Math.random() * 100) % 2;
        int empParTime=2;
        int empcheck = (int)Math.floor(Math.random() * 10) % 3;

        if (  empCheck == empPresent)
        {
            int dailyWage=Wage_per_Hr*Full_Time;
            System.out.println("Employee is Present ");
            System.out.println("Employee is Full_Time " +dailyWage);
        }
        else if (empcheck == empParTime)
        {
            int dailyWage=Wage_per_Hr*Part_Time;
            System.out.println("Employee is Present  ");
            System.out.println("Employee is Part_Time "+ dailyWage);
        }
        else {
            System.out.println("Employee is Absent");
        }
        }
}

