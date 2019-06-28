public class Static {
    public static void main(String args[]) {
        Human2.description = "Nice";     //к static можно обращаться без создания объекта!
                                         //в не static методах можешь использовать static переменные,
                                         //но в static методах мы используем только static переменные
        Human2 h1 = new Human2("Bob", 35);
        Human2 h2 = new Human2("Tom", 40);

        Human2.printNumberOfPeople();
    }
}


class Human2 {
    private String name;
    private int age;
    public static String description; //эта переменная принадлежит не объекту этого класса, а самому классу!
    private static int countPeople;   //по умолчанию = 0

    public Human2(String name, int age) {    //конструктор
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
            this.name = name;
        }

    public void setAge(int age) {
            this.age = age;
        }

    public static void printNumberOfPeople() {
        System.out.println("Number of people: " + countPeople);
    }

}