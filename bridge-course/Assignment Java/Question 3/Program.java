class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;
    public Student(int rollNo, String name, int age, String course) 
        throws AgeNotWithinRangeException, NameNotValidException {
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name not valid: should contain only alphabets and spaces.");
        }

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within the range 15-21.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

public class Program {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Ronak Parmar", 20, "BCA");
            s1.display();
            System.out.println();
            Student s2 = new Student(102, "R0nak123", 18, "BCA");
        } catch (AgeNotWithinRangeException | NameNotValidException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
