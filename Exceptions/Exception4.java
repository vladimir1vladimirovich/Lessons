package Exceptions;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
