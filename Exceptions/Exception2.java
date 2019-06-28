package Exceptions;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine()); //преобразование строки в число
            if (x != 0) {
                throw new ScannerException("Пользователь ввел число, отличное от нуля");
            }
        }
    }
}
