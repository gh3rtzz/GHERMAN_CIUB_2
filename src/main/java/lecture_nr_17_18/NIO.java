package lecture_nr_17_18;

import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class NIO {

    public static void main(String[] args) throws IOException {

        Path file1 = Path.of("src/main/java/lecture_nr_17_18/files/nioTextFile.txt");

        String readFile = Files.readString(file1);
        System.out.println(readFile);

        Files.writeString(file1, "Hello hello!", StandardOpenOption.APPEND);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write something: ");
        String readString = scanner.nextLine();

        Files.writeString(file1, readString);

        Path copyFileDirectory = Path.of("src/main/java/lecture_nr_17_18/copyFile");
        Files.createDirectory(copyFileDirectory);

        Files.copy(file1, Path.of("src/main/java/lecture_nr_17_18/copyFile/copiedFile.txt"));
    }
}
