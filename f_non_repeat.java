public class f_non_repeat {
        public static void main(String[] args) {
            String inputString = "abcdefghijklmnopqrstuvwxy";
            int n = 5;
    
            divideString(inputString, n);
        }
    
        public static void divideString(String str, int n) {
            int length = str.length();
    
            // Check if the string can be divided into n equal parts
            if (length % n != 0) {
                System.out.println("The given string cannot be divided into " + n + " equal parts.");
                return;
            }
    
            int partLength = length / n;
            String[] parts = new String[n];
    
            for (int i = 0; i < n; i++) {
                parts[i] = str.substring(i * partLength, (i + 1) * partLength);
            }
    
            // Print the parts
            for (String part : parts) {
                System.out.println(part);
            }
        }
    
    
    
}
