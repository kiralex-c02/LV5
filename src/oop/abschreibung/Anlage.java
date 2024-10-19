package oop.abschreibung;

public class Anlage {
    String bez;
    double initialPrice;
    int useTime;
    double restPrice;
    int age;

    public Anlage(String bez, double initialPrice, int useTime) {
        this.bez = bez;
        this.initialPrice = initialPrice;
        this.useTime = useTime;
    }

    public String getBez() {
        return bez;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public int getUseTime() {
        return useTime;
    }

    public double getRestPrice() {
        return restPrice;
    }

    public int getAge() {
        return age;
    }
    public void abschreiben(){
        //Jahresende
        this.age += 1;
        if(this.age <= this.useTime){
            this.restPrice = Math.floor(this.initialPrice / this.useTime * (this.useTime - this.age));
        }
    }

    public void simulate(int maxYears, int minValue){
        for(int i = 0; i < maxYears; i++){
            if(this.restPrice > 0 || this.restPrice > minValue) {
                System.out.println("Jahr " + this.age + " Restwert: " + this.restPrice);
                this.abschreiben();
                System.out.println("Jahr "+ this.age + " Restwert: " + this.restPrice);
            }
        }
    }

    public Anlage renew(int extraValue, int extraYears){
        return new Anlage(
                this.getBez(),
                this.getRestPrice() + extraValue,
                this.getUseTime() - this.age + extraYears
        );
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "bez='" + bez + '\'' +
                ", initialPrice=" + initialPrice +
                ", useTime=" + useTime +
                ", restPrice=" + restPrice +
                ", age=" + age +
                '}';
    }
}
