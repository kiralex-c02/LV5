package oop.rezept;

public class Rezept {
    String name = "";
    int person = 0;
    Zutat[] ingreedients;

    public Rezept(String name, int person, Zutat[] ingreedients) {
        this.name = name;
        this.person = person;
        this.ingreedients = ingreedients;
    }

    public String getName() {
        return name;
    }

    public int getPerson() {
        return person;
    }

    public Zutat[] getIngreedients() {
        return ingreedients;
    }

    public void printRezept(){
        System.out.printf("Rezept: %s\n Für %d Personen\n", name, person);
        for (Zutat ingreedient : ingreedients) {
            System.out.println("Zutat: " + ingreedient.getName() + " Menge: " + ingreedient.getAmount());
        }
    }

    public Rezept umrechnen(int persons){
        float multiplyer = persons / this.getPerson();
        Zutat[] new_ingreeZutats = new Zutat[this.getIngreedients().length];
        for (int i = 0; i < this.getIngreedients().length; i++) {
            new_ingreeZutats[i] = new Zutat(this.getIngreedients()[i].getName(), Math.round(this.getIngreedients()[i].getAmount() * multiplyer));
        }
        return new Rezept(this.getName()+ " für " + persons , persons, new_ingreeZutats);
    }


}
