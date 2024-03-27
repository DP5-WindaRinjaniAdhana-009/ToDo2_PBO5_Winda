import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the car brand                  : ");
        String brand = scanner.nextLine();

        System.out.print("Input the car type                   : ");
        String type = scanner.nextLine();

        System.out.print("Input the car color                  : ");
        String color = scanner.nextLine();

        System.out.print("Input the year the car was released  : ");
        int releaseYear = scanner.nextInt();

        MobilIdentifier mobil = new MobilIdentifier(brand, type, color, releaseYear);
        mobil.Identification();

        mobil.brandToUpperCase();
        mobil.typeLowerCase();

        System.out.println("\nAfter the change:");
        mobil.Identification();

        scanner.close();
    }
}