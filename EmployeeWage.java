public class EmployeeWage {

    public void check() {
        int IS_PRESENT = 1;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage computation");
        EmployeeWage obj =new EmployeeWage();
        obj.check();
    
    }
}
