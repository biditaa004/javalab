import java.util.Arrays;

public class ArrtoStr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        
        String arrayAsString = Arrays.toString(array);
        
        
        System.out.println("Array as String: " + arrayAsString);
    }
}