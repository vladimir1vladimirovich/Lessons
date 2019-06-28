public class Break_and_Continue {
    public static void main(String args[]) {
        int i = 0;
        while (1 > 0) {
            if (i == 15) {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println("exit from the loop");
//==========================================================================================
        for (int j = 0; j<16; j++) {
            if (j % 2 == 1) {
                continue;
            }
            System.out.print(j + " ");
        }
    }
}
