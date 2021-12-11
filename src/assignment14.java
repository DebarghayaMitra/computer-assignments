/*
Write a program to accept two numbers and check whether they are twin prime or not use the function name as twin(). The function returns 1 if it is  twin prime otherwise return 0.
(Twin Prime numbers are the prime number whose difference is 2).  e.g (5, 7) (11,13)  Twin Prime numbers. 
 */


//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import static java.lang.StrictMath.abs;
//class begins
public class assignment14 
{
    //twin() function begins
    public int twin(int number1, int number2)
    {
        int factorsNumber1 = 0;
        int factorsNumber2 = 0;
        //checking for prime for first number
        for(int i = 1; i <= number1; i++)
        {
            if(number1 % i == 0)
            {
                ++factorsNumber1;
            }
        }
        //checking for prime for second number
        for(int i = 1; i <= number2; i++)
        {
            if(number2 % i == 0)
            {
                ++factorsNumber2;
            }
        }
        //checking for twin primes and returning appropriate values
        if (abs(number1 - number2) == 2 && factorsNumber1 == 2 && factorsNumber2 == 2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    // twin() function ends
    //main begins
    public static void main(String[] args) throws IOException
    {
        //declaring required variables and object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int number2 = 0;
        boolean flag = false;
        assignment14 user = new assignment14();
        //taking input for first number
        inputLoop1:
            do
            {
                try
                {
                    System.out.print("Enter the first number: ");
                    number1 = Integer.parseInt(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid Input! Enter Again! \n");
                    flag = true;
                    continue inputLoop1;
                }
            }
            while(flag);
        flag = false;
        //taking input for second number
        inputLoop2:
            do
            {
                try
                {
                    System.out.print("Enter the second number: ");
                    number2 = Integer.parseInt(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid Input! Enter Again! \n");
                    flag = true;
                    continue inputLoop2;
                }
            }
            while(flag);
        //checkin for twin prime with twin() function and displaying the results
        if (user.twin(number1, number2) == 1)
        {
            System.out.println("The numbers " + number1 + " and " + number2 + " are twin primes.");
        }
        else if (user.twin(number1, number2) == 0)
        {
            System.out.println("The numbers " + number1 + " and " + number2 + " are not twin primes.");
        }
    }
    //main ends
}
//class ends

/*

Variable Description
    Variable Type       Identifier      Description
1.  BufferedReader      keyboard        To access the BuffuredReader input methods.
2.  int                 number1         To act as a parameter for first number in twin() function.
3.  int                 number2         To act as a parameter for first number in twin() function.
4.  int                 factorsNumber1  To store the number of factors for first number.
5.  int                 factorsNumber2  To store the number of factors for second number.
6.  int                 number1         To store the first number input from user in main() function.
7.  int                 number2         To store the second number input from user in main() function.
8.  assignment14        user            To access the twin() method in main() function.
9.  boolean             flag            To flag out when an error in input.
*/
