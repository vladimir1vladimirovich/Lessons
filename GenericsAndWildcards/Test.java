package GenericsAndWildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/////////////////// Java5 ///////////////////////////////////////////////////////////////////////////////////////////////
        Animal ourAnimal = new Animal();
        System.out.println("Java 5");
        List animals = new ArrayList(); //создали объект класса ArrayList, ссослали на интерфейс List
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        animals.add(ourAnimal);
        System.out.println(animals);
//        String my_animal = animals.get(1);  //нельзя, т.к. animals хранит в себе объекты!
        //ArrayList хранит в себе объекты, поэтому нужно сделать downcasting
        String my_animal = (String) animals.get(0); //get(index)
        System.out.println(my_animal);
        System.out.println();

/////////////////// C появлением дженериков /////////////////////////////////////////////////////////////////////////////
        System.out.println("С поялвением дженериков");
        List<String> animals2 = new ArrayList<String>(); //хранятся не объекты, а <строки>! поэтому кладем только строки!
        animals2.add("Dog2");
        animals2.add("Cat2");
        animals2.add("Frog2");
        System.out.println(animals2);
        System.out.println(animals2.get(1));
        System.out.println();

///////////////////// Java7 /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Java 7");
        List<String> animals3 = new ArrayList<>();  //можно не указывать тип справа!
        animals3.add("Dog3");
        animals3.add("Cat3");
        animals3.add("Frog3");
//        animals3.add(ourAnimal);   //нельзя хранить объекты, т.к. тип String
        System.out.println(animals3);
        System.out.println(animals3.get(2));
        System.out.println();


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Wildcards");
        List<Animal> listOfAnimals = new ArrayList<>();  //хранит только объекты
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        listOfAnimals.add(new Animal(3));

        System.out.println();

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);
    }


    public static void test(List<? extends Animal> list) {   // (Wildcard)? означает любой тип(в данном случае класс)
        for (Animal i : list) {                              //на вход List класса Animal или же наследников Animal
//            System.out.println(i);                         // <? super Animal> - выше Animal
            i.eat();
        }
    }
}
