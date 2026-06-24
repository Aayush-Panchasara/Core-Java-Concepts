package corejava;
/*Write a program to demonstrate the example of constructor and Parameterized constructor (E.g. Pass two integer parameters and apply any mathematical formula)*/

class Calculator{

    int firstParameter,secondParameter;

    public Calculator(){
        System.out.println("Constructor without any parameter\n");
    }
    public Calculator(int firstParameter, int secondParameter){
        System.out.println("Constructor with parameter\n");
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }
    
    /**Calculate the sum of two number @return Sum of two number */
    public int CalculateSum(){
        return firstParameter + secondParameter;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Calculator calOne = new Calculator(); //Called constructor without parameter
        Calculator calTwo = new Calculator(10,15); // Called parameterized constructor
        System.out.println("Sum of two numbers: " + calTwo.CalculateSum());
    }

}

