public class This {
    public static void main(String args[]) {
        Human human1 = new Human();
        human1.setName("Vladimir");
        human1.setAge(19);
        System.out.println(human1.getName() + " " + human1.getAge());
        human1.getInfo();
    }
}


class Human {
    private String name;
    private int age;
                                               //this обращение к полям класса Human
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
