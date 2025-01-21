import java.util.*;

class Student {
    int roll;
    String name;
    double fullMark;
    double securedMark;
    double cgpa;

    public Student(int roll, String name, double fullMark, double securedMark) {
        this.roll = roll;
        this.name = name;
        this.fullMark = fullMark;
        this.securedMark = securedMark;
        calculateCGPA();
    }

    // Method to calculate CGPA
    public void calculateCGPA() {
        cgpa = (securedMark / fullMark) * 10.0;
    }

    // Method to display student details along with CGPA
    public void displayDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Full Mark: " + fullMark);
        System.out.println("Secured Mark: " + securedMark);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details from the user
        System.out.print("Enter Roll: ");
        int roll = scanner.nextInt();

        System.out.print("Enter Name: ");
        String name = scanner.next();

        System.out.print("Enter Full Mark: ");
        double fullMark = scanner.nextDouble();

        System.out.print("Enter Secured Mark: ");
        double securedMark = scanner.nextDouble();
        Student student = new Student(roll, name, fullMark, securedMark);
        System.out.println("\nStudent Details:");
        student.displayDetails();
    }
}
