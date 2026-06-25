package oops;
/*Write a program to add string values(“Hello”,”world”,”$yourname” etc.) in the list and print all the values using an iterator. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Aayush");
        words.add("Panchasara");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
