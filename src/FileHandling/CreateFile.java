package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    Create a new file using createNewFile method
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("C:\\Users\\acer\\IdeaProjects\\javaprogram\\src\\FileHandling\\first.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("file created successfully");
            } else {
                System.out.println("file already exit");
            }
        }
        catch (IOException i){
            System.out.println("Exception Handled");
        }

         */
        // Code write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("first.txt");
            fileWriter.write("Hi Raj how are you, I am good now what are you doing \nok now by");
            fileWriter.close();

        }
        catch (IOException i){
            i.printStackTrace();
        }

         */
        // Reading a file
/*
            File myFile = new File("first.txt");
        try {
            Scanner scanObj = new Scanner(myFile);
            while(scanObj.hasNextLine()){
                String line = scanObj.nextLine();
                System.out.println(line);
            }
            scanObj.close();
        }
        catch (IOException i){
            i.printStackTrace();
        }

 */

        //Delete a file

        File myfile = new File("first.txt");

            if (myfile.delete()){
                System.out.println("I have deleted: " + myfile.getName());

            }
            else {
                System.out.println("Some accoured while deleting the file");

            }


        }

            {
        }




    }

