/*
Write a program to find the sum of series taking the values of ‘a’ and ‘n’
S = a/2 + a/3 + a/4 +…·······················+ a/n
 */



//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//class begins
public class assignment20 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        //decalring required variables and objects
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double sum = 0;
        long number = 0;
        boolean flag = false;
        System.out.println("\nThe program prints sum:- ");
        System.out.println("S = a/2 + a/3 + a/4 +…·······················+ a/n");
        inputloopNumerator:
        //taking input for number of values
        do
        {
            try
            {   
                System.out.println("\nEnter the value of 'a' i.e., numerator constant value:- ");
                a = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopNumerator;
            }
        }
        while(flag);
        flag = false;
        inputloopDinominator:
        //taking input for number of values
        do
        {
            try
            {   
                System.out.println("\nEnter the value of 'n' i.e., dinominator dynamic series:- ");
                number = Long.parseLong(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopDinominator;
            }
            if(number <=1)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopDinominator;
            }
            else
            {
                flag = false;
            }
        }
        while(flag);
        //calculating sum
        for(long i = 2; i <= number; i++)
        {
            sum += a/i;
        }
        System.out.println("The required sum is: " + sum);
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends



/*

Variable Description
    Variable Type       Identifier          Description
1.  BufferedReader      keyboard            To access the BuffuredReader input methods.
2.  double              a                   To store the numerator constant value.
3.  Exception           e                   To catch the exception in input for numerator constant value.
4.  double              sum                 To store the required sum.
5.  long                number              To store the dinominator dynamic value.
6.  Exception           e                   To catch the exception in input for dinominator dynamic value.
7.  long                i                   To control the loop for required sum series.
8.  boolean             flag                To flag out when an error in input.
*/