package lecture_nr_17_18;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class IOExample2 {

    public static void main(String[] args) throws IOException {
        File filesDirectory = new File("src/main/java/lecture_nr_17_18/files");

        System.out.println(filesDirectory.isDirectory());

        if(filesDirectory.isDirectory()){

            Arrays.stream(filesDirectory.listFiles())
                    .map(e -> e.getName())
                    .forEach(e -> System.out.println(e));
        }

        //Need to print out all csv file names

        System.out.println("-----------------");

        if(filesDirectory.isDirectory()){

            Arrays.stream(filesDirectory.list())
                    .filter(e -> e.endsWith(".csv"))
                    .forEach(e -> System.out.println(e));
        }

        //Check if a directory or a file exists

        System.out.println("Does the directory exist?" + filesDirectory.exists());

        //Check file permissions

        File datasheetFile = new File("src/main/java/lecture_nr_17_18/files/datasheet1.csv");

        System.out.println(datasheetFile.canRead());
        System.out.println(datasheetFile.canWrite());
        System.out.println(datasheetFile.canExecute());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write something: ");
        String readString = scanner.nextLine();

        BufferedWriter buffWriter1 = new BufferedWriter(new FileWriter("src/main/java/lecture_nr_17_18/files/test.txt"));

        buffWriter1.write(readString);

        buffWriter1.close();
    }
}
