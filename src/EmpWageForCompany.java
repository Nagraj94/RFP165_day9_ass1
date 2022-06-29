public class EmpWageForCompany {
    static int EMP_IS_FULL_DAY = 1;
    static int WAGES_PER_HRS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if (EMP_IS_FULL_DAY == empCheck)
        {
            System.out.println("employee is present for full day");
            empHrs = 8;
        }
        else
        {
            System.out.println("employee is absent");
            empHrs = 0;
        }
        dailyWages = empHrs*WAGES_PER_HRS;
        System.out.println("employee daily wages is: "+ dailyWages);
    }
}
