/*
Write a program to calculate monthly electricity bill of a customer according to the units consumed. The tariff is given below

Unit Consumed					    Charge
Upto 100 units						Rs. 1.25 per Unit
For next 100 units					Rs. 1.50 per Unit
More than 200 units					Rs. 1.80 per Unit
Unit consumed = Present reading- Previous reading
Use a function name cal(int n) and print the information in the main function as per the given format:

Consumer No		 Name	 	Units Consumed		Amount
xxxxxx		     xxxx		xxxx			    xxxx 
 */


//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.NumberFormat;
import java.util.Locale;
//class begins
public class assignment15 
{
    //cal() function starts
    public double cal(int n)
    {
        //calculating charge
        if(n>=0 && n<=100)
        {
            return 1.25 * n;
        }
        else if(n>100 && n<=200)
        {
            return 125 + 1.50 * (n-100);
        }
        else
        {
            return 125 + 150 + 1.80 * (n-200);
        }
    }
    //cal() function ends
    //main begins
    public static void main(String[] args) throws IOException
    {
        //declaring variables and objects
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        assignment15 user = new assignment15();
        int presentReadings = 0;
        int previousReadings = 0;
        long consumer = 0;
        String name = "";
        boolean flag = false;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        //taking input of consumer name
        System.out.println("Enter comsumer name:- ");
        name = keyboard.readLine();
        //taking input of consumer number
        inputConsumerNoLoop:
            do
            {
                System.out.println("\nEnter a consumer number:-");
                try
                {
                    consumer = Long.parseLong(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid input! Enter again!");
                    flag = true;
                    continue inputConsumerNoLoop;
                }
                //checking for positive integer
                if(consumer < 0)
                {
                    System.out.println("\nThe number is not a valid consumer number! Enter again!");
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
            while(flag);
        flag = false;
        //taking input of current reading
        inputCurrentReadingLoop:
            do
            {
                System.out.println("\nEnter a current reading:- ");
                try
                {
                    presentReadings = Integer.parseInt(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid input! Enter again!");
                    flag = true;
                    continue inputCurrentReadingLoop;
                }
                //checking for positive integer
                if(presentReadings <= 0)
                {
                    System.out.println("\nThe number is not a valid current reaidng. Enter again!");
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
            while(flag);
        flag = false;
        //taking input of previous reading
        inputPreviousReadingLoop:
            do
            {
                System.out.println("\nEnter a previous reading:- ");
                try
                {
                    previousReadings = Integer.parseInt(keyboard.readLine());
                    flag = false;
                }
                catch (Exception e)
                {
                    System.out.println("\nInvalid input! Enter again!");
                    flag = true;
                    continue inputPreviousReadingLoop;
                }
                //checking for positive integer
                if(previousReadings >= 0 && previousReadings <= presentReadings)
                {
                    flag = false;
                }
                else
                {
                    System.out.println("\nThe number is not a valid previous reaidng. Enter again!");
                    flag = true;
                }
            }
            while(flag);
        //displaying results
        System.out.println("\n*************************************************************************************");
        System.out.println("Your Electricity Bill:-");
        System.out.println("*************************************************************************************");
        System.out.println("Consumer No. \t Name \t \t \t \t Units Consumed \t Amount");
        System.out.println(consumer + " \t " + name + " \t \t " + (presentReadings - previousReadings) + "\t \t \t "+ formatter.format(user.cal(presentReadings - previousReadings)));
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
2.  int                 n                   To act as a parameter for units consumed in cal() function.
3.  NumberFormat        formatter           To access the currency format editor in NumberFormat.
4.  int                 presentReadings     To store the current readings from user.
5.  int                 previousReadings    To store the previous readings from user.
6.  String              name                To store the consumer name from user.
7.  long                consumer            To store the consumer id from user.
8.  assignment15        user                To access the cal() method in main() function.
9.  boolean             flag                To flag out when an error in input.

*/
