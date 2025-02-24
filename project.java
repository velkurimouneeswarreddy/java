package helloworld;

import java.util.Scanner;

public class PhoneSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want the phone option? (yes/no)");
        String wantPhone = scanner.nextLine().trim().toLowerCase();

        if (wantPhone.equals("yes")) {
            System.out.println("Which phone brand do you want? (Apple/Samsung)");
            String brand = scanner.nextLine().trim();

            if (brand.equalsIgnoreCase("Apple")) {
                System.out.println("Which model do you want? (iPhone 14 Pro / iPhone 15 / iPhone 15 Pro)");
                String model = scanner.nextLine().trim().toLowerCase();

                System.out.println("Which color? (Black/White/Blue)");
                String color = scanner.nextLine().trim();
                System.out.println("Which variant? (256GB / 512GB)");
                String variant = scanner.nextLine().trim();

                System.out.println("\nSpecifications for your selected phone:");
                System.out.println("Brand      : Apple");
                System.out.println("Model      : " + model);
                System.out.println("Color      : " + color);
                System.out.println("Variant    : " + variant);

                if (model.equals("iPhone14Pro")) {
                    System.out.println("Camera     : 12MP Dual Camera System");
                    System.out.println("Battery    : 3200mAh");
                    System.out.println("Processor  : A15 Bionic Chip");
                    System.out.println("Price      : ₹1,09,900");
                } else if (model.equalsIgnoreCase("iPhone 15")) {
                    System.out.println("Camera     : 48MP Triple Camera System");
                    System.out.println("Battery    : 3969mAh");
                    System.out.println("Processor  : A16 Bionic Chip");
                    System.out.println("Price      : ₹1,29,900");
                } else if (model.equalsIgnoreCase("iPhone 15 Pro")) {
                    System.out.println("Camera     : 48MP Quad Camera System");
                    System.out.println("Battery    : 4300mAh");
                    System.out.println("Processor  : A17 Pro Chip");
                    System.out.println("Price      : ₹1,69,900");
                } else {
                    System.out.println("Invalid Apple model selected.");
                }

            } else if (brand.equalsIgnoreCase("Samsung")) {
                System.out.println("Which model do you want? (Samsung S23 / Samsung S24 / Samsung S25)");
                String model = scanner.nextLine().trim();

                System.out.println("Which color? (Black/White/Blue)");
                String color = scanner.nextLine().trim();

                System.out.println("Which variant? (256GB / 512GB)");
                String variant = scanner.nextLine().trim();

                System.out.println("\nSpecifications for your selected phone:");
                System.out.println("Brand      : Samsung");
                System.out.println("Model      : " + model);
                System.out.println("Color      : " + color);
                System.out.println("Variant    : " + variant);

                if (model.equalsIgnoreCase("Samsung S23")) {
                    System.out.println("Camera     : 50MP Triple Camera System");
                    System.out.println("Battery    : 3900mAh");
                    System.out.println("Processor  : Snapdragon 8 Gen 2");
                    System.out.println("Price      : ₹74,999");
                } else if (model.equalsIgnoreCase("Samsung S24")) {
                    System.out.println("Camera     : 200MP Quad Camera System");
                    System.out.println("Battery    : 4500mAh");
                    System.out.println("Processor  : Exynos 2200 / Snapdragon 8 Gen 2");
                    System.out.println("Price      : ₹89,999");
                } else if (model.equalsIgnoreCase("Samsung S25")) {
                    System.out.println("Camera     : 108MP Quad Camera System");
                    System.out.println("Battery    : 5000mAh");
                    System.out.println("Processor  : Snapdragon 8 Gen 3");
                    System.out.println("Price      : ₹1,09,999");
                } else {
                    System.out.println("Invalid Samsung model selected.");
                }

            } else {
                System.out.println("Invalid brand choice. Please select Apple or Samsung.");
            }

        } else if (wantPhone.equals("no")) {
            System.out.println("You chose not to select a phone option.");
        } else {
            System.out.println("Invalid input. Please type 'yes' or 'no'.");
        }

        scanner.close();
    }
}
 
 

	