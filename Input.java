import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //  <--- можно 1 раз создать

        System.out.print("Enter: ");
        String value = scanner.nextLine();      // 1-ый раз юзаем
        System.out.println(value);

        System.out.print("Enter: ");
        String value1 = scanner.nextLine();    // 2-ой раз юзаем
        System.out.println(value1);

        System.out.print("Enter: ");
        int value2 = scanner.nextInt();
        System.out.println(value2);

    }
}