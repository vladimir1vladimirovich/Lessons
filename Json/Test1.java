package Json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Test1 {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Person person = new Person("Tom", 20);
        String json = GSON.toJson(person);
        System.out.println(json);


        Person person1 = GSON.fromJson(json, Person.class);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
