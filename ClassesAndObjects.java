public class ClassesAndObjects {               //публичный класс только один!
    public static void main(String[] args) {   //методы с маленькой буквы! F.e. sayHello()
        Person person1 = new Person();
        Person person2 = new Person();

//        String name1 = "Vlad"; int age1 = 25;
//        String name2 = "Vova"; int age2 = 30;

//        person1.setNameAndAge(name1, age1);
//        person2.setNameAndAge(name2, age2);

        System.out.println("Ваше имя: " + person1.getName());
        System.out.println("Ваш возраст: " + person1.getAge());
        person1.setName("");
        person1.setAge(-10);

//        person1.speak();
//        person2.speak();

//        person1.age = 18;             //плохо обращатся напрямую к полям другого класса,
//        person2.age = 20;                   т.к. эти поля должны быть скрыты от пользователя(инкапсуляция)
//        person1.name = "Vladimir";                нужно через методы Setter, Getter(в которых можно сделать проверку)
//        person2.name = "Vlad";                         например на (age>0) and (name != null)
    }
}

class Person {
    private String name;
    private int age;

//    void setNameAndAge(String username, int userage) {
//        name = username;
//        age = userage;
//    }

    public void setName(String userName) {         //Setter для name
        if (userName.isEmpty()) {                  //isEmpty возвращает true-пустая строка, false-не пустая строка
            System.out.println("Вы ввели пустое имя");      //если в строке пробелы - это не пустая строка!
        } else {
            name = userName;
        }
    }
        public String getName () {                  //Getter для name
            return name;
        }


        public void setAge (int userAge){              //Setter для age
        if (userAge < 0) {
            System.out.println("Вы ввели отрицательный возраст");
        } else {
            age = userAge;
        }
    }
        public int getAge () {                         //Getter для age
            return age;
        }


        void speak () {
            System.out.println(name + ", " + age + " y.o.");
        }
    }

