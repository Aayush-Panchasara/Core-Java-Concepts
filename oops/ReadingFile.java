package oops;
/*Write a program to read the data from a myTestFile file (Using File Handling, Input Handling, Loops, String Handling, and Exception Handling).*/

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFile {

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("myTestFile.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

}
