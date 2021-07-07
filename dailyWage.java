package com.EmployeeWage;

class dailyWage {
    public static void main(String[] args) {


        int Full_Time=8;
        int Wage_per_Hr=20;
        int empPresent=1;
        //using random syntax which show Employee Present or Absent
        int empCheck = (int)Math.floor(Math.random() * 10) % 2;
        if (  empCheck == 1)
            if (  empCheck == empPresent){
                int dailyWage = Full_Time*Wage_per_Hr;   //calculating wage
                System.out.println("Employe is Present");
                System.out.println("Employee daily wage is    " +  dailyWage);
            }
            else
            {

                System.out.println("Employee is Absent");
            }

    }
}



