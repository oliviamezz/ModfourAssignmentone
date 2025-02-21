public class Calc {
   //declare double num1 and num2
    private double num1;
    private double num2;

    //default constructor
    public Calc() {
        this.num1 = 0;
        this.num2 = 0;
    }//ends default constructor

    //setter
    public void setNum1(double num1) {
        this.num1 = num1;
    }//ends setter 1

    //setter
    public void setNum2(double num2) {
        this.num2 = num2;
    }//ends setter 2

    //getter
    public double getNum1() {
        return num1;
    }//ends getter 1

    public double getNum2() {
        return num2;
    }//ends getter 1

    public double add() {
        return num1 + num2;
    }//ends add method

    public double subtract() {
        return num1 - num2;
    }//ends subtract method

    public double multiply() {
        return num1 * num2;
    }//ends multiply method

    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; //return 0
        }//end if statement

        return num1 / num2;
    }//ends divide method

    public String toString() {
        return "Displaying private data fields:\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }//ends toString()

}//ends Calc class


