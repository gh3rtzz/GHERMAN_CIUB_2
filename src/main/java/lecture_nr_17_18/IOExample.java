package lecture_nr_17_18;

import java.io.*;
import java.util.List;

public class IOExample {

    public static void main(String[] args) throws IOException {

        File file1 = new File("src/main/java/lecture_nr_17_18/files/test.txt");

        FileReader reader1 = new FileReader(file1);

        int buff = 0;
        while((buff = reader1.read()) != -1){
            System.out.print((char) buff);
        }

        reader1.close();

        FileReader reader2 = new FileReader(file1);

        char[] charArray = new char[(int) file1.length()];
        reader2.read(charArray);

        reader2.close();
        System.out.println();
        for(char element : charArray){
            System.out.print(element);
        }

//        FileReader reader3 = new FileReader(file1);
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));

        System.out.println("------------- READING USING BUFFERED READER");
        String buff1 = null;
        while((buff1 = bufferedReader1.readLine()) != null){
            System.out.println(buff1);
        }

        bufferedReader1.close();

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file1));

        List<String> allLines = bufferedReader2.lines()
                .toList();

        //WRITER

        File file2 = new File("src/main/java/lecture_nr_17_18/files/testFileToWrite.txt");
        FileWriter fileWriter = new FileWriter(file2, true);

        fileWriter.write("Morning\n");
        fileWriter.append("Hello World!\"");

        fileWriter.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, true));

        bufferedWriter.write("asdasd");
        bufferedWriter.newLine();
        bufferedWriter.close();

        //Working with files


    }
}
