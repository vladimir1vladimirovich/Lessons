package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjects {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            /** чтение и вывод объектов */
//            Person person1 = (Person) ois.readObject();  //downcasting до класса Person
//            Person person2 = (Person) ois.readObject();
//            System.out.println(person2);


            /** чтение и вывод массив объектов */
            int personCount = ois.readInt(); // считали число из файла
            Person[] people = new Person[personCount];//массив объектов

            for (int i=0; i < personCount; i++) {
                people[i] = (Person) ois.readObject(); //возвращает объект класса Person
                //down cast потому что считывается object, а нужен person
            }
            System.out.println(Arrays.toString(people));
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
