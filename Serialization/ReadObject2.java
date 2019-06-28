package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject2 {
    public static void main(String[] args) {
        //try with resources. Java закрывает все потоки, где реализовывается Serializable
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){  //чтобы не писать close()
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);

            /** чтение и вывод объектов */
            Person2 person2 = (Person2) ois.readObject();  //down casting до класса Person
            System.out.println(person2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
