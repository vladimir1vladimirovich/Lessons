public class PrivedeniePrimitiveTypes {
    public static void main(String[] args) {

        Integer x1 = new Integer(123); //Integer - класс-обертка
        Integer x2 = 3;//упаковка примитивного типа; тоже самое что и выше

        Integer x3 = 123;
        int y = x3; //распаковка

        Integer.parseInt("123");


        float x = 123.23f;    //123.23F   double -> float (f)
        double z = 132.43;    //по умолчанию все числа с точкой - double
//        long l = 1234567890000;    //ошибка(слишком большое для int), по умолчанию все целые числа - int
        long l = 1234567890000L;     // int -> long (L)



        long a = 12345;  //неявное приведение (не видим)
        int b = (int) a; //явное приведение

        double c = 2134.345;
        float d = (float) c;

        double e = 13.5;
        int f = (int) e;  //f==13

    }
}
