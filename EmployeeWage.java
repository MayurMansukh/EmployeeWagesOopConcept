public class EmpWageBuilderMethod {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String Company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;


    EmpWageBuilderMethod(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        this.Company = Company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;

    }


    private String computeEmpWage() {


        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int TotalWorkingHours = 0;
        int day = 0;

        while (day < numOfWorkingDays || TotalWorkingHours <= maxHoursPerMonth) {
            double empCheck = Math.floor(Math.random() * 10 % 3);
            day++;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;

            }
            TotalWorkingHours += empHrs;

            System.out.println("Day:" + totalWorkingDays + "Emp Hr : " + empHrs);

        }
        totalEmpWage = totalEmpHrs * empRatePerHour;

        public String toString () {


            return "TotalEmpWage for comany : " + Company + " is" + totalEmpWage;

        }
    }
    public static void main(String[] args)
    {

        EmpWageBuilderMethod dMart = new EmpWageBuilderMethod("Dmart",20,20,100);
        EmpWageBuilderMethod Realiance = new EmpWageBuilderMethod("Realiance",30,20,80);
        dMart.computeEmpWage();
        Realiance.computeEmpWage();
        System.out.println(dMart);
        System.out.println(Realiance);
    }


}