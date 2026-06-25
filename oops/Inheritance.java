package oops;
/*  Write a program to demonstrate all types of Inheritance concepts like.*/

/*  
    - Single Inheritance
        One
         |
        Two
    
    - Multi-level Inheritance
        One
         |
        Two
         |
        Three

    - Hierarchical Inheritance
        One
        / \
      Two  Four

    - Hybrid Inheritance 
         One
        / \
      Two  Four
       |    |
      Three Five
*/

class One {

    int numOne;

    public One(int input) {
        this.numOne = input;
    }

    public void displayNumber() {
        System.out.println("NumberOne : " + numOne);
    }
}

class Two extends One {

    int numOne, numTwo;

    public Two(int input1, int input2) {
        super(input1);
        this.numTwo = input2;
    }

    public void displayNumber() {
        super.displayNumber();
        System.out.println("NumberTwo : " + numTwo);
    }

}

class Three extends Two {

    int numOne, numTwo, numThree;

    public Three(int input1, int input2, int input3) {
        super(input1, input2);
        this.numThree = input3;
    }

    public void displayNumber() {
        super.displayNumber();
        System.out.println("NumberThree : " + numThree);
    }
}

class Four extends One {

    int numOne, numFour;

    public Four(int input1, int input4) {
        super(input1);
        this.numFour = input4;
    }

    public void displayNumber() {
        super.displayNumber();
        System.out.println("NumberFour : " + numFour);
    }
}

class Five extends Four {

    int numOne, numFour, numFive;

    public Five(int input1, int input4, int input5) {
        super(input1, input4);
        this.numFive = input5;
    }

    public void displayNumber() {
        super.displayNumber();
        System.out.println("NumberFive : " + numFive);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        One one = new One(10);
        one.displayNumber();

        Two two = new Two(10, 20);
        two.displayNumber();

        Three three = new Three(10, 20, 30);
        three.displayNumber();

        Four four = new Four(10, 40);
        four.displayNumber();

        Five five = new Five(10, 40, 50);
        five.displayNumber();
    }

}
