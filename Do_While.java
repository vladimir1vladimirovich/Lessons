import java.util.Scanner;
class Do_While {                                      //loop Do_While выполниться минимум 1 раз!
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int value;                             // (1)
        do {
            System.out.print("Enter 5: ");
            value = scanner.nextInt();         // если бы поставили int value, вместо (1), то while не видел бы
        } while (value != 5);

        System.out.println("You enter 5");
    }
}