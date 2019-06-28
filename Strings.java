import java.util.Scanner;

public class Strings {
    public static  void main(String args[]) {
        String s = "Hello Vladimir GoodBye";
        int pos = s.indexOf("Vladimir");    // возвращает индекс = 6
        String sub = s.substring(7);        // возвращает строку, начин с этого индекса "ladimir GoodBye"
        System.out.println(sub);

        String s1 = "Hello                ";     //строка с пробелами
        System.out.println(s1.length());         //длина строки = 24

        String s2 = s1.trim();                   //удаляет пробелы
        System.out.println(s2.length());         //длина строки = 5

        System.out.println(s.toUpperCase());    // а -> А



//разбиение строки в массив слов
        System.out.print("Enter a line: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String separator = " ";

        String[] array;
        array = line.split(separator);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

