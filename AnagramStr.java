import java.util.Arrays;

public class AnagramStr {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

