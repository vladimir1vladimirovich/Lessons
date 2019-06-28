package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Bob");
//        Person person2 = new Person(2, "Mike");

        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};  //массив объектов класса Person

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //указываем куда записывать будем; bin-бинарные
            ObjectOutputStream oos = new ObjectOutputStream(fos); //передаем в конструктор файл

//            oos.writeObject(person1);  //Записываем объекты в файл
//            oos.writeObject(person2);

            oos.writeInt(people.length); //Записываем массив объектов в файл
            //в файле записана длина массива
            for (Person person : people) {
                oos.writeObject(person);
            }

            oos.close();  //Закрываем поток данных
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
