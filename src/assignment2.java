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