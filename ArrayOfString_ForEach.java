class ArrayOfString_ForEach {
    public static void main(String args[]) {
        String[] string_array = new String[3];            //String - класс => с большой буквы (ссылочный тип данных)
        string_array[0] = "Hello";
        string_array[1] = ", ";
        string_array[2] = "Vladimir!";
        for (String x: string_array) {     //проходимся по массиву
            System.out.print(x + " ");
        }
        System.out.println();
//=====================================================================================================
        int[] numbers = {1, 2, 3};
        int sum = 0;
        for(int x: numbers) {              //проходимся по массиву
            sum = sum + x;
        }
        System.out.println("Summa = " + sum);
//=====================================================================================================
        int [] array = new int[6];              //создание массива из 5 элементов
        String [] str = {"абв" , "abc", "asd"}; //создание массива строк

        char [] symbols = {'a', 'б', 'в'};
        for (char j: symbols) {                //указываем тип j , какой тип в массиве
            System.out.print(j + " ");
        }
    }
}