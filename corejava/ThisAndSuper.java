package corejava;
/* Write a practical to use this/super variable.*/

class Parent {

    int inputOne, inputTwo;

    public Parent() {
        // Here this is use for constructor chaining
        this(10, 15); // called the parameterized constructor
    }

    public Parent(int inputOne, int inputTwo) {
        // Here this is use to distinguish between local variable and parameter
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
    }

    /** Display the numbers in the terminal */
    public void displayNumbers() {
        System.out.println("Number 1: " + inputOne);
        System.out.println("Number 2: " + inputTwo);
    }
}

class Child extends Parent {

    int inputThree;

    public Child(int inputOne, int inputTwo, int inputThree) {
        super(inputOne, inputTwo); // Here super is use to call the parent's constructor
        this.inputThree = inputThree;
    }

    /** Display the numbers in the terminal */
    public void displayNumbers() {
        super.displayNumbers(); // Here super is use to call the parent's method
        System.out.println("Number 3: " + inputThree);
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.displayNumbers();

        Parent parent2 = new Parent(100, 200);
        parent2.displayNumbers();

        Child child = new Child(101, 102, 103);
        child.displayNumbers();
    }

}
