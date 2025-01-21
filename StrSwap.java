import java.util.Scanner;

public class StrSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap strings without using XOR
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
