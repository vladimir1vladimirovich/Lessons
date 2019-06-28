public class StringBuilder_ {
    public static void main(String[] args) {

        String s = "Goodbye";   //строка s
        s.toUpperCase();        //новая строка
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");   //строка (sb) класса StrBld изменяется, а не создается новая
        sb.append(" my").append(" friend").append("!");  //как выше
        sb.insert(2, " 222 "); //2 индекс во всей строке
        System.out.println(sb);                //одно и тоже
        System.out.println(sb.toString());
    }
}