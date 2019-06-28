package Enum;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Season season = Season.SUMMER;

        System.out.println(season instanceof Season); //является ли объект season в enum Season
        System.out.println(season instanceof Object);

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
        Season season1 = Season.SUMMER;
        System.out.println(season.getTemperature());
        System.out.println(season1.name()); //если toString не переопределен


        Animal animal_1 = Animal.CAT;
        Animal animal_2 = Animal.DOG;
        System.out.println(animal_1.getTranslation());
        System.out.println(animal_2.toString());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        System.out.println(frog.ordinal()); //возвращает порядок
    }
}
