package lecture_nr_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionMain {

    public static void main(String[] args) {

        File file = new File("not_existing_file.txt");

        //Checked FileNotFoundException
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {

        }

        //Unchecked InputMissmatchException
        Scanner s = new Scanner(System.in);
        s.nextInt();
    }
}
