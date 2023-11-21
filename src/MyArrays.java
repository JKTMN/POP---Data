import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;

/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArrays {

	/** addUpNumbers()
	 * This method takes a group of doubles and returns the sum of them
	 *
	 * @param num1 first number input
	 * @param num2 second number input
	 * @param num3 third number input
	 * @param num4 fourth number input
	 * @param num5 fifth number input
	 * @return returns the sum of the numbers
	 */
	 public double addUpNumbers(double num1, double num2, double num3, double num4, double num5) {
		return num1+num2+num3+num4+num5;		//returns the sum of the numbers
	}

	/** addUpNumbers()
	 * this method takes an array of ints and returns the sum of them
	 *
	 * @param numbers the array storing the numbers
	 * @return the sum of the numbers
	 */
	 public int addUpNumbers(int[] numbers) {
         return numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];		//returns the sum of the numbers from the array
	}

	/** averageOfNumbers()
	 * takes an array of ints, calculates the sum and finds the average using the .length method
	 *
	 * @param myNumbers the array storing the numbers
	 * @return the average of the numbers
	 *
	 */
	 public double averageOfNumbers(int[] myNumbers) {
		 double total = myNumbers[0]+myNumbers[1]+myNumbers[2]+myNumbers[3]+myNumbers[4];			//puts the sum of the array into a total variable
		 double count = myNumbers.length;		//puts the length of the array into a variable called count
		return total / count;		//returns the total divided by count
	}

	/** convertToCelsius()
	 * takes an array of temperatures and puts them through an equation and stores the results in a new array
	 *
	 * @param fahrenheit the array storing the temperatures
	 * runs a for each loop which goes through the temperatures in the array
	 * puts the temperature through the conversion equation and adds it to the new array
	 *
	 * @return the new array
	 */
	 public int[] convertToCelsius(int[] fahrenheit) {
		 int[] celsius = new int[fahrenheit.length]; //creates new empty array using the length of fahrenheit array for the length
		 int index = 0;
		 for (int temp: fahrenheit) {			//creates a for loop with the limit of the fahrenheit array length
			 celsius[index] = ((fahrenheit[index] - 32) * 5) /9;
			 //puts fahrenheit through the equation and into the new celsius array
			 index++;
		 }
		return celsius;
	 }

	/** unitMarks()
	 * takes an array storing some grades and puts them into a new array formatted with the unit code and a colon
	 * and adds an average at the end
	 *
	 * @param grades the array storing the grades
	 * a for each loop which cycles through the grades
	 * formats the output for the new array using the unit code + : + grades
	 * adds this output to the new array
	 * adds the grade to a sum variable
	 * outside the loop it creates an average variable which is the sum divided by the length method
	 * adds the formatted average to the new array
	 *
	 * @return the new array
	 */
	 public String[] unitMarks(int[] grades) {
		 String[] unitCodes = {"APP", "BSAD", "CF", "DAD", "N&CS", "POP"};			//array storing unit codes
		 String[] gradesOutput = new String[7];			// empty array
		 double sum = 0;
		 int index = 0;
		 for (double grade: grades){			//a for loop which puts the unit code+ grade into the new array
			 String output = unitCodes[index] + ":" + grades[index];
			 gradesOutput[index] = output;
			 sum += grades[index];
			 index++;
		 }
		 double average = sum / grades.length;
		 gradesOutput[6] = "Average" + ":" + average;			//works out the average of the grades and stores it into the array
		 return gradesOutput;
	}

	/** andTheWinnerIs()
	 * takes an array of names as an input, creates a random number generator based on the array length
	 * the number generated is the index for the array
	 * 
	 * @param names the array of names
	 * @return the name from index
	 */
	 public String andTheWinnerIs(String[] names) {
		 Random randomNumberGenerator = new Random();
		 int winnerIs = randomNumberGenerator.nextInt(names.length); //creates random number generator and picks a number
		return names[winnerIs];			//returns the winner
	}
}
