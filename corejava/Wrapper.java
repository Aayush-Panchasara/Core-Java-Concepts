package corejava;
/* Create a practical to compare two variables of Wrapper class using Wrapper classes.*/

public class Wrapper {
    /**
     * Display the result of comparison of two number
     * @param result comparison result  
     * @param numOne first number
     * @param numTwo second number
     */
    public static void displayResult(int result, int numOne, int numTwo){
        if(result > 0){
            System.out.println(numOne + " is greater than " + numTwo);
        }
        else if(result < 0) {
            System.out.println(numOne + " is less than " + numTwo);
        }
        else {
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args) {
        Integer numOne = 100;
        Integer numTwo = 200;

        System.out.println("Comparing with ==");
        System.out.println(numOne == numTwo);
        System.out.println("\nComparing with equals()");
        System.out.println(numOne.equals(numTwo));
        System.out.println("\nComparing with compareTo()");

        int result = numOne.compareTo(numTwo);
        displayResult(result, numOne, numTwo);
    }
    
}
