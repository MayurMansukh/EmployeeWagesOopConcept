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
        int empWage=0;
        int FUllTimeEmpHrs =0;
        int PartTimeEmpHrs =0;
        int totalMonthWage;
        int empCheck = (int)Math.floor(Math.random() * 10 % 3 );

            switch (empCheck)
            {
                case 1 :
                    FUllTimeEmpHrs=12;
                    empWage=dMart.empRatePerHour*FUllTimeEmpHrs;
                    totalMonthWage = empWage * dMart.numOfWorkingDays;
                    System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
                    System.out.println("Employee wage for a month is: "+ totalMonthWage);
                    break;
                case 2:
                    PartTimeEmpHrs=8;
                    empWage=dMart.empRatePerHour*PartTimeEmpHrs;
                    totalMonthWage = empWage * dMart.numOfWorkingDays;
                    System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
                    System.out.println("Employee wage for a month is: "+ totalMonthWage);
                    break;
                default:
                    System.out.println("Employee is absent");

            }



    }


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
        int empWage=0;
        int FUllTimeEmpHrs =0;
        int PartTimeEmpHrs =0;
        int totalMonthWage;
        int empCheck = (int)Math.floor(Math.random() * 10 % 3 );

            switch (empCheck)
            {
                case 1 :
                    FUllTimeEmpHrs=12;
                    empWage=dMart.empRatePerHour*FUllTimeEmpHrs;
                    totalMonthWage = empWage * dMart.numOfWorkingDays;
                    System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
                    System.out.println("Employee wage for a month is: "+ totalMonthWage);
                    break;
                case 2:
                    PartTimeEmpHrs=8;
                    empWage=dMart.empRatePerHour*PartTimeEmpHrs;
                    totalMonthWage = empWage * dMart.numOfWorkingDays;
                    System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
                    System.out.println("Employee wage for a month is: "+ totalMonthWage);
                    break;
                default:
                    System.out.println("Employee is absent");

            }



    }


