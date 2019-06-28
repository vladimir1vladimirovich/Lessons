import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reading_From_File_2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "Владимир" + separator + "Desktop" + separator + "file.txt";

        File file = new File("file.txt");  //объект класса файл
        Scanner scanner = new Scanner(file);
/*
        int i = 0;
        int[] a = new int[10];
        while(scanner.hasNextLine()) {   //hasNextLine() = true, если строка есть
            a[i] = scanner.nextInt();    //записали в массив
            i++;
        }

        for (int k = 0; k < a.length; k++) {  //вывели массив
            System.out.print(a[k] + " ");
        }
*/


/*        String[] numbers = line.split("  ");
        for (String i : numbers) {
            System.out.println(i);
        }
*/
        int[] numbers = new int[31];                                   //создали массив чисел
        int count = 0;                                                //count для index
        String line = scanner.nextLine();                             //считали первую строку
        String[] numbersString = line.split(", ");              //в массив запихнули первую строчку, разделенную "  "
        for (String i: numbersString) {                               //преобразовали в int массив
            numbers[count++] = Integer.parseInt(i);
        }

        System.out.println(Arrays.toString(numbers));  //вывод массива
        scanner.close();   //не забываем закрывать поток, всегда!

    }
}
