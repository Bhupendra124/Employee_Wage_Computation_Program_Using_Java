package com.EmployeeWage;

public class totalWorkingZero {
    public static void main(String[] args) {
        int Full_Time=8;
        int Part_Time=4;
        int WagePerHr=20;
        int day=0;
        int empHr=0;
        int wage = 0;
        while (day <= 19) {
            int n = (int) (Math.random() * 10) % 3;
            switch (n) {
                case 1:
                    System.out.println("present fullday");
                    wage = (wage + (WagePerHr * Full_Time));
                    empHr=(empHr+ Full_Time);
                    day++;
                    break;
                case 2:
                    System.out.println("present PartTime");
                    wage = (wage + (WagePerHr * Part_Time));
                    empHr=(empHr+ Part_Time);
                    day++;
                    break;
                default:
                    System.out.println("absent");
                    day++;
                    if( empHr == 100)
                        break;
            }
        }
        System.out.println("total wage of a month is");
        System.out.println(wage);
        System.out.println(empHr);
        System.out.println(day);
    }

}


