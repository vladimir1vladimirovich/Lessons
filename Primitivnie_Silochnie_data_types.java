class Primitivnie_Silochnie_data_types {
    public static void main(String args[]) {
        int number = 10;        //примитивный тип данных
        char character = 'A';   //тоже
        String string = "Hello";                         //ссылочный тип данных
        String string1 = new String("Hello");     //тоже, переменные ссылаются на объекты(справа(Hello))

        int [] numbers = new int[5];    // numbers -> [массив] , т.е. переменная(numbers) сыллается на массив
        int [] numbers1 = {1, 2, 3};

        String s = "1000";
        int x = Integer.parseInt(s);

    }
}
