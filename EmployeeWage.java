public class EmployeeWage
{

    public static final int IS_FULL_TIME =1;
    public static final int IS_PART_TIME =2;

    private final String Company;
    private final int empRatePerHour ;
    private final int numOfWorkingDays ;
   

    EmployeeWage(String Company, int empRatePerHour, int numOfWorkingDays)
    {

        this.Company = Company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        

    }

    public static void main(String[] args)
    {

        EmployeeWage dMart = new EmployeeWage("Dmart",20,20);

        int empHrs =0;
        int empWage=0;
        int TotalEmpWage=0;
        int TotalEmpWageP=0;
        int TotalWorkingHours=0;
        int day =0;
        int partTimeWage=0;
        while( day < dMart.numOfWorkingDays )
        {
            double empCheck = Math.floor(Math.random() * 10 % 3 );
            day++;
            switch ((int)empCheck)
            {
                case IS_FULL_TIME:
                    empHrs=12;
                    break;
                case IS_PART_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs =0;

            }

            TotalWorkingHours+=empHrs;
            if (empCheck==IS_PART_TIME)
            {
                partTimeWage=empHrs*dMart.empRatePerHour;
            }
            empWage = empHrs*dMart.empRatePerHour;
            TotalEmpWageP+= partTimeWage;
            TotalEmpWage+= empWage;
        }
        System.out.println("Total partTime Emp wage :"+ TotalEmpWageP);
        System.out.println("Total FullTime Emp wage :"+ TotalEmpWage);

    }


}