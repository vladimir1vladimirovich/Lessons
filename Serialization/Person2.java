package Serialization;

import java.io.Serializable;

public class Person2 implements Serializable {
    private static final long serialVersionUID = 2907475420503120824L; //изменилось, т.к. изменилась структура класса
    //    private static final long serialVersionUID = -1154930179668257342; //нужен чтобы помечать состояние класса
    private int id;
    private byte type;
    private String personName;
//    private transient String name; //не хотим сериализовывать его!(не хотим записывать в файл)


    /** constructor */
    public Person2(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return personName;
    }

    /** override toString */
    public String toString() {
        return id + " : " + personName;
    }
}
