import java.util.Scanner;
 class Grader {
    private int score;

    public Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score < 0 || score > 100) {
            return "Invalid score";
        } else if (score >= 95) {
            return "O";
        } else if (score >= 85) {
            return "E";
        } else if (score >= 75) {
            return "A";
        } else if (score >= 65) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

 class GraderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        Grader student = new Grader(score);
        System.out.println("The letter grade is: " + student.letterGrade());
    }
}
