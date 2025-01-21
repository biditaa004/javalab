import java.util.Scanner;

public class StrContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        if (firstString.contains(secondString)) {
            System.out.println("The first string contains the second string.");
        } else {
            System.out.println("The first string does not contain the second string.");
        }

        scanner.close();
    }
}
 
    

