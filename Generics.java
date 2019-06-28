import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
//////////////Java 5///////////
        List animals = new ArrayList();   //объект класса ArrayList ссылаем его на интерфейс list
        animals.add("Cat");       //кладем в массив String, а возврат идет Object
        animals.add("Dog");        //динамический массив (можем расширять)
        animals.add("Frog");
        System.out.println(animals);
//        String our_animal = animals.get(1);  нельзя! т.к. слева String, справа Object
        String my_animal = (String) animals.get(1); //поэтому сделаем Нисходящее преобразование
        System.out.println(my_animal);

//////////Появление дженериков//////Не удобно все время преобразовывать к классу String, поэтому придумали ПАРАМЕТРИЗАЦИЮ!
        System.out.println();

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Cat2");
        animals2.add("Dog2");
        animals2.add("Frog2");
        System.out.println(animals2);
        String my_animal2 = animals2.get(2);
        System.out.println(my_animal2);       //ну или System.out.println(animals2.get(2));
//////////////////Java 7///////////////

        ArrayList<String> animals3 = new ArrayList();  //можем не указывать <String>
    }
}
