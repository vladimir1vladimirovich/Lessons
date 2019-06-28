package Enum;

public enum Animal {
    DOG("собака"), CAT("кот"), FROG("лягушка");
    // new Animal("собака")

    private String translation;

    Animal(String translation) {  //при создании конструктора, перестаёт работать конструктор по умолчанию
        this.translation = translation;
    }

    Animal() {}


    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
