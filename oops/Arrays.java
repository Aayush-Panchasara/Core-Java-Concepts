package oops;
/*Write a program to find the index of an array element. */

public class Arrays {

    /**
     * It will find the index of an element. If element is present in the array than it will return the index otherwise return -1
     * @param numbers Array of integers
     * @param element Value of element
     * @return Index of an element otherwise return -1.
     */
    public static int findIndex(int[] numbers, int element) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Index of 4 : " + findIndex(numbers, 4));
        // Here result is -1 means the element is not present in the array.
        System.out.println("Index of 20 : " + findIndex(numbers, 20));
    }

}
