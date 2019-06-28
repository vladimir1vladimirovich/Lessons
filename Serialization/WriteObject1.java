package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/** второй способ, в котором считаем что массив - это тоже объект */
public class WriteObject1 {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};  //массив объектов класса Person

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //указываем куда записывать будем; bin-бинарные
            ObjectOutputStream oos = new ObjectOutputStream(fos); //передаем в конструктор файл


            oos.writeObject(people); //массив - объект
            oos.close();  //Закрываем поток данных
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
