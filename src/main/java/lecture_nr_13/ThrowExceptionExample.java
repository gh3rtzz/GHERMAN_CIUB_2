package lecture_nr_13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;

public class ThrowExceptionExample {

    public static void main(String[] args) {

        try {
            throwFileNotFoundException();
        } catch (FileNotFoundException e) {

        } catch (AccessDeniedException e) {

        } catch (BindException e) {

        } catch (IOException e){

        }
        throw new ArithmeticException(); // Runtime exception
    }

    public static void throwFileNotFoundException() throws IOException {

        if(true){
            throw new FileNotFoundException();
        } else if(false){
            throw new AccessDeniedException("asd");
        } else {
            throw new BindException("asd");
        }
    }
}
