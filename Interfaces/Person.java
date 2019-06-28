package Interfaces;

public class Person implements Info {   //обязаны реализовать все методы интерфейса!!!
    String name;
    Person(String name) {
        this.name = name;
    }

    void sayGoodbye() {
        System.out.println("class Person: Goodbye");
    }

//реализация метода интерфейса
    @Override
    public void showInfo() {    //без public не работает!
        System.out.println("class Person: " + name);
    }


}
