package Abstract;

//нельзя создавать объект абстрактного класса!
public abstract class Animal {        //abstract => наследуем + дополняем

    public abstract void makeSound();  //abstract метоады!!! обязательно должны их реализовать!(как с интерфейсом)

    public void eat() {
        System.out.println("Animal is eating...");
    }
}
