public class EmpWageForCompany {
    final static int EMP_IS_FULL_DAY = 1;
    final static int EMP_IS_HALF_DAY = 2;
    static int TOTAL_WORKING_HRS = 100;
    static int WORKING_DAYS_PER_MONTH = 20;
    static int WAGES_PER_HRS = 20;


    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        int wagesPerMonth = 0;
        int totalDays = 0;
        int totalHrs = 0;
        while (totalDays <= WORKING_DAYS_PER_MONTH && totalHrs <= TOTAL_WORKING_HRS) {
            totalDays ++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case EMP_IS_FULL_DAY:
                    System.out.println("day: "+totalDays+" employee is present for full day");
                    empHrs = 8;
                    break;
                case EMP_IS_HALF_DAY:
                    System.out.println("day: "+totalDays+"employee is present for half day");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("day: "+totalDays+"employee is absent");
                    empHrs = 0;
                    break;
            }
            totalHrs +=empHrs;
            System.out.println("total employee hrs is: " + totalHrs);
        }
        wagesPerMonth = totalHrs * WORKING_DAYS_PER_MONTH;
        System.out.println("employee wages per month is: "+ wagesPerMonth);
    }
}
