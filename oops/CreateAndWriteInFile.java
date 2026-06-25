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

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Hello Everyone\n");
            bufferedWriter.write("My self Aayush Panchasara\n");
            bufferedWriter.write("I am Java Developer\n");
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }

}
