
import java.util.*;
public class DigiStr {
    public static boolean containsOnlyDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean result = containsOnlyDigits(input);
        System.out.println("Contains only digits: " + result);
        sc.close();
  }
}
