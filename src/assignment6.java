/*
Write a program to accept a string display the new string after reversing each character of the new word. 
      sample input - New Delhi is the capital of India 
      sample output-weN ihleD si eht latipac  fo aidnI
 */


//importing required libraries
import java.util.Scanner;
//class begins
public class assignment6 
{
    //main begins
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //taking input from the user
        System.out.println("");
        System.out.println("Enter a string:- ");
        String text = keyboard.nextLine();
        text = text.trim();
        String result = "";
        //splitting words and storing them in a array of strings
        String[] word = text.split(" ");
        //reversing the words and storing them in a string
        for (int i = 0; i < word.length; i++) 
        {
            for(int j = word[i].length() - 1; j>=0; j--)
            {
                result += word[i].charAt(j);
            }
            result += " ";
        }
        //displaying the result
        System.out.println("The reversed statement is: "+ result + ".");
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
2.  String          text            To store the string given by user
3.  String          result          To store the result string after word reversal
4.  String[]        word            To store the words after splitting
5.  int	            i               To control the outer loop in string word reversal
6.  int             j               To control the inner loop in string word reversal

*/
