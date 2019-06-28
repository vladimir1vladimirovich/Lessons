package GenericsAndWildcards;

public class Animal {
    Animal() {}       //создали пустой конструктор, иначе жалуется в классе Dog
    private int id;
    Animal(int id) {
        this.id = id;
    }
    @Override                   //переопределили метод toString, чтобы не выводил такую херню "Generics.Animal@f5f2bb7"
    public String toString() {
        return String.valueOf(id);  //преобразовали в id в строку
    }
    public void eat() {
        System.out.println("Animal is eating ...");
    }
}
