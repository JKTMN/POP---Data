import java.util.Arrays;

/**
 * myArraysStudentOutputTest class
 * YOU SHOULD EDIT THIS CLASS to run the methods of the myArrays class and produce output.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArraysStudentOutputTests {

    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();

        // Task1 test
        System.out.println(myArrays.addUpNumbers(10,20,30,40,50));

        // Task 2 test
        int[] numbers = {10,20,30,40,50};
        System.out.println(myArrays.addUpNumbers(numbers));

        // Task 3 test
        int[] myNumbers = {102, 206, 303, 405, 501};
        System.out.println(myArrays.averageOfNumbers(myNumbers));

        // Task 4 test
        int[] fahrenheit = {70, 65, 84, 90, 45};
        System.out.println(Arrays.toString(myArrays.convertToCelsius(fahrenheit)));
        // Task 5 test
        int[] grades = {64, 55, 45, 67, 65, 88};
        System.out.println(Arrays.toString(myArrays.unitMarks(grades)));
        // Task 6 test
        String[] names = {"suzy", "Tim", "Toyin", "Heather", "Gail", "Melanie"};
        System.out.println(myArrays.andTheWinnerIs(names));
    }
}