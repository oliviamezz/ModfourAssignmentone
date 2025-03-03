//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);
        double n1 = 0, n2 = 0;

        //get user input for two numbers + getValidNum check for valid input
        n1 = getValidNum(scan, "Please enter the first number: ");
        n2 = getValidNum(scan, "Please enter the second number: ");

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }


    private static double getValidNum(Scanner scan, String prompt) {
        //establishes double number value
        double number;
        //while loop
        //If user inputs numbers it will continue program, if not Invalid message appears
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                scan.nextLine();
                break;
            } //if statement
            //else for is input is invalid
            else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next();
            }//ends else statement
        }//ends while loop
        return number;
    }//ends getValidNum
}//ends runner class

