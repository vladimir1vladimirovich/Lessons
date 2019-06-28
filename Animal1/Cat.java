package Animal1;

public class Cat extends Animal {
    Cat(String name) {
        if (name.isEmpty()) {
            System.out.println("Name is empty");
        } else { this.name = name; }
    }

    @Override
    void eat() {
        System.out.println("Cat is eating...");
    }
    @Override
    void sleep() {
        System.out.println("Cat is sleeping...");
    }
    @Override
    void voice() {
        System.out.println("Myyyyyeee");
    }
}
