package OOPS.strings;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[10];
        System.out.println("Enter the cities one by one : ");
        for (int i = 0; i < cities.length; i++) {
            cities[i] = scanner.nextLine();
        }
        System.out.println("Cities are : ");
        for (String city : cities) {
            System.out.print(STR."\{city},");
        }
        System.out.println("\n");
        System.out.println("Let's convert them into Uppercase broski:");
        for (String city : cities) {
            System.out.print(STR."\{city.toUpperCase()},");
        }
        System.out.println("\n");
        boolean foundEqualCities = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (cities[i].equals(cities[j])) {
                    System.out.println(STR."City names \{cities[i]} and \{cities[j]} are equal.");
                    foundEqualCities = true;
                }
            }
        }
        if (!foundEqualCities) {
            System.out.println("No equal city names found.");
        }
        System.out.println("\n");
        System.out.println("First character of every city is ");
        for(String city : cities){
            System.out.println(city.charAt(0));
        }

    }
    }

