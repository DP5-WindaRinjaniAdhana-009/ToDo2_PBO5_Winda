import java.util.Scanner;

public class MobilIdentifier {
    private String brand;
    private String type;
    private String color;
    private int releaseYear;

    public MobilIdentifier(String brand, String type, String color, int releaseYear) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    public void Identification() {
        System.out.println("=============================================================================================");
        System.out.println("Your car is " + brand + " type " + type + ", the color is " + color + " and produced in " + releaseYear);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void brandToUpperCase() {
        this.brand = this.brand.toUpperCase();
    }

    public void typeLowerCase() {
        this.type = this.type.toLowerCase();
    }
}
