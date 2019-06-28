package Animal1;

public class Dog extends Animal {
    @Override
    public void eat() {   //произошло переопределние метода eat() , т.е. сигнатура метода не поменялась!
        System.out.println("Dog is eating from bowl");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    void voice() {
        System.out.println("Dog is barking!");
    }

    void showName() {
        System.out.println("Name of animal: " + this.name);
    }

    Dog(String name) {
        if (name.isEmpty()) {
        this.name = "Name is empty";
        } else { this.name = name; }
   }
}

