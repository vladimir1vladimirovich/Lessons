package All_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
//=============================================1ый_способ===============================================================
//    public static void main(String[] args) throws FileNotFoundException {  //этот методд возможно выбросит такое исключение
//                                                   //исключение - объект класса, все они должны наследоваться от класса Exception
//        File file = new File("abc");
//        Scanner scanner = new Scanner(file);
//// вызываем метод readFile()
//        readFile();
//    }
//==============================================2ой_способ==============================================================
    public static void main(String[] args) {
        File file1 = new File("test_of_exceptions");

        try {                                    //в try: код, который может вызвать исключение
            Scanner scanner = new Scanner(file1); //весь код в try после выбрасывания искл не выполняется!!!
            System.out.println("После Scanner"); //не выведит
        } catch (FileNotFoundException e) {      //в catch: обработка исключения(т.е. если происходит ошибка, то работает catch)
            System.out.println("Файл не найден ... ");
        }
        System.out.println("Работа после блока try-catch");
    }
//======================================================================================================================
    public static void readFile() throws FileNotFoundException {  //при создании метода делаем исключение,
        File file2 = new File("the_path");                //и при вызове этого метожа делаем исключение
        Scanner scanner = new Scanner(file2);
    }
}
