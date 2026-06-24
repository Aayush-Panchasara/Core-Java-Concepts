package corejava;
/*  Write a program to demonstrate static methods, variables, and blocks.*/

public class Static {

    static String name; // static variable

    // static block, Automatically executed when the calss is loaded
    static {
        name = "Aayush";
    }

    /** Static method to say hello with his username */
    public static void greetings() {
        System.out.println("Hello " + name);
    }

    /** Non-Static method to welcome user with his username */
    public void welcome() {
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        // We can access all the static variable, methods defined inside a calss without creating an object of that class.
        Static.greetings();
        Static.name = "Ayush"; // Also modify the variable
        Static.greetings();
    }

}
