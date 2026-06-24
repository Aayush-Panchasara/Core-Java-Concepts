package corejava;
/* Create programs to evaluate differences between == and .equals in String, Integer, and BigDecimal? */

import java.math.BigDecimal;

public class CompareToVariable {

    /** Demo of '==' and 'equals()' in String*/
    public static void DemoWIthString(){
        String nameOne = "Aayush";
        String nameTwo = "Aayush";
        System.out.println("String with '=='"); // Compare the memory reference
        System.out.println("nameOne == nameTwo: " + nameOne == nameTwo);
        System.out.println("\nString with 'equals()'"); // Compare the content
        System.out.println("nameOne.equals(nameTwo): " + nameOne.equals(nameTwo));
    }
    /** Demo of '==' and 'equals()' in Integer*/
    public static void DemoWIthInteger(){
        Integer numOne = 200;
        Integer numTwo = 200;
        System.out.println("\nInteger with '=='"); //Here the result is different for number between -128 to 127 because of the java caching
        System.out.println(numOne == numTwo);
        System.out.println("\nInteger with 'equals()'");
        System.out.println("numOne.equals(numTwo): " + numOne.equals(numTwo));
    }
    /**Demo of '==' and 'equals()' in BigDecimal*/
    public static void DemoWIthBigDecimal(){
        BigDecimal numOne = new BigDecimal("100")         ;
        BigDecimal numTwo = new BigDecimal("100.0");
        System.out.println("\nBigDecimal with '=='");
        System.out.println(numOne == numTwo);
        System.out.println("\nBigDecimal with 'equals()'"); // Here equals check value as well as scale
        System.out.println("numOne.equals(numTwo): " + numOne.equals(numTwo));
    }
    public static void main(String[] args) {
        DemoWIthString();
        DemoWIthInteger();
        DemoWIthBigDecimal();
    }
    
}
