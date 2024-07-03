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
            reversed = (reversed * 10 )+ digit;  // Append the digit to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }

}
/*
> Input Number: The number to be reversed is stored in the variable number.
> Reversed Number Initialization: The variable reversed is initialized to 0 to store the reversed number.
> While Loop: The loop runs as long as number is not equal to 0:
number % 10 gets the last digit of the number.
> reversed = reversed * 10 + digit appends the last digit to the reversed number.
> number = number / 10 removes the last digit from the number.
>Print Reversed Number: Finally, the reversed number is printed.

OTHER FORM OF CODE

import java.util.Scanner;

public class revnum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rev=0;
        while(n>0){
            int dig=n%10;     
            rev=rev*10+dig;   
            n/=10;
        }
        System.out.println(rev);
    }
}
*/
