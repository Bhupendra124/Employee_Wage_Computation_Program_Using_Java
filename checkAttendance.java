package com.EmployeeWage;

public class checkAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome To The Employee Computation Program");

     //using random syntax 0,1
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

}