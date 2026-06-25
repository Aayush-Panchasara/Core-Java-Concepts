package oops;
/*Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list. */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {

    /**Remove the duplicate character form the characters Array */
    public static List<String> removeDuplicate(List<String> characters) {
        LinkedHashSet<String> uniqueChar = new LinkedHashSet<>(characters);
        return new ArrayList<>(uniqueChar);
    }

    public static void main(String[] args) {
        List<String> characters = new ArrayList<>();
        characters.add("A");
        characters.add("B");
        characters.add("C");
        characters.add("D");
        characters.add("E");
        characters.add("E");
        characters.add("F");
        characters.add("E");
        characters.add("C");
        characters.add("A");

        System.out.print("Before : ");
        System.out.println(characters);
        List<String> uniqueCharacters = removeDuplicate(characters);
        System.out.print("After : ");
        System.out.println(uniqueCharacters);
    }

}
