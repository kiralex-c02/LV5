package oop.bestellung;

public class Bestellzeile {
    String name;
    int menge;
    int preis;

    public Bestellzeile(String name, int menge, int preis) {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public int getPreis() {
        return preis;
    }

    public double getKosten(){
        return preis * menge;
    }
}
