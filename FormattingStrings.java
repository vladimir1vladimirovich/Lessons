public class FormattingStrings {                // !!!не забывать ...printf!!! т.к. вводим не sout!
    public static void main(String args[]) {
        System.out.printf(" This is a string, %s", "NICE "); //строка NICE вставляется вместо %s
        System.out.printf(" This is a string, %d", 10);     //число 10 вставляется вместо %d
        System.out.printf(" This is a string, %f", 10.1234);
        System.out.printf(" I have a %d billions %s", 100, "billions \n");
        System.out.printf(" \n");                                      //т.е. \n проиписывается в тексте

        System.out.printf("%10d \n", 1000);   //%10d -ширина в 10 символов
        System.out.printf("%10d \n", 10000);
        System.out.printf("%10d \n", 1000000);
        System.out.printf("%10d \n", 1000000000);

        System.out.println();
        System.out.printf("%-10d \n", 1000);
        System.out.printf("%-10d \n", 1000);
        System.out.printf("%-10d \n", 1000);
        System.out.printf("%-10d \n", 1000);

        System.out.println();
        System.out.printf("String %.2f \n", 12.5678); // + округление
    }
}
