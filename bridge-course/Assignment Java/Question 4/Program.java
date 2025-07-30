import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        int rollNo;
        try {
            System.out.print("Enter Roll Number: ");
            rollNo = sc.nextInt();
            System.out.println("Enter marks for 4 subjects (0 to 100):");
            for (int i = 0; i < 4; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    throw new MarksOutOfBoundsException("Marks should be between 0 and 100");
                }
                marks[i] = mark;
            }
		System.out.println("\nRoll Number: " + rollNo);
            System.out.println("Marks:");
            for (int i = 0; i < 4; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }

        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access more than 4 subjects.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
