public class Transformation {
    public static void main(String args[]) {
        char c = 'a';                            //char + char = int
        char c1 = 'q';                           //char + String = String
        String s = "nice";

        String s1 = String.valueOf(c);      //преобразование в String
        String s2 = Character.toString(c1); //преобразование в String
        char c2 = s1.charAt(0);             //преобразование в char

        String a = "41";
        int x = Integer.parseInt(a);      //преобразование в int

    }
}
