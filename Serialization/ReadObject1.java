package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/** второй способ, в котором считаем что массив - это тоже объект */     //более удобный(без цикла)
public class ReadObject1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);


            /** чтение и вывод массив объектов */
            Person[] people = (Person[]) ois.readObject(); //down casting (приравняли)
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
