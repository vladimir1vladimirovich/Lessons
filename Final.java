public class Final {
    public static void main(String args[]) {

        final int X = 154;       //Final = const; не может измениться в дальнейшем
        System.out.println(X);
//        Test Y = new Test(123);
        System.out.println(Test.getCONSTANT());
    }
}


class Test {
//    public final int CONSTANT;      //все константы БОЛЬШИМИ буквами
//
//    public Test(int CONSTANT) {    //конструктор (инициализируем CONSTANT) , дальше изменить не можем!
//        this.CONSTANT = CONSTANT;
//    }

    public static final int CONSTANT = 525;   //константы делаем static, чтобы не тратить память!
    public static int getCONSTANT() {
        return CONSTANT;
    }
}