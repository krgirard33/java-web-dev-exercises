package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        int stop = 0;
        Scanner input = new Scanner(System.in);
        do {
            radius = 0;
            while (radius < 1) {
                System.out.println("What is the radius of the circle?");
                if (input.hasNextDouble()) {
                    radius = input.nextDouble();
                    if (radius > 0) {
                        double areaOfCircle = Circle.getArea(radius);
                        System.out.println("The area of a circle with a " + radius + " radius is " + areaOfCircle);
                    } else {
                        System.out.println("Please enter a valid number.");
                        main(args);
                    }
                }
            }
            System.out.println("Would you like to run again? (1 to run or 0 to end)");
            stop = input.nextInt();
        } while (stop == 1);
        input.close();
    }
}
