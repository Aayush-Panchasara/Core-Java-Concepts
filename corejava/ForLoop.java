package corejava;
/*  Write a program to demonstrate the example of the ‘for’ loop and print the below-mentioned pattern.*/

import java.util.Scanner;

public class ForLoop {

    /** Print the star pattern in terminal @param input */
    public static void printPattern(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scanner.nextInt();
        printPattern(input);
    }

}
