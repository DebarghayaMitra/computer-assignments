/*
Write a program in Java to enter a number and check whether the number is an Armstrong number or not. An number is said to be an Armstrong if if the sum of cube of digits is equal to the original number. 
Sample input:- 
153
Sample output :-
153 is an Armstrong number. 
Because 13+53+33=153
 */

//importing the libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.StrictMath.pow;
//class begins
public class assignment13 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        //declatring variables
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        long numberCopy = 0;
        long number = 0;
        short lastDigit = 0;
        int sum = 0;
        //taking input
        inputLoop:
            do
            {
                System.out.println("Enter a number (only positive integer):-");
                try
                {
                    number = Integer.parseInt(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid input! Enter again!\n");
                    flag = true;
                    continue inputLoop;
                }
                numberCopy = number;
                //checking for positive integer
                if(number < 0)
                {
                    System.out.println("\nThe number is not a positive integer. Enter again!\n");
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
            while(flag);
        //calculating the cube of the digits
        do
        {
            lastDigit =  (short) (number % 10);
            sum += pow(lastDigit, 3);
            number /= 10;
        }
        while (number > 0);
        //checking for the number to be an armstrong number and printing the results
        if (sum == numberCopy)
        {
            System.out.print("The number " + numberCopy + " is a armstrong number");
            System.out.print(" because ");
            while(numberCopy>0)
            {
                lastDigit = (short) (numberCopy % 10);
                System.out.print(lastDigit + "³");
                if(numberCopy>=0 && numberCopy<10)
                {
                    System.out.print(" = ");
                }
                else
                {
                    System.out.print(" + ");
                }
                numberCopy /= 10;
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("The number " + numberCopy + " is not a armstrong number");
        }
        keyboard.close();
    }
    //main ends
}
//class ends


/*

Variable Description
    Variable Type       Identifier      Description
1.  BufferedReader      keyboard        To access the BuffuredReader input methods
2.  long                number          To store the number given by user
3.  long                numberCopy      To store a copy of the number given by user
4.  short               lastDigit       To store the last digit of the number input from user for calculation
5.  boolean             flag            To flag out when an error in input
6.  int                 sum             To store the sum of the digits in the input number

*/
