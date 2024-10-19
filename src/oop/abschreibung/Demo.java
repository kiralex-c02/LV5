package oop.abschreibung;

public class Demo {

    public static void main(String[] args) {
        Anlage anlage1 = new Anlage("Laptop", 1250.99, 3);

        System.out.println(anlage1.toString());
        anlage1.abschreiben();
        Anlage anlage2 = anlage1.renew(750, 2);
        System.out.println(anlage1.toString());
        anlage1.simulate(5, 100);
        System.out.println(anlage1.toString());
        //Anlage anlage2 = anlage1.renew(750, 2);
        System.out.println(anlage2.toString());
    }
}
