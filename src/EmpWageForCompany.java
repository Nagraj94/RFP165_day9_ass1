public class EmpWageForCompany {
    final static int EMP_IS_FULL_DAY = 1;
    final static int EMP_IS_HALF_DAY = 2;
    static int WAGES_PER_HRS = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int dailyWages = 0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck){
            case  EMP_IS_FULL_DAY :
                System.out.println("employee is present for full day");
                empHrs = 8;
                break;
            case  EMP_IS_HALF_DAY:
                System.out.println("employee is present for half day");
                empHrs = 4;
                break;
            default:
                System.out.println("employee is absent");
                empHrs = 0;break;
        }
        dailyWages = empHrs*WAGES_PER_HRS;
        System.out.println("employee daily wages is: "+ dailyWages);
    }
}
