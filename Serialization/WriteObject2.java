package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObject2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2(1, "Bob");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
//            FileOutputStream fos = new FileOutputStream("people.bin"); //указываем куда записывать будем; bin-бинарные
//            ObjectOutputStream oos = new ObjectOutputStream(fos); //передаем в конструктор файл

            oos.writeObject(person2);  //Записываем объекты в файл

//            oos.close();  //Закрываем поток данных
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
