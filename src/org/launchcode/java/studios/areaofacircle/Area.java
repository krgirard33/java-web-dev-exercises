package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        Double radius = input.nextDouble();
        input.close();
        Double areaOfCircle = radius * radius * pi;
        System.out.println("The area of a circle with a "+radius+" radius is "+areaOfCircle);
    }
}
