/*
Write a program to enter three angles of a triangle and check whether Triangle is possible or not. If possible then display whether it is an Acute angled triangle a Right angled triangle or an Obtuse angled triangle otherwise, display triangle is not possible.
 */




//importing required libraries
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//class begins
public class assignment17
{
    //main begins
    public static void main(String args[]) throws IOException
    {
        //declaring required objects and variables
        double a1 = 0;
        double a2 = 0;
        double a3 = 0;
        double angleSum = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        //taking input for angle 1
        inputloop:
        do
        {
            try
            {   
                System.out.println("\nEnter first angle (in degrees): ");
                a1 = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
        }
        while(flag);
        flag = false;
        //taking input for angle 2
        inputloop:
        do
        {
            try
            {   
                System.out.println("\nEnter second angle (in degrees): ");
                a2 = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
        }
        while(flag);
        flag = false;
        //taking input for angle 3
        inputloop:
        do
        {
            try
            {   
                System.out.println("\nEnter third angle (in degrees): ");
                a3 = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
        }
        while(flag);
        angleSum = a1 + a2 + a3;
        //checking if triangle is possible
        if (angleSum == 180 && a1 > 0 && a2 > 0 && a3 > 0) 
        {
            //displaying the type of triangle
            if (a1 < 90 && a2 < 90 && a3 < 90) 
            {
                System.out.println("\nIt is an Acute-angled Triangle");
            }
            else if (a1 == 90 || a2 == 90 || a3 == 90) 
            {
                System.out.println("\nIt is a Right-angled Triangle");
            }
            else 
            {
                System.out.println("\nIt is an Obtuse-angled Triangle");
            }
        }
        else 
        {
            System.out.println("\nTriangle not possible");
        }
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
2.  double              a1                  To store the first angle.
3.  Exception           e                   To catch the exception in input for first angle.
4.  double              a2                  To store the second angle.
5.  Exception           e                   To catch the exception in input for second angle.
6.  double              a3                  To store the third angle.
7.  Exception           e                   To catch the exception in input for third angle.
8.  boolean             flag                To flag out when an error in input.
9.  double              angleSum            To store the sum of the angles.
*/