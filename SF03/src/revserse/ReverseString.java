package revserse;

public class ReverseString {
	public static void main(String[] args) {
        // Input string
        String str = "Sreenihdi";
        
        // Create an empty string to store the reversed string
        String reversed = "";

        // Use a for loop to iterate over the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += str.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }

}
/*
> Input String: The string to be reversed is stored in the variable input.
> Char Array: A character array reversed is created to hold the reversed string.
> For Loop: The loop runs from the start to the end of the input string:
i < input.length() ensures the loop runs for each character in the input string.
> reversed[i] = input.charAt(input.length() - 1 - i) assigns the character from the end of the input string to the beginning of the reversed array.
> Convert and Print: The reversed char array is converted back to a string and printed.

OTHER FORM METHOD TO EXECUTE

import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        char []c=s.toCharArray();
        int n=c.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
    
}
*/