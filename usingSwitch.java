package com.EmployeeWage;

import java.lang.invoke.SwitchPoint;
    //Using switch case
class usingSwitch {
    public static void main(String[] args) {
        final int Part_Time = 4;
        final int Full_Time = 8;
        int Wage_per_Hr = 20;
        final int empPresent = 1;
        int workingHr = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        final int empParTime = 2;
        //int empcheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case empPresent:

                System.out.println("Employee is Present Full_Time ");
                workingHr = 8;
                break;

            case empParTime:

                System.out.println("Employee is Present  Part_Time");
                workingHr = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage =Wage_per_Hr*workingHr;
        System.out.println("Employee Daily Wages" +wage);

    }

}


