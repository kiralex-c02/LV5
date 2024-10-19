package oop.bestellung;

import oop.rezept.Zutat;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public void printBestellung(){
        System.out.printf("Bestellnummer: %s\n",nummer);
        for (Bestellzeile row : this.zeilen) {
            System.out.println("Name: " + row.getName() + " Menge: " + row.getMenge() + " Preis: " + row.getPreis());
        }
    }

    public double getKosten(){
        double total = 0;
        for (Bestellzeile row : this.zeilen) {
            total += row.getKosten();
        }

        return total;
    }
}
