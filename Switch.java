import java.util.Scanner;
class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        switch (age) {                     //интовый switch
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
            case 18:
                System.out.println("Ты совершеннолетнтий");
                break;
            default:
                System.out.println("Default");
        }

        System.out.print("Enter your name: ");
        Scanner name1 = new Scanner(System.in);
        String name = name1.nextLine();
        switch (name) {                       //строковый switch
            case "Vladimir":
                System.out.println("You are Vladimir");
                break;
            case "Alex":
                System.out.println("You are Alex");
                break;
            default:
                System.out.println("You aren't Vladimir or Alex");
        }
    }
}
