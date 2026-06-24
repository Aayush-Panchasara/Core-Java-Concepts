package corejava;
/* Create programs of all the string methods like charAt(), concat(), equals() etc.*/

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = scanner.next();
        System.out.print("Enter user surname: ");
        String userSurname = scanner.next();

        System.out.println("String Operations\n");
        System.out.println("FullName : " + userName.concat(userSurname));
        System.out.println("Uppercase : " + userName.toUpperCase());
        System.out.println("Lowercase : " + userName.toLowerCase());
        System.out.println("Char at 5th index : " + userName.charAt(5));
        System.out.println("Length : " + userName.length());
        System.out.println("Is username and surname are same? " + userName.equals(userSurname));
    }

}
