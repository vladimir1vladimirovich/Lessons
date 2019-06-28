import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reading_From_File {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator; //разделитель системы (\ или /)
        String path = separator + "C:" + separator + "Users" + separator + "Владимир" + separator + "Desktop" + separator + "Java Programs" + separator + "test.txt";
// path=путь
        File file1 = new File(path);  //создаем объект типа File
        File file2 = new File("new_file");  //файл, который находится в папке проекта
        Scanner scanner = new Scanner(file1);
//        while (scanner.hasNextLine()) {      //hasNextLine() возращает true пока в файле есть строки, возращает false если строк уже нет
//            System.out.println(scanner.nextLine());
//
//        }
//==========================================================================================================================================
        String line = scanner.nextLine();   //если в файле слова,  line = строка
//        String[] words = line.split("0");
        String[] numbersString = line.split("  ");
        int [] numbers = new int[3];
        int counter = 0;

        for (String i: numbersString) {
            numbers[counter++] = Integer.parseInt(i);  //перевод из String в int
        }
//        System.out.println(numbersString); //выведет @хэшкод
        System.out.println(Arrays.toString(numbers)); //вывод массива ; Arrays - класс

        scanner.close();   //закрываем файл
    }
}
