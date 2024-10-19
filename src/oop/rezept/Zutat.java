package oop.rezept;

public class Zutat {
    String name = "";
    int amount = 0;

    public Zutat(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }


}
