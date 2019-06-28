package Abstract;

public class Cat extends Animal implements AbleToMakeSound {
    @Override
    public void makeSound() {
        System.out.println("Meow ...");
    }
}
