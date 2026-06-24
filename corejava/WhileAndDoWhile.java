package corejava;
/* Write a program to demonstrate the use of while loop and do while loop. (E.g print 1 to 10 numbers).*/

import java.util.Scanner;

public class WhileAndDoWhile {

    /** Demo of while loop @param n counter value*/
    public static void whileLoopDemo(int n){
        int counter = 1;
        System.out.println("While loop demo");
        while(counter <= n){
            System.out.println("Counter " + counter);
            counter++;
        }
    }
    /** Demo of Do-while loop @param n counter value*/
    public static void doWhileLoopDemo(int n){
        int counter = 1;
        System.out.println("Do-while loop demo");
        do {
            System.out.println("Counter " + counter);
            counter++;
        } while (counter <= n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scanner.nextInt();
        whileLoopDemo(input);
        System.out.println();
        doWhileLoopDemo(input);
    }
    
}
