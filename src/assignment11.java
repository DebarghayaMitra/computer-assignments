/*
You want to calculate the sum of all positive even number and sum of all negative odd numbers from a set of numbers. You can enter zero to quit the program and thus it displays the result. Write a program to perform the above the task.
 */


//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//class starts
public class assignment11 
{
    //main starts
    public static void main(String[] args) throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double negativeSum = 0;
        double positiveSum = 0;
        double number = 0;
        do
        {
            boolean flag = false;
            //taking input
            inputloop:
                do
                {
                    try
                    {   
                        System.out.println("\nEnter a number or enter 0 to exit and show the sum:- ");
                        number = Double.parseDouble(keyboard.readLine());
                        flag = false;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\nInvalid input! Enter Again!\n");
                        flag = true;
                        continue inputloop;
                    }
                }
                while(flag);
            //determining negative and positive numbers and adding them separately.
            if(number < 0)
            {
                negativeSum += number;
            }
            else if(number > 0)
            {
                positiveSum += number;
            }
            else
            {
                break;
            }
        }
        while(number != 0.0);
        //displaying results
        System.out.println("\nThe sum of all positive values you typed is: " + positiveSum);
        System.out.println("The sum of all negative values you typed is: " + negativeSum);
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends


/*

Variable Description
    Variable Type       Identifier      Description
1.  BufferedReader      keyboard        To access the BuffuredReader input methods
2.  double              negativeSum     To store the sum of all negative numbers given by user
3.  double              postiveSum      To store the sum of all positive numbers given by user
4.  double              number          To store the number input from user
5.  boolean             flag            To flag out when an error in input

*/

