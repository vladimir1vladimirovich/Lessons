package Interfaces;

public class Animal implements Info {   //обязаны реализовать все методы интерфейса!!!
    int id;
    Animal(int id) {   //constructor
        this.id = id;
    }

    void sayHello() {
        System.out.println("class Animal: Hello");
    }

// реализация метода интерфейса!
    @Override
    public void showInfo() {      //без public не работает!
        System.out.println("class Animal: " + id);
    }
}
