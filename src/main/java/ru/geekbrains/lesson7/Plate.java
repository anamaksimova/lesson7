package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Plate {
    Scanner sc=new Scanner(System.in);
    private int food;
    public Plate(int food) {
        this.food=food;
    }
     public void info() {
         System.out.println("Сейчас в тарелке: " + food + " еды");
     }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food>=n) {
        food-=n; } else {

            while (food<n) {
                System.out.println("Еды в тарелке не достаточно \nСколько еды добавить?");
                addFood();
            }

            food-=n;
            System.out.println("Теперь коту хватило еды!");
            info();
        }


        }


    public void addFood() {
        int a = sc.nextInt();
        food+=a;
        info();

    }

}
