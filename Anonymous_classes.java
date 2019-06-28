interface AbleToEat {
    void eat();
}

/*
class Animal {
    public static void eat() {
        System.out.println("Animal is eating ...");
    }
}
*/

public class Anonymous_classes {
    public static void main(String[] args) {

        AbleToEat animal = new AbleToEat() {  //создали анонимный класс, чтобы переопределить метод eat()
            //      Animal animal2 = new Animal() {   //animal2 - не объект класса Animal, а его наследник
            @Override
            public void eat() {
                System.out.println("Animal is eating from anonymous class ...");
            }
        };
            //};

        animal.eat();
    }
}

