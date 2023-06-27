package OOP;

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getDoors() {
        return this.doors;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public void setMake(String make) {

        if (make == null) make = "Unknown";

        String lowerCase = make.toLowerCase();
        switch (lowerCase) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported ";

        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
