package Interfaces;

public class Test {
    public static void main(String[] args) {       //в способе 1 нет доступа к методам классов Animal и Person
        //способ 1
        Info animal = new Animal(12341);        //создаем объект интерфейса!
        Info person = new Person("Vladimir");
//        animal.sayHello();   //нельзя
//        person.sayGoodbye(); //нельзя
        animal.showInfo();
        person.showInfo();

        System.out.println();

        //способ 2                                  //есть доступ к методам класса Animal и Person
        Animal animal1 = new Animal(12124);
        Person person1 = new Person("Vlad");
        animal1.sayHello();
        person1.sayGoodbye();
        outputInfo(animal1);
        outputInfo(person1);

    }
    //метод способа 2
    public static void outputInfo(Info info123) {
        info123.showInfo();  //общий метод(метод интерфейса)
    }
}
