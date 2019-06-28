public class ObjectToString {
    public static void main(String args[]) {
        Human3 h3 = new Human3("Bob", 30);
        System.out.println(h3.toString());    //возвращает hash code - уникальный номер объектов
        System.out.println(h3);               //  h3 тоже самое что и h3.toString()

    }
}


class Human3 {
    private String name;
    private int age;

    public Human3(String name, int age) {
        this.name = name;
        this.age = age;
    }
                                 //назначение метода toString() - представлять объект в виде строки!
    public String toString() {   //сигнатура = название + параметр
        return name + ", " + age + " мы переопределили метод toString";     //переопределение метода toString()
    }
}
