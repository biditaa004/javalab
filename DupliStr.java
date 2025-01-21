import java.util.HashMap;
import java.util.Map;

public class DupliStr {
    public static void main(String[] args) {
        String input = "Biditaa";
        
        // Find duplicate characters
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string '" + input + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}

