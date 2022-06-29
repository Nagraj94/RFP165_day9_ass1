public class EmpWageForCompany {
    static int EMP_PRESENT = 1;
    public static void main(String[] args) {
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        if (EMP_PRESENT == empCheck)
        {
            System.out.println("employee is present");
        }
        else
        {
            System.out.println("employee is absent");
        }
    }
}
