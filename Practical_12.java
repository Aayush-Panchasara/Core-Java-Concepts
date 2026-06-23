// Practical 12: Write a program to demonstrate static methods, variables, and blocks.

/**
 * Class to demonstrate the static variables, blocks and methods.
 */
public class Practical_12 {
    
    static String name; // static variable

    static { // static block, Automatically executed when the calss is loaded
        name = "Aayush"; 
    }
/**
 * Static method to say hello with his username
 */
    public static void greet(){ // static method
        System.out.println("Hello "+name);
    }
/**
 * Non-Static method to welcome user with his username
 */
    public void welcome(){ // Non-static method
        System.out.println("Welcome "+name);
    }

    public static void main(String[] args) {
        // We can access all the static variable, methods defined inside a calss without creating an object of that class.

        Practical_12.greet(); 
        // Practical_12.welcome() //It will throw an error

        Practical_12.name = "Ayush"; // Also modify the variable
        Practical_12.greet();


    }
}
