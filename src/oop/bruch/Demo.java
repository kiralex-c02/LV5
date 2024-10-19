package oop.bruch;

public class Demo {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(3, 4);
        Bruch b3 = new Bruch(5, 6);
        Bruch b4 = new Bruch(7, 8);
        Bruch b5 = new Bruch(9, 10);
        Bruch euklid = new Bruch(42, 112);
        Bruch[] brueche = {b2, b3, b4, b5};

        System.out.println("b1.toDecimal() = " + b1.toDecimal());
        b2.print();

        Bruch b6 = b1.multiplicate(b2);
        b6.print();

        Bruch b7 = b1.multiplicate(b2, b3);
        b7.print();

        Bruch b8 = b1.multiplicate(brueche);
        b8.print();

        euklid.print();
        euklid.trim(euklid.getZaehler(), euklid.getNenner());
        euklid.print();

    }
}
