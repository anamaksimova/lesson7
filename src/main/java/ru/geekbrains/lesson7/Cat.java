package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean bellyfull = false;

    public void  isBellyfull(Plate plate) {
        if (appetite<= plate.getFood()){
            bellyfull=true;

           System.out.print("Кот наелся");
            } else {bellyfull=false;
            System.out.print("Коту не хватило еды и он не наелся");
        }
        System.out.println("\t Сытость: " + bellyfull);

    }


    public Cat (String name, int appetite) {
        this.name=name;
        this.appetite=appetite;
    }
     public void eat(Plate p) {
        p.decreaseFood(appetite);

     }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void getName() {
        System.out.println(name + " собирается поесть");
    }
}
