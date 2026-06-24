package corejava;
/* Create programs to evaluate differences between == and .equals in String, Integer, and BigDecimal? */

import java.math.BigDecimal;

public class CompareToVariable {

    /** Demo of '==' and 'equals()' in String*/
    public static void DemoWIthString(){
        String nameOfManager = "Aayush";
        String nameOfDeveloper = "Aayush";
        System.out.println("String with '=='"); // Compare the memory reference
        System.out.println("nameOfManager == nameOfDeveloper: " + nameOfManager == nameOfDeveloper);
        System.out.println("\nString with 'equals()'"); // Compare the content
        System.out.println("nameOfManager.equals(nameOfDeveloper): " + nameOfManager.equals(nameOfDeveloper));
    }

    /** Demo of '==' and 'equals()' in Integer*/
    public static void DemoWIthInteger(){
        Integer numOfStudent = 200;
        Integer numofEmployee = 200;
        System.out.println("\nInteger with '=='"); //Here the result is different for number between -128 to 127 because of the java caching
        System.out.println(numOfStudent == numofEmployee);
        System.out.println("\nInteger with 'equals()'");
        System.out.println("numOfStudent.equals(numofEmployee): " + numOfStudent.equals(numofEmployee));
    }

    /**Demo of '==' and 'equals()' in BigDecimal*/
    public static void DemoWIthBigDecimal(){
        BigDecimal numOfStudent = new BigDecimal("100")         ;
        BigDecimal numofEmployee = new BigDecimal("100.0");
        System.out.println("\nBigDecimal with '=='");
        System.out.println(numOfStudent == numofEmployee);
        System.out.println("\nBigDecimal with 'equals()'"); // Here equals check value as well as scale
        System.out.println("numOfStudent.equals(numofEmployee): " + numOfStudent.equals(numofEmployee));
    }

    public static void main(String[] args) {
        DemoWIthString();
        DemoWIthInteger();
        DemoWIthBigDecimal();
    }
    
}
