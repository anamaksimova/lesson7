package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* Cat cat = new Cat("Кот",125);
        Plate plate = new Plate(150);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.isBellyfull(plate);*/

        //задание 5

        Cat[] catsArray = new Cat[4];
        catsArray[0]=new Cat("Буся",38);
        catsArray[1] = new Cat("Зося", 22);
        catsArray[2] = new Cat("Д'Артаньян", 50);
        catsArray[3] = new Cat("Том", 45);
        Plate plate = new Plate(100);

       /* сначало было так
       catsArray[0].getName();
        catsArray[0].isBellyfull(plate);
        catsArray[0].eat(plate);

        plate.info();
        catsArray[1].getName();
        catsArray[1].isBellyfull(plate);
        catsArray[1].eat(plate);

        plate.info();
        catsArray[2].getName();
        catsArray[2].isBellyfull(plate);
        catsArray[2].eat(plate);

        plate.info();
        catsArray[3].getName();
        catsArray[3].isBellyfull(plate);
        catsArray[3].eat(plate);*/


        for (Cat kitty:catsArray) {
            plate.info();
            kitty.getName();
            kitty.isBellyfull(plate);
            kitty.eat(plate);
        }

        sc.close();


    }
}


