package TYBCA;

import java.util.Scanner;

public class Subject {
    protected String[] subjects = new String[5];

    public void acceptSubjects() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject names:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }
    }

    public void displaySubjects() {
        System.out.println("Subjects:");
        for (String sub : subjects) {
            System.out.println("- " + sub);
        }
    }

    public String[] getSubjects() {
        return subjects;
    }
}
