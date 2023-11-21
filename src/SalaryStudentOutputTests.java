/**
 * SalaryStudentOutputTests class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the Names class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class SalaryStudentOutputTests {

    public static void main(String[] args) {
        Salary mySalary = new Salary();

        System.out.println("My salary with a £200 increase is "+ mySalary.salaryIncrease(23000)); //Task 1
        System.out.println("My salary with a £200.50 increase is "+ mySalary.salaryIncrease(23000.3)); //Task 2
        System.out.println("My salary with a 10% increase is "+ mySalary.salaryIncrease(20000.00, 10)); //Task 3
        System.out.println("My monthly pay is now "+ mySalary.calculatePay(32000.00)); //Task 4
        System.out.println("My salary is  "+ mySalary.formatCurrency(23000.30)); //Task 5
    }
}
