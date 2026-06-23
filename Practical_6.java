// Practical 6: Write a program to demonstrate the example of a break/Continue statement (E.g. Use the loop for 10 numbers and stop the execution after 7 numbers and skip any number).


public class Practical_6 {
    /**
     * Demo of break keyword
     * @param input 
     */
    public static void breakDemo(int input){
        System.out.println("Break demo\n");
        for (int i = 0; i <= input; i++) {
            if(i == 7){
                break; // break the loop when variable i becomes 7.
            }
            System.out.println("Counter"+ i);
        }
        System.out.println();
    }
    /**
     * Demo of continue keyword
     * @param input
     */
    public static void continueDemo(int input){
        System.out.println("continue demo\n");
        for (int i = 0; i <= input; i++) {
            if(i == 7){
                continue; // skip the rest of the code when i becomes 7.
            }
            System.out.println("Counter"+ i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        breakDemo(10);
        continueDemo(10);

    }
}
