package com.bridgelabz;

public class EmpWageForCompany {

    final static int EMP_IS_FULL_DAY = 1;
    final static int EMP_IS_HALF_DAY = 2;

    private final String company;
    private final int empRatePerHrs;
    private final int numWorkingDays;
    private final int maxHrsPerMonth;

    public EmpWageForCompany(String company, int empRatePerHrs, int numWorkingDays, int maxHrsPerMonth){
        this.company = company;
        this.empRatePerHrs = empRatePerHrs;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public static void main(String[] args) {
        EmpWageForCompany dmart = new EmpWageForCompany("D-mart",33,25,150);
        EmpWageForCompany reliance = new EmpWageForCompany("Reliance",44,20,100);

        int empHrs = 0;
        int dailyWages = 0;
        int wagesPerMonth = 0;
        int totalDays = 0;
        int totalHrs = 0;
        while (totalDays < dmart.numWorkingDays && totalHrs < dmart.maxHrsPerMonth) {
            totalDays ++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case EMP_IS_FULL_DAY:
                    System.out.println("day: "+totalDays+" employee is present for full day");
                    empHrs = 8;
                    break;
                case EMP_IS_HALF_DAY:
                    System.out.println("day: "+totalDays+" employee is present for half day");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("day: "+totalDays+" employee is absent");
                    empHrs = 0;
                    break;
            }
            totalHrs +=empHrs;
            System.out.println("total employee hrs is: " + totalHrs);
        }
        wagesPerMonth = totalHrs * dmart.empRatePerHrs;
        System.out.println(dmart.company+" employee wages per month is: "+ wagesPerMonth);
    }

}
