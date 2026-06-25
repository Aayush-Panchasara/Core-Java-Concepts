package oops;
/*Write another program using Map and Set concepts. */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAndSet {

    /**Demo of Map */
    public static void mapDemo() {
        Map<Integer, String> userData = new HashMap<>();
        userData.put(101, "Ayush");
        userData.put(102, "Vandaan");
        userData.put(103, "Parth");
        userData.replace(101, "Aayush");
        userData.replace(102, "Vandaan", "Vandan");
        userData.remove(103);

        Iterator<String> itr = userData.values().iterator();
        System.out.println("Map Demo : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    /**Demo of Set */
    public static void setDemo() {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Red");
        colors.remove("Yellow");

        Iterator<String> itr = colors.iterator();
        System.out.println("\nSet Demo : ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        mapDemo();
        setDemo();
    }

}
