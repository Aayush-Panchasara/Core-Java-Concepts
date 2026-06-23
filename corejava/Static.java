package corejava;
/*  Write a program to demonstrate static methods, variables, and blocks.*/

/**
 * Class to demonstrate the static variables, blocks and methods.
 */
public class Static {
    
    static String name; // static variable

    static { // static block, Automatically executed when the calss is loaded
        name = "Aayush"; 
    }
/**
 * Static method to say hello with his username
 */
    public static void greet(){ // static method
        System.out.println("Hello " + name);
    }
/**
 * Non-Static method to welcome user with his username
 */
    public void welcome(){ // Non-static method
        System.out.println("Welcome " + name);
    }
    public static void main(String[] args) {
        // We can access all the static variable, methods defined inside a calss without creating an object of that class.

        Static.greet(); 
        // Practical_12.welcome() //It will throw an error
        Static.name = "Ayush"; // Also modify the variable
        Static.greet();
    }
    
}

