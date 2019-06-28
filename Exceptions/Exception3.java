package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
//Checked Exceptions(Compile time exception) - возникают во время компиляции (исключительные случаи в работе программы)
        File file = new File("abc");   //должны их обработать
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }


//Unchecked (Runtime Exception) - возникают во время выполнения программы (ошибка в работе программы)
        int a = 1 / 0;                         //не должны их обрабатывать

        String name = null;
        name.length();

        int [] array = new int[2];
        System.out.println(array[5]);
    }
}
