package exercises.chap3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    /*
    key int id
    student names
    */

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int id = 1;
        String newStudent;

        do {
            //System.out.println(students.size());
            System.out.println("Name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                students.put(id,newStudent);
                id++;
            }
        } while(!newStudent.equals(""));

        System.out.println("Class roster:");

        for(Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getKey()+": " + student.getValue());
        }

    }
}
