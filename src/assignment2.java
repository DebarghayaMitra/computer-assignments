/*
Write a program to input a number and print whether the number is a special number or not.
(A number is said to be a special number, if the sum of the factorial of the digits of the number is same as the original number. )
Example : 145 is a special number, because 1!+4!+5!=1 +24 + 120 = 145.
( where ! stands for factorial of the number and the factorial value of a number is the product of all integers from 1 to that number, example 5!=1*2*3*4*5=120) 
 */


//importing required libraries
import java.util.Scanner;
//class begins
class assignment2
{
    //main begins
    public static void main(String[] args)
    {
        //taking input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = keyboard.nextInt();
        int number1 = number;
        int lastDigit, sum = 0;
        //calculating sum factorial of the digits
        while(number > 0)
        {
            lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++)
            {
                fact = fact*i;
            }
            sum += fact;
            number = number/10;
        }
        //comparing the sum with the number
        if (number1 == sum)
        {
            System.out.println(number1 + " is a special number.");
        }
        else
        {
            System.out.println(number1 + " is not a special number.");
        }
        System.out.println();
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends





/*

Variable Description
    Variable Type   Identifier      Description
1.  Scanner         keyboard        To use the Scanner input methods
2.  int             number          To store the number input
3.  int             number1         To store a copy the number input
4.  int             lastDigit       To store the digits for factorial calculation
5.  int	            sum             To store the sum of the factorial of the digits
6.  int             fact            To store the factorial value of a digit
7.  int             i               To control the loop for factorial calculation

*/