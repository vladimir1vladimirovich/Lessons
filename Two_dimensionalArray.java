class Two_dimensionalArray {
    public static void main(String args[]) {
        int[][] array = {{1, 2, 3}, {5}, {7, 8, 9, 10, 11}};

        int[][] numbers = new int[3][3];     //пустой массив == массив нулей; numbers -> [массив] , ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = i + j;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
//====================================================================
        System.out.println();

        int[] numbers1 = {1, 2, 3, 4, 5};
        for (int k = 0; k < numbers1.length; k++) {
            int result = (int) Math.pow(numbers1[k], 2);
            System.out.print(result + " ");
        }
    }
}
