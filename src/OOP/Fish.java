package OOP;

public class Fish extends Animal{

    private int gils;
    private int fins;

    public Fish(String type, double weight, int gils, int fins) {
        super(type, "small", weight);
        this.gils = gils;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("Muscles moving ");
    }

    private void moveBackFin() {
        System.out.print("Backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gils=" + gils +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
