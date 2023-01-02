package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven since your last fill up?");
        Double milesDriven = input.nextDouble();
        System.out.println("How many gallons did it take to fill up?");
        Double gasIn = input.nextDouble();
        input.close();
        Double mpg = milesDriven / gasIn;
        System.out.println("You got "+String.format("%.2f",mpg)+" mpg.");
    }
}
