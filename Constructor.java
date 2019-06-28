public class Constructor {
    public static void main(String args[]) {
        Human1 human1 = new Human1();   //при создании этого объекта, вызывается конструктор!
        Human1 human2 = new Human1("Vladimir");
    }
}


class Human1 {
    private String name;
    private int age;

    public Human1() {                       //пустой констурктор(по умолчанию); У конструктора нет типа(int, void...)
        this.name = "Имя по умолчанию";     //имя совпадает с именем класса, так же с Большой буквы
        this.age = 0;
        System.out.println("Привет из 1-го конструктора");
    }
    public Human1(String name) {
        System.out.println("Привет из 2-го конструктора");
        this.name = name;
    }
    public Human1(String name, int age) {
        System.out.println("Привет из 3-го конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


