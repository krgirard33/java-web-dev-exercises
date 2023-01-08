package exercises.chap3;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for(int i=0; i<intArray.length;i+=2) {
            System.out.println(intArray[i]);
        }
    }
}
