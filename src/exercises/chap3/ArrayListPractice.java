package exercises.chap3;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] base = {11,22,33,24,25,36,47,18,9,10};
        ArrayList<Integer> testone = new ArrayList<>();
        for(int item : base) {
            testone.add(item);
        }
        System.out.println(sumEvens(testone));

    }
    public static int sumEvens(ArrayList<Integer> testone) {
        int sum = 0;
        int total = 0;
        for (int num : testone) {
            total += num;
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(total);
        return sum;
    }
}
