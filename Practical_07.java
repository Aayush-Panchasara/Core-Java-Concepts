// Practical 7: Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula)

/**
 * Class for demonstrating the constructor and parameterized constructor
 */
class Calculator{

    int firstPara,secondPara;

    public Calculator(){
        System.out.println("Constructor without any parameter\n");
    }

    
    public Calculator(int firstPara, int secondPara){
        System.out.println("Constructor with parameter\n");
        this.firstPara = firstPara;
        this.secondPara = secondPara;
    }

    /**
     * Calculate the sum of two number
     * @return Sum of two number
     */
    public int CalculateSum(){
        return firstPara+secondPara;
    }
}

public class Practical_07 {
    public static void main(String[] args) {
        Calculator calOne = new Calculator(); //Called constructor without parameter

        Calculator calTwo = new Calculator(10,15); // Called parameterized constructor

        System.out.println("Sum of two numbers: "+calTwo.CalculateSum());
    }
}
