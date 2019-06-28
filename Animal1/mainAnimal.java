package Animal1;

public class mainAnimal {
    public static void main(String args[]) {
        Animal an1 = new Animal();
        Animal an2 = new Dog("");   // (Upcasting) Восходящее преобразование!
        Dog dog = new Dog("Bob");   //у объекта an2 доступны только базовые или переопределенные методы базового класса(Animal)
        Cat cat = new Cat("Tom");
        System.out.println();

        Dog dog2 = (Dog) an2;          // (Downcasting) Нисходящее преобразование
        dog2.voice();
        dog2.eat();
        dog2.sleep();
        dog2.showName();

        System.out.println();

        an1.eat();                   //про животное!
        an1.sleep();
        an1.voice();
//        an1.showName();  нельзя!

        System.out.println();

        an2.eat();                   //про собаку!   только базовые или переопределнные методы!
        an2.sleep();
        an2.voice();
//        an2.bark();      нельзя!
//        an2.showName();  нельзя!
        System.out.println();

        dog.eat();
        dog.sleep();
        dog.voice();
        dog.showName();

        System.out.println();

        cat.eat();
        cat.sleep();

    }
}
