package lecture_nr_17_18;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {


    //I need to create 100 files in a directory called massiveDirectory
    //Then I need to fill in the files with a random number of string between 500 and 1000 with a random length
    //Then I need to go through every files and find the largest string in all of them

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        Path massiveDirectoryPath = Path.of("src/main/java/lecture_nr_17_18/massiveDir");

        if(!Files.exists(massiveDirectoryPath)){
            Files.createDirectory(massiveDirectoryPath);
        }

        final int nrOfFiles = 100;
        final int nrOfStringsInEachFile = 30;

        //Creation of files
        for(int i = 0; i != nrOfFiles; i++){
            Path bufferPath = Path.of("src/main/java/lecture_nr_17_18/massiveDir/testFile" + i + ".txt");
            if(!Files.exists(bufferPath)){
                Files.createFile(bufferPath);
            }
        }

        //Writing random strings to files
        Stream<Path> allFiles = Files.list(massiveDirectoryPath);

        allFiles.forEach(e -> {

            for(int i = 0; i != nrOfStringsInEachFile; i++){
                try {
                    Files.writeString(e, generateRandomString(random.nextInt(500, 1000)) + "\n", StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //Finding the largest string in all files
        allFiles = Files.list(massiveDirectoryPath);

        List<List<String>> allFilesList = new LinkedList<>();

        for(Path element : allFiles.toList()){

            allFilesList.add(Files.readAllLines(element));
        }

        Optional<String> maxString = allFilesList.stream()
                .flatMap(e -> e.stream())
                .max(Comparator.comparing(e -> e.length()));

        System.out.println("The largest string in all files is: " + maxString.orElseThrow(() -> new RuntimeException("The max is not found!")));


    }

    public static String generateRandomString(int length){
        final int start = '0';
        final int end = 'z';
        final Random random = new Random();
        final String generated = random.ints(start, end + 1)
                .filter(i -> Character.isLetter(i) || Character.isDigit(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generated;
    }
}
