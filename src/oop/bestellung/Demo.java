package oop.bestellung;

public class Demo {

    public static void main(String[] args) {
        Bestellzeile[] zeilen = new Bestellzeile[]{
                new Bestellzeile("Schnitzel", 1, 11),
                new Bestellzeile("Burger", 2, 10),
                new Bestellzeile("Spaghetti", 1, 8)
        };
        Bestellung bestellung1 = new Bestellung("A001", zeilen);
        bestellung1.printBestellung();
        double totatl = bestellung1.getKosten();
        System.out.println("Total " + totatl);
    }
}
