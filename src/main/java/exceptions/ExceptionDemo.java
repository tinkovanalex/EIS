package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Random;

/**
 * Created by Alex on 06.03.2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int switcher = new Random().nextInt(100);
        try {
            if (switcher < 25)
                throw new ArrayIndexOutOfBoundsException();
            else if (25 <= switcher && switcher < 50)
                throw new NullPointerException();
            else if (50 <= switcher && switcher < 75)
                throw new IllegalStateException();
            else
                throw new StackOverflowError();
        }catch (Exception exception){
            System.out.println("caught a" + exception.getClass().getSimpleName() + "exception!");

        }catch (Error error){
            System.out.println("caught a" + error.getClass().getSimpleName() + "error!");
        }finally {
            System.out.println("funnaly");
        }
        System.out.println("after all");

        //System.out.println(readFile("C:\\windows"));
    }

    private boolean readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        InputStream stream = new FileInputStream(file);
        return file.isDirectory();
    }
}
