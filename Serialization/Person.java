package Serialization;

import java.io.Serializable;

public class Person implements Serializable {  //разрешаем java сериализовывать объекты классса Person
    private int id;
    private String name;

    /**
     * constructor
     */
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    /**
     * override toString
     */
    public String toString() {
        return id + " : " + name;
    }
}
