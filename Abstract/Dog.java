package Abstract;

public class Dog extends Animal implements AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("Goof ...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating ...");
    }
}
