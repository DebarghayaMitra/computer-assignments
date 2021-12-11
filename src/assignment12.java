/* Write a Java Program to check whether a number is a  pronic number or not. 
 A pronic number is a number which is the product of two consecutive integer that is a number of  the form  n(n + 1) 
The first few pronic numbers are 0,2,6,12,30
*/

//importing libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//class starts
public class assignment12
{
    //main starts
    public static void main(String[] args) throws IOException
    {
        //taking input
        boolean inputFlag = false;
        boolean foundFlag = false;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        long number = 0;
        inputLoop:
            do
            {
                System.out.println("Enter a number (only positive integer):- ");
                try
                {
                    number = Integer.parseInt(keyboard.readLine());
                    inputFlag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid Input! Enter Again! \n");
                    inputFlag = true;
                    continue inputLoop;
                }
                if(number<0)
                {
                    System.out.println("\nNot a positive number! Enter a positive number!\n");
                    inputFlag = true;
                    continue inputLoop;
                }
                else
                {
                    inputFlag = false;
                }
            }
            while(inputFlag);
        //initiating loop for check
        findLoop:
            for (int i = 0; i <= number; i++)
            {
                //checking for pronic number
                if(i * (i+1) == number)
                {
                    foundFlag = true;
                    break findLoop;
                }
                else
                {
                    foundFlag = false;
                    continue findLoop;
                }
            }
            //loop ends
        //printing the result
        if(foundFlag)
        {
            System.out.println("The number " + number + " is a pronic number.");
        }
        else if(!foundFlag)
        {
            System.out.println("The number " + number + " is not a pronic number.");
        }
        //closing input resorces
        keyboard.close();
    }
    //main ends
}
//class ends



/*
Variable Description

    Type            Identifier              Description
1.  Scanner         keyboard                To access the input method in scanner library
2.  long            number                  To store the number input by user
3.  boolean         flag                    To flag out when a pronic number is found
4.  int             i                       To control the loop counter and act as test number for pronic number
*/