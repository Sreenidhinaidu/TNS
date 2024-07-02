package revserse;

public class ReverseNumber {
	public static void main(String[] args) {
        // Input number
        int number = 11082706;
        
        // Variable to store the reversed number
        int reversed = 0;

        // Use a while loop to reverse the digits
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }

}
