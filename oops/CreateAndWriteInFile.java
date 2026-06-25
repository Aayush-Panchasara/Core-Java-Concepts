package oops;
/*Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file. */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateAndWriteInFile {

    public static void main(String[] args) {
        try {
            File file = new File("myTestFile.txt");
            if (file.createNewFile()) {
                System.out.println("New File created Successfully");
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Hello Everyone\n");
            bw.write("My self Aayush Panchasara\n");
            bw.write("I am Java Developer\n");
            bw.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

}
