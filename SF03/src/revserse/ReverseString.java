package revserse;

public class ReverseString {
	public static void main(String[] args) {
        // Input string
        String input = "Sreenihdi";
        
        // Create an empty string to store the reversed string
        String reversed = "";

        // Use a for loop to iterate over the string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }

}
