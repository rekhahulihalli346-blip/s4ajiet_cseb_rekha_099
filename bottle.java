package training;

public class bottle {

    String brand;
    String color;
    double volume;

    boolean isOpen = false;
    boolean isEmpty = true;

    // Constructor
    public bottle(String brand, String color, double volume) {
        this.brand = brand;
        this.color = color;
        this.volume = volume;
    }

    // Open bottle
    void openCap() {
        isOpen = true;
        System.out.println("Bottle opened.");
    }

    // Close bottle
    void closeCap() {
        isOpen = false;
        System.out.println("Bottle closed.");
    }

    // Fill water
    void fillWater() {
        if (isOpen) {
            isEmpty = false;
            System.out.println("Bottle filled with water.");
        } else {
            System.out.println("Open the bottle first.");
        }
    }

    // Drink water
    void drink() {
        if (isOpen && !isEmpty) {
            isEmpty = true;
            System.out.println("Drinking water...");
        } else {
            System.out.println("Cannot drink.");
        }
    }

    // Display bottle info
    void info() {
        System.out.println(
            brand + " (" + color + ") "
            + volume + "L"
            + " | Open: " + isOpen
            + " | Empty: " + isEmpty
        );
    }

    // Main method
    public static void main(String[] args) {

        bottle b = new bottle("Milton", "Blue", 1.0);

        b.openCap();
        b.fillWater();
        b.drink();
        b.info();
        b.closeCap();
    }
}