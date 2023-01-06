package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;

        while (radius < 1 ) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the radius of the circle?");
            while(input.hasNextDouble()) {
                radius = input.nextDouble();
                //input.close();
                if (radius > 0) {
                    double areaOfCircle = Circle.getArea(radius);
                    System.out.println("The area of a circle with a " + radius + " radius is " + areaOfCircle);
                } else {
                    System.out.println("Please enter a valid number.");
                    main(args);
                }
            }
        }
    }
}
