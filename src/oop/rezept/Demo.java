package oop.rezept;

public class Demo {
    public static void main(String[] args) {
        Zutat[] zutaten = new Zutat[]{new Zutat("Eier", 8), new Zutat("Käse", 250), new Zutat("Speck", 125)};
        Rezept rezept1 = new Rezept("Eierspeis", 4, zutaten);

        rezept1.printRezept();
        Rezept rezept2 = rezept1.umrechnen(16);
        rezept2.printRezept();
    }
}
