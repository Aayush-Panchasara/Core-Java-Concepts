
// Practical 2: Write a program to demonstrate the use of if / else statements. (E.g Define an 'age' variable and check your age).

import java.util.Scanner;

public class Practical_02 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age > 18) {
            System.out.println("You can Vote!");
        }
        else {
            System.out.println("You cannot Vote!");
        }
    }
}
