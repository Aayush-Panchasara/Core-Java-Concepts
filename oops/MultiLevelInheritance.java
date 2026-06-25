package oops;
/*Program to demonstrate Multi-Level Inheritance */

class BasicCalculator {

    public void doBasicCalculation() {
        System.out.println("I can do basic calculation.");
    }
}

class AdvancedCalculator extends BasicCalculator {

    public void doAdvancedCalculation() {
        System.out.println("I can do advanced calculation.");
    }
}

class ScientificCalculator extends AdvancedCalculator {

    public void doScientificCalculation() {
        System.out.println("I can do scientific calculation.");

    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        ScientificCalculator ms82Calculator = new ScientificCalculator();
        ms82Calculator.doBasicCalculation();
        ms82Calculator.doAdvancedCalculation();
        ms82Calculator.doScientificCalculation();
    }

}
