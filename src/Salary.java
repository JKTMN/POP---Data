import java.text.DecimalFormat;

/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

	/** salaryIncrease()
	 * takes a salary input and increases it by 200
	 * returning it at the end
	 *
	 * @param salary takes a salary as an int
	 * @return the salary plus 200
	 */
  	 public int salaryIncrease(int salary) {
  		 return salary + 200;
	}

	/** salaryIncrease()
	 * takes a salary input and increases it by 200.50,
	 * returning it at the end
	 *
	 * @param salary takes a salary as an int
	 * @return the salary plus 200.50
	 */
    public double salaryIncrease(double salary) {
        return salary + 200.50;
	}

	/** salaryIncrease()
	 * Takes two inputs, the salary and the salary increase as a percentage,
	 * it then increases the salary by the percentage
	 *
	 * @param salary the base salary
	 * @param salaryIncrease the percentage to increase the salary by
	 * @return the salary with the salary increase equation
	 */
    public double salaryIncrease(double salary, double salaryIncrease) {
        return salary / 100 * salaryIncrease + salary;
	}

	/** calculatePay()
	 * takes a yearly salary input, puts it through an
	 * equation to find the monthly pay after tax and pension
	 *
	 * @param salary the yearly salary that gets inputted
	 * @return the monthly pay after tax and pension
	 */
    public double calculatePay(double salary) {
        double tax = (salary / 100 * 15);		// sets the tax equation
        double pension = (salary / 100 * 13);		// sets the pension equation
        return ((salary - tax - pension) / 12);		// returns the salary with the tax and pension deductions
	}

	/** formatCurrency()
	 * takes a salary input and correctly formats it using DecimalFormat,
	 * the format adds a comma and decimal place in the correct place and
	 * rounds the salary to two decimal places. a £ is also added
	 *
	 * @param salary the salary input
	 * @return the salary formatted correctly with the £ sign
	 */
	public String formatCurrency(double salary) {
		DecimalFormat formatCurrency = new DecimalFormat("##,##0.00");//creating the format using the decimal format method

		return "£" + formatCurrency.format(salary);
	}
}
