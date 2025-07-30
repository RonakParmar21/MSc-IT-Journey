package TYBCA;

import java.util.Scanner;

public class Marks extends Subject {
    private int[] marks = new int[5];
    private int total = 0;
    private float percentage;

    public void acceptMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter marks for the subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        percentage = (float) total / marks.length;
    }

    public void displayResult() {
        System.out.println("\nMarks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
