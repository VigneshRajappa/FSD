import java.util.HashSet;
import java.util.Set;

public class del_repeat {
    public static void main(String[] args) {
        String inputString = "w3resource";
        String resultString = removeDuplicates(inputString);
        
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}


