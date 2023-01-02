package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the rectangle?");
        Double height = input.nextDouble();
        System.out.println("What is the length of the rectangle?");
        Double length = input.nextDouble();
        input.close();
        Double area = length * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
