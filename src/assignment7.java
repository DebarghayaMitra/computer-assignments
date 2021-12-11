/*
Write a program to accept a string check and display if it is a palindrome or not. 
 */


//importing required libraries
import java.util.Scanner;
//class starts
public class assignment7 
{
    //main starts
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //taking input
        System.out.println("Enter a string:-");
        String word = keyboard.nextLine();
        String reverseWord = "";
        //reversing the string and storing it
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reverseWord += word.charAt(i);
        }
        //checking for palindrome
        if (word.equals(reverseWord))
        {
            System.out.println("The string \"" + word + "\" is a palindrome.");
        }
        else
        {
            System.out.println("The string \"" + word + "\" is not a palindrome.");
        }
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends

/*

Variable Description
    Variable Type   Identifier      Description
1.  Scanner         keyboard        To access the Scanner input methods
2.  String          word            To store the string given by user
3.  String          reverseWord     To store the result string reversal
4.  int             i               To control the loop

*/
